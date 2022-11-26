package Controlador;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Vista.Cliente.editCliente;
import Vista.Cliente.formCliente;
import static Vista.Cliente.formCliente.*;
import Vista.Principal;
import static Vista.Principal.*;
import static Vista.Usuario.formUsuario.error_celular;
import static Vista.Usuario.formUsuario.error_dni;
import static Vista.Usuario.formUsuario.error_materno;
import static Vista.Usuario.formUsuario.error_nombre;
import static Vista.Usuario.formUsuario.error_paterno;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Controlador_Cliente implements ActionListener {

    Principal principal;
    formCliente formCliente;
    editCliente editCliente;
    Cliente cliente = new Cliente();
    ClienteDAO clienteDAO = new ClienteDAO();
    DefaultTableModel tablaC = new DefaultTableModel();

    public Controlador_Cliente(Principal principal, formCliente formCliente, editCliente editCliente) {
        this.principal = principal;
        this.formCliente = formCliente;
        this.editCliente = editCliente;
        this.formCliente.btn_registrarCliente.addActionListener(this);
        this.principal.btn_clientes.addActionListener(this);
        this.principal.btn_nuevoCliente.addActionListener(this);
        this.principal.btn_registrarCategoria.addActionListener(this);
        this.principal.btn_editarCliente.addActionListener(this);
        this.principal.btn_eliminarCliente.addActionListener(this);
        this.editCliente.btn_actualizar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == formCliente.btn_registrarCliente) {
            registarCliente();
        }
        if (e.getSource() == principal.btn_nuevoCliente) {
            ocultarErrores();
            formCliente.setVisible(true);
            limpiarCampos();
        }
        if (e.getSource() == principal.btn_clientes) {
            principal.tabed.setSelectedComponent(panel_clientes);
            listarCliente(clienteTabla);
        }
        if (e.getSource() == principal.btn_eliminarCliente) {
            eliminarCliente();
        }
        if (e.getSource() == principal.btn_editarCliente) {
            editarCliente();
            ocultarErrores();
        }
        if (e.getSource() == editCliente.btn_actualizar) {
            actualizarCliente();
        }
    }

    public void ocultarErrores() {
        formCliente.error_nombreC.setVisible(false);
        formCliente.error_paternoC.setVisible(false);
        formCliente.error_maternoC.setVisible(false);
        formCliente.error_celularC.setVisible(false);
        editCliente.error_nombreC.setVisible(false);
        editCliente.error_paternoC.setVisible(false);
        editCliente.error_maternoC.setVisible(false);
        editCliente.error_celularC.setVisible(false);
        editCliente.error_estado.setVisible(false);
        editCliente.lbl_id.setVisible(false);
    }

    public void limpiarCampos() {
        formCliente.txt_nombreC.setText("");
        formCliente.txt_paternoC.setText("");
        formCliente.txt_maternoC.setText("");
        formCliente.txt_celularC.setText("");
        editCliente.txt_nombreC.setText("");
        editCliente.txt_paternoC.setText("");
        editCliente.txt_maternoC.setText("");
        editCliente.txt_celularC.setText("");
        editCliente.cbx_estado.setSelectedItem(-1);
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

    public boolean validarTamañoDuplicado(JTextField txt, JLabel lbl, int tamaño, String opcion) {
        if (txt.getText().isEmpty() || txt.getText().isBlank()) {
            lbl.setVisible(true);
            lbl.setText("Campo obligatorio");
            return false;
        }
        if (txt.getText().length() < tamaño) {
            lbl.setVisible(true);
            lbl.setText("El campo debe contener " + tamaño + " digitos");
            return false;
        }
        int v = clienteDAO.validarCelular(txt.getText());
        if (v > 0 && opcion.equals("R")) {
            lbl.setVisible(true);
            lbl.setText("Esta registrado, intente con otro");
            return false;
        }
        lbl.setVisible(false);
        return true;
    }

    public boolean validarCbx(JComboBox cbx, JLabel lbl) {
        if (cbx.getSelectedIndex() < 0) {
            lbl.setVisible(true);
            lbl.setText("Seleccione un rol");
            return false;
        }
        lbl.setVisible(false);
        return true;
    }

    public void registarCliente() {
        if (validar(txt_nombreC, error_nombreC) != false && validar(txt_paternoC, error_paternoC) != false
                && validar(txt_maternoC, error_maternoC) != false && validarTamañoDuplicado(txt_celularC, error_celularC, 9, "R") != false) {

            cliente.setNombre(txt_nombreC.getText());
            cliente.setApellidoP(txt_paternoC.getText());
            cliente.setApellidoM(txt_maternoC.getText());
            cliente.setCelular(txt_celularC.getText());
            clienteDAO.agregarCliente(cliente);
            JOptionPane.showMessageDialog(null, "cliente registrado");
            limpiarCampos();
            ocultarErrores();
            listarCliente(clienteTabla);
        }
    }

    public void listarCliente(JTable tabla) {
        limpiarTablaCliente();
        List<Cliente> listaCli = clienteDAO.listarCliente();
        tablaC = (DefaultTableModel) tabla.getModel();
        Object[] obj = new Object[6];
        for (int i = 0; i < listaCli.size(); i++) {
            obj[0] = listaCli.get(i).getId();
            obj[1] = listaCli.get(i).getNombre();
            obj[2] = listaCli.get(i).getApellidoP();
            obj[3] = listaCli.get(i).getApellidoM();
            obj[4] = listaCli.get(i).getCelular();
            obj[5] = listaCli.get(i).getEstado();
            tablaC.addRow(obj);
            //System.out.println(obj[0] + "\n" + obj[1] + "\n" + obj[2] + "\n" + obj[3] + "\n" + obj[4] + "\n" + obj[5]);
        }
        tabla.setModel(tablaC);
    }

    public void limpiarTablaCliente() {
        for (int i = 0; i < tablaC.getRowCount(); i++) {
            tablaC.removeRow(i);
            i = i - 1;
        }
    }

    public void eliminarCliente() {
        int fila = principal.clienteTabla.getSelectedRow();
        int pregunta = JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR ?");
        if (pregunta == 0) {
            int id = Integer.parseInt(principal.clienteTabla.getValueAt(fila, 0).toString());
            clienteDAO.eliminarCliente(id);
            listarCliente(principal.clienteTabla);
            JOptionPane.showMessageDialog(null, "cliente eliminado");
        }
    }

    public void editarCliente() {
        int fila = principal.clienteTabla.getSelectedRow();
        editCliente.lbl_id.setText(clienteTabla.getValueAt(fila, 0).toString());
        editCliente.txt_nombreC.setText(clienteTabla.getValueAt(fila, 1).toString());
        editCliente.txt_paternoC.setText(clienteTabla.getValueAt(fila, 2).toString());
        editCliente.txt_maternoC.setText(clienteTabla.getValueAt(fila, 3).toString());
        editCliente.txt_celularC.setText(clienteTabla.getValueAt(fila, 4).toString());
        editCliente.cbx_estado.setSelectedItem(clienteTabla.getValueAt(fila, 5).toString());
        editCliente.setVisible(true);
    }

    public void actualizarCliente() {
        if (validar(editCliente.txt_nombreC, editCliente.error_nombreC) != false && validar(editCliente.txt_paternoC, editCliente.error_paternoC) != false
                && validar(editCliente.txt_maternoC, editCliente.error_maternoC) != false && validarTamañoDuplicado(editCliente.txt_celularC, editCliente.error_celularC, 9, "A") != false
                && validarCbx(editCliente.cbx_estado, editCliente.error_estado) != false) {

            cliente.setNombre(editCliente.txt_nombreC.getText());
            cliente.setApellidoP(editCliente.txt_paternoC.getText());
            cliente.setApellidoM(editCliente.txt_maternoC.getText());
            cliente.setCelular(editCliente.txt_celularC.getText());
            cliente.setEstado(editCliente.cbx_estado.getSelectedItem().toString());
            cliente.setId(Integer.parseInt(editCliente.lbl_id.getText()));
            clienteDAO.actualizarCliente(cliente);
            editCliente.setVisible(false);
            JOptionPane.showMessageDialog(null, "cliente actualizado");
            limpiarCampos();
            ocultarErrores();
            listarCliente(clienteTabla);
        }
    }

    public void tablaDatos(JTable tabla) {
        limpiarTablaCliente();
        String valor = txt_buscarCliente.getText();
        List<Cliente> listaCli = clienteDAO.buscarCliente(valor);
        //System.out.println("filtro : " + filtro + "\n" + "valor : " + a);
        tablaC = (DefaultTableModel) tabla.getModel();
        Object[] obj = new Object[6];
        for (int i = 0; i < listaCli.size(); i++) {
            obj[0] = listaCli.get(i).getId();
            obj[1] = listaCli.get(i).getNombre();
            obj[2] = listaCli.get(i).getApellidoP();
            obj[3] = listaCli.get(i).getApellidoM();
            obj[4] = listaCli.get(i).getCelular();
            obj[5] = listaCli.get(i).getEstado();
            tablaC.addRow(obj);
            //System.out.println(obj[0] + "\n" + obj[1] + "\n" + obj[2] + "\n" + obj[3] + "\n" + obj[4] + "\n" + obj[5]);
        }
        tabla.setModel(tablaC);
    }

}
