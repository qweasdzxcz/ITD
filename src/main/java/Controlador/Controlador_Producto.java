package Controlador;

import Modelo.Categoria;
import Modelo.CategoriaDAO;
import Modelo.ComboBox;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Vista.Principal;
import static Vista.Principal.*;
import static Vista.Producto.editProducto.*;
import static Vista.Producto.formProducto.*;
import Vista.Producto.editProducto;
import Vista.Producto.formProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public final class Controlador_Producto implements ActionListener {

    private final Principal principal;
    private final formProducto formProducto;
    private final editProducto editProducto;
    Producto producto = new Producto();
    ProductoDAO productoDAO = new ProductoDAO();
    CategoriaDAO categoriaDAO = new CategoriaDAO();
    DefaultTableModel tablaP = new DefaultTableModel();
    
    public Controlador_Producto(Principal principal, formProducto formProducto, editProducto editProducto) {
        this.principal = principal;
        this.formProducto = formProducto;
        this.editProducto = editProducto;
        principal.btn_productos.addActionListener(this);
        principal.btn_nuevoProducto.addActionListener(this);
        principal.btn_editarProducto.addActionListener(this);
        principal.btn_eliminarProducto.addActionListener(this);
        formProducto.btn_registrar.addActionListener(this);
        llenarCategoria();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == principal.btn_productos) {
            principal.tabed.setSelectedComponent(panel_productos);
            
            listarProducto(principal.productoTabla);
        }
        if (e.getSource() == principal.btn_nuevoProducto) {
            formProducto.setVisible(true);
            ocultarErrores();
            limpiarCampos();
            llenarCategoria();
        }
        if (e.getSource() == formProducto.btn_registrar) {
            registrarProducto();
        }
    }

    public void ocultarErrores() {
        error_nombre.setVisible(false);
        error_precio.setVisible(false);
        error_stock.setVisible(false);
        error_categoria.setVisible(false);
    }

    public void limpiarCampos() {
        formProducto.txt_nombre.setText("");
        formProducto.txt_descrip.setText("");
        formProducto.cbx_categoria.setSelectedIndex(0);
        formProducto.txt_precio.setText("");
        formProducto.txt_stock.setText("");

    }

    public boolean validar(JTextField txt, JLabel lbl) {
        if (txt.getText().isEmpty() || txt.getText().isBlank()) {
            lbl.setVisible(true);
            lbl.setText("Campo obligatorio");
            return false;
        }
        lbl.setVisible(false);
        return true;
    }

    public boolean validarCbx(JComboBox cbx, JLabel lbl) {
        if (cbx.getSelectedIndex() < 0) {
            lbl.setVisible(true);
            lbl.setText("Seleccione una categoria");
            return false;
        }
        lbl.setVisible(false);
        return true;
    }

    public boolean validar123(JTextField txt, JLabel lbl, String tipo) {
        if (txt.getText().isEmpty() || txt.getText().isBlank()) {
            lbl.setVisible(true);
            lbl.setText("Campo obligatorio");
            return false;
        }
        switch (tipo) {
            case "num": {
                int valor = Integer.parseInt(txt.getText());
                if (valor <= 0) {
                    lbl.setVisible(true);
                    lbl.setText("Debe ser mayor a 0");
                    return false;
                }
                return true;
            }
            default: {

            }

        }
        lbl.setVisible(false);
        return true;
    }

    public void llenarCategoria() {
        formProducto.cbx_categoria.removeAllItems();
        List<Categoria> listaC = categoriaDAO.listarCategoria();
        for (int i = 0; i < listaC.size(); i++) {
            int id = listaC.get(i).getId();
            String nombre = listaC.get(i).getNombre();
            formProducto.cbx_categoria.addItem(new ComboBox(id, nombre));
        }

    }

    public void registrarProducto() {
        if (validar(formProducto.txt_nombre, formProducto.error_nombre) != false && validar123(formProducto.txt_precio, formProducto.error_precio, "num") && validar123(formProducto.txt_stock, formProducto.error_stock, "num")) {
            producto.setNombre(formProducto.txt_nombre.getText());
            producto.setDescripcion(formProducto.txt_descrip.getText());

            producto.setPrecio(Double.parseDouble(formProducto.txt_precio.getText()));
            producto.setCantidad(Integer.parseInt(formProducto.txt_stock.getText()));
            ComboBox obj = (ComboBox) formProducto.cbx_categoria.getSelectedItem();
            producto.setId_categoria(obj.getId());
            System.out.println(formProducto.txt_nombre.getText() + "\n" + formProducto.txt_descrip.getText() + "\n"
                    + formProducto.txt_precio.getText() + "\n" + formProducto.txt_stock.getText() + "\n" + obj.getId());
            productoDAO.agregarProducto(producto);
            JOptionPane.showMessageDialog(null, "Registrado");
            ocultarErrores();
            limpiarCampos();

        }
    }

    public void listarProducto(JTable tabla) {
        limpiarTablaProducto();
        List<Producto> listaP = productoDAO.listarProducto();
        if (listaP != null) {
            tablaP = (DefaultTableModel) tabla.getModel();
            Object[] obj = new Object[7];
            for (int i = 0; i < listaP.size(); i++) {
                obj[0] = listaP.get(i).getId();
                obj[1] = listaP.get(i).getNombre();
                obj[2] = listaP.get(i).getDescripcion();
                obj[3] = listaP.get(i).getNomCategoria();
                obj[4] = listaP.get(i).getPrecio();
                obj[5] = listaP.get(i).getCantidad();
                obj[6] = listaP.get(i).getEstado();
                //System.out.println(obj[0] + "\n" + obj[1] + "\n" + obj[2] + "\n" + obj[3] + "\n" + obj[4] + "\n" + obj[5] + "\n" + obj[6] + "\n");
                tablaP.addRow(obj);

            }
            tabla.setModel(tablaP);
        }else {
            System.out.println("vacio");
        }

    }

    public void limpiarTablaProducto() {
        for (int i = 0; i < tablaP.getRowCount(); i++) {
            tablaP.removeRow(i);
            i = i - 1;
        }
    }

    public void eliminarProducto() {
        int fila = principal.usuarioTabla.getSelectedRow();
        int pregunta = JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR ?");
        if (pregunta == 0) {
            int id = Integer.parseInt(principal.usuarioTabla.getValueAt(fila, 0).toString());
            productoDAO.eliminarProducto(id);
            limpiarTablaProducto();
            listarProducto(principal.productoTabla);
        }
    }

