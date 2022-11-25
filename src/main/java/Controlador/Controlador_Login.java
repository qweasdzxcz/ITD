package Controlador;

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import Vista.Login;
import static Vista.Login.*;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Utilidades.Encriptar;
import Vista.Cliente.editCliente;
import Vista.Cliente.formCliente;
import Vista.Producto.editProducto;
import Vista.Producto.formProducto;
import Vista.Usuario.editUsuario;
import Vista.Usuario.formUsuario;
import Vista.Ventas.BusquedaCliente;
import Vista.Ventas.BusquedaProducto;

public class Controlador_Login implements ActionListener {

    public static Login login;
    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();

    public Controlador_Login(Login login) {
        this.login = login;
        login.btn_ingresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login.btn_ingresar) {
            ingresar();
        }
    }

    public void ocultarErrores() {
        error_username.setVisible(false);
        error_password.setVisible(false);
        error_ingresar.setVisible(false);
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

    public void ingresar() {
        if (validar(txt_username, error_username) != false && validar(txt_password, error_password)) {
            String encriptado = Encriptar.sha1(txt_password.getText());
            usuario = usuarioDAO.validarIngreso(txt_username.getText(), encriptado);
            //boolean rpta = usuarioDAO.prueba(txt_username.getText(), encriptado);
            //System.out.println(rpta);
            if (usuario.getUsername() == null && usuario.getPassword() == null) {
                error_ingresar.setVisible(true);
                error_ingresar.setText("Usuario o password incorrecto");

            } else {
                Principal p = new Principal();
                formUsuario f = new formUsuario(new javax.swing.JFrame(), true);
                editUsuario e = new editUsuario(new javax.swing.JFrame(), true);
                formProducto fp = new formProducto(new javax.swing.JFrame(), true);
                editProducto ep = new editProducto(new javax.swing.JFrame(), true);
                BusquedaProducto busProducto = new BusquedaProducto(new javax.swing.JFrame(), true);
                BusquedaCliente busCliente = new BusquedaCliente(new javax.swing.JFrame(), true);
                formCliente fc = new formCliente(new javax.swing.JFrame(), true);
                editCliente ec = new editCliente(new javax.swing.JFrame(), true);
                
                Controlador_Usuario cu = new Controlador_Usuario(p, f, e);
                Controlador_Categoria cc = new Controlador_Categoria(p);
                Controlador_Producto cp = new Controlador_Producto(p, fp, ep);
                Controlador_Cliente ccli = new Controlador_Cliente(p, fc, ec);
                Controlador_NuevaVenta cnv = new Controlador_NuevaVenta(p, busProducto, busCliente);
                Controlador_Ventas cv = new Controlador_Ventas(p);
                cc.ocultarErrores();
                cu.ocultarErrores();
                cp.ocultarErrores();
                //cp.llenarCategoria();
                p.setVisible(true);
                

                String username = usuario.getUsername();
                String rol = usuario.getRol();

                Principal.lbl_datos.setText(username + " || " + rol);

                login.dispose();
            }
        }
    }
}
