package Controlador;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Vista.Cliente.editCliente;
import Vista.Cliente.formCliente;
import static Vista.Cliente.formCliente.*;
import Vista.Principal;
import static Vista.Principal.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class Controlador_Cliente implements ActionListener{
    
    private Principal principal;
    private formCliente formCliente;
    private editCliente edirCliente;
    Cliente cliente = new Cliente();
    ClienteDAO clienteDAO = new ClienteDAO();
    DefaultTableModel tablaC = new DefaultTableModel();
    
    public Controlador_Cliente(Principal principal, formCliente formCliente, editCliente edirCliente) {
        this.principal = principal;
        this.formCliente = formCliente;
        this.edirCliente = edirCliente;
         this.formCliente.btn_registrar.addActionListener(this);
        this.principal.btn_clientes.addActionListener(this);
        this.principal.btn_nuevoCliente.addActionListener(this);
        
        this.principal.btn_editarCliente.addActionListener(this);
        this.principal.btn_eliminarCliente.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == formCliente.btn_registrar) {
            
        }
        if (e.getSource() == principal.btn_nuevoCliente) {
            formCliente.setVisible(true);
            
        }
         if (e.getSource() == principal.btn_clientes) {
            principal.tabed.setSelectedComponent(panel_clientes);
            
        }
    }
    
}