//    public void editarUsuario() {
//
//        int fila = principal.usuarioTabla.getSelectedRow();
//        editUsuario.lbl_id.setText(usuarioTabla.getValueAt(fila, 0).toString());
//        editUsuario.txt_nombre.setText(usuarioTabla.getValueAt(fila, 1).toString());
//        editUsuario.txt_paterno.setText(usuarioTabla.getValueAt(fila, 2).toString());
//        editUsuario.txt_materno.setText(usuarioTabla.getValueAt(fila, 3).toString());
//        editUsuario.txt_dni.setText(usuarioTabla.getValueAt(fila, 4).toString());
//        editUsuario.txt_celular.setText(usuarioTabla.getValueAt(fila, 5).toString());
//        editUsuario.cbx_rol.setSelectedItem(usuarioTabla.getValueAt(fila, 7).toString());
//        editUsuario.cbx_estado.setSelectedItem(usuarioTabla.getValueAt(fila, 8).toString());
//        editUsuario.setVisible(true);
//
//    }
//
//    public void actualizarUsuario() {
//        if (validar(editUsuario.txt_nombre, editUsuario.error_nombre) != false && validar(editUsuario.txt_paterno, editUsuario.error_paterno) != false && validar(editUsuario.txt_materno, editUsuario.error_materno) != false
//                && validarTamañoDuplicado(editUsuario.txt_dni, editUsuario.error_dni, 8, "dni", "A") != false && validarTamañoDuplicado(editUsuario.txt_celular, editUsuario.error_celular, 9, "celular", "A") != false
//                && validarCbx(editUsuario.cbx_rol, editUsuario.error_rol) != false && validarCbx(editUsuario.cbx_estado, editUsuario.error_estado) != false) {
//            usuario.setNombre(editUsuario.txt_nombre.getText());
//            usuario.setApellidoP(editUsuario.txt_paterno.getText());
//            usuario.setApellidoM(editUsuario.txt_materno.getText());
//            usuario.setDni(editUsuario.txt_dni.getText());
//            usuario.setCelular(editUsuario.txt_celular.getText());
//            usuario.setRol(editUsuario.cbx_rol.getSelectedItem().toString());
//            usuario.setEstado(editUsuario.cbx_estado.getSelectedItem().toString());
//            usuario.setId(Integer.parseInt(editUsuario.lbl_id.getText()));
//            usuarioDAO.actualizarUsuario(usuario);
//            JOptionPane.showMessageDialog(null, "actualizado");
//            limpiarCampos();
//            ocultarErrores();
//            limpiarTablaUsusario();
//            listarUsuario(usuarioTabla);
//        }
//    }
}
