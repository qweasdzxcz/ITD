package Controlador;

import Modelo.Categoria;
import Modelo.CategoriaDAO;
import Modelo.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.Principal;
import static Vista.Principal.*;
import Vista.Usuario.editUsuario;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Controlador_Categoria implements ActionListener {
    
    private final Principal principal;
    Categoria categoria = new Categoria();
    CategoriaDAO categoriaDAO = new CategoriaDAO();
    DefaultTableModel tablaC = new DefaultTableModel();
    
    public Controlador_Categoria(Principal principal) {
        this.principal = principal;
        principal.btn_categorias.addActionListener(this);
        principal.btn_registrarCategoria.addActionListener(this);
        principal.btn_actualizarCategoria.addActionListener(this);
        principal.btn_editarCategoria.addActionListener(this);
        principal.btn_eliminarCategoria.addActionListener(this);
        ocultarErrores();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == principal.btn_registrarCategoria) {
            registrarCategoria();
        }
        if (e.getSource() == principal.btn_categorias) {
            principal.tabed.setSelectedComponent(panel_categorias);
            limpiarTablaCategoria();
            listarCategoria(principal.categoriaTabla);
        }
        if (e.getSource() == principal.btn_eliminarCategoria) {
            eliminarCategoria();
        }
        if (e.getSource() == principal.btn_editarCategoria) {
            editarCategoria();
        }
        if (e.getSource() == principal.btn_actualizarCategoria) {
            actualizarCategoria();
        }
    }
    
    public void limpiarCampos() {
        txt_nombreCat.setText("");
        cbx_estadoCat.setSelectedIndex(-1);
        lbl_idCategoria.setText("");
    }
    
    public void ocultarErrores() {
        error_estadoCat.setVisible(false);
        error_nombreCat.setVisible(false);
    }
    
    public boolean validar(JTextField txt, JLabel lbl, String opcion) {
        if (txt.getText().isEmpty() || txt.getText().isBlank()) {
            lbl.setVisible(true);
            lbl.setText("Campo obligatorio");
            return false;
        }
        if (categoriaDAO.validarNombre(txt.getText()) > 0 && opcion.equals("R")) {
            lbl.setVisible(true);
            lbl.setText("Esta registrado");
            return false;
        }
        lbl.setVisible(false);
        return true;
    }
    
    public boolean validarCbx(JComboBox cbx, JLabel lbl) {
        if (cbx.getSelectedIndex() < 0) {
            lbl.setVisible(true);
            lbl.setText("Seleccione un estado");
            return false;
        }
        lbl.setVisible(false);
        return true;
    }
    
    public void registrarCategoria() {
        if (validar(txt_nombreCat, error_nombreCat, "R") != false && validarCbx(cbx_estadoCat, error_estadoCat) != false) {
            categoria.setNombre(txt_nombreCat.getText());
            categoria.setEstado(cbx_estadoCat.getSelectedItem().toString());
            categoriaDAO.agregarCategoria(categoria);
            JOptionPane.showMessageDialog(null, "guardado");
            limpiarCampos();
            ocultarErrores();
            limpiarTablaCategoria();
            listarCategoria(categoriaTabla);
        }
    }
    
    public void listarCategoria(JTable tabla) {
        List<Categoria> listaC = categoriaDAO.listarCategoria();
        tablaC = (DefaultTableModel) tabla.getModel();
        Object[] obj = new Object[3];
        for (int i = 0; i < listaC.size(); i++) {
            obj[0] = listaC.get(i).getId();
            obj[1] = listaC.get(i).getNombre();
            obj[2] = listaC.get(i).getEstado();
            tablaC.addRow(obj);
        }
        tabla.setModel(tablaC);
    }
    
    public void limpiarTablaCategoria() {
        for (int i = 0; i < tablaC.getRowCount(); i++) {
            tablaC.removeRow(i);
            i = i - 1;
        }
    }
    
    public void eliminarCategoria() {
        int fila = principal.categoriaTabla.getSelectedRow();
        int pregunta = JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR ?");
        if (pregunta == 0) {
            int id = Integer.parseInt(principal.categoriaTabla.getValueAt(fila, 0).toString());
            categoriaDAO.eliminarCategoria(id);
            limpiarTablaCategoria();
            listarCategoria(principal.categoriaTabla);
        }
    }
    
    public void editarCategoria() {
        int fila = principal.categoriaTabla.getSelectedRow();
        lbl_idCategoria.setText(categoriaTabla.getValueAt(fila, 0).toString());
        txt_nombreCat.setText(categoriaTabla.getValueAt(fila, 1).toString());
        cbx_estadoCat.setSelectedItem(categoriaTabla.getValueAt(fila, 2).toString());
        ocultarErrores();
    }
    
    public void actualizarCategoria() {
        if (validar(txt_nombreCat, error_nombreCat, "A") != false && validarCbx(cbx_estadoCat, error_estadoCat) != false) {
            categoria.setNombre(txt_nombreCat.getText());
            categoria.setEstado(cbx_estadoCat.getSelectedItem().toString());
            categoria.setId(Integer.parseInt(lbl_idCategoria.getText()));
            categoriaDAO.actualizarCategoria(categoria);
            JOptionPane.showMessageDialog(null, "actualizado");
            limpiarCampos();
            ocultarErrores();
            limpiarTablaCategoria();
            listarCategoria(categoriaTabla);
        }
    }
}
