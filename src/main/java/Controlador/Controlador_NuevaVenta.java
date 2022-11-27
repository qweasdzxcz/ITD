package Controlador;

import Modelo.CategoriaDAO;
import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Vista.Principal;
import static Vista.Principal.*;
import Vista.Ventas.BusquedaCliente;
import static Vista.Ventas.BusquedaCliente.*;
import Vista.Ventas.BusquedaProducto;
import static Vista.Ventas.BusquedaProducto.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controlador_NuevaVenta implements ActionListener {

    private final Principal principal;
    private final BusquedaProducto busquedaPro;
    private final BusquedaCliente busquedaCli;

    Producto producto = new Producto();
    ProductoDAO productoDAO = new ProductoDAO();

    Cliente cliente = new Cliente();
    ClienteDAO clienteDAO = new ClienteDAO();

    DefaultTableModel tablaNuevaV = new DefaultTableModel();
    DefaultTableModel tablaBusquedaProducto = new DefaultTableModel();
    DefaultTableModel tablaBC = new DefaultTableModel();

    int objVenta = 0;

    public Controlador_NuevaVenta(Principal principal, BusquedaProducto busquedaPro, BusquedaCliente busquedaCli) {
        this.principal = principal;
        this.busquedaPro = busquedaPro;
        this.busquedaCli = busquedaCli;
        principal.btn_nuevasVentas.addActionListener(this);
        principal.btn_buscarProducto.addActionListener(this);
        principal.btn_buscarCliente.addActionListener(this);
        principal.btn_generarVenta.addActionListener(this);
        principal.btn_agregarTabla.addActionListener(this);
        busquedaPro.btn_agregar.addActionListener(this);
        // listarProducto(busquedaProductoTabla);
        listarCliente(busquedaClienteTabla);
        //buscarCliente();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == principal.btn_nuevasVentas) {
            principal.tabed.setSelectedComponent(panel_nuevasVentas);
            //listarProducto(principal.productoTabla);
        }
        if (e.getSource() == principal.btn_buscarProducto) {
            busquedaPro.setVisible(true);
        }
        if (e.getSource() == busquedaPro.btn_agregar) {
            pasarDatos();
        }
        if (e.getSource() == principal.btn_agregarTabla) {
            agregarTabla();
        }
        if (e.getSource() == principal.btn_buscarCliente) {
            listarCliente(busquedaClienteTabla);
            
            busquedaCli.setVisible(true);
            
        }
        if (e.getSource() == principal.btn_generarVenta) {

        }

    }

    public void limpiarTablaBusquedaProducto() {
        for (int i = 0; i < tablaBusquedaProducto.getRowCount(); i++) {
            tablaBusquedaProducto.removeRow(i);
            i = i - 1;
        }
    }

    public void listarProducto(JTable tabla) {
        limpiarTablaBusquedaProducto();
        List<Producto> listaP = productoDAO.listarProducto();
        System.out.println("lista funciona");
        if (listaP != null) {
            tablaBusquedaProducto = (DefaultTableModel) tabla.getModel();
            Object[] obj = new Object[6];
            for (int i = 0; i < listaP.size(); i++) {
                obj[0] = listaP.get(i).getId();
                obj[1] = listaP.get(i).getNombre();
                obj[2] = listaP.get(i).getDescripcion();
                obj[3] = listaP.get(i).getNomCategoria();
                obj[4] = listaP.get(i).getPrecio();
                obj[5] = listaP.get(i).getCantidad();
                //System.out.println(obj[0] + "\n" + obj[1] + "\n" + obj[2] + "\n" + obj[3] + "\n" + obj[4] + "\n" + obj[5] + "\n" + obj[6] + "\n");
                tablaBusquedaProducto.addRow(obj);
            }
            tabla.setModel(tablaBusquedaProducto);
        } else {
            System.out.println("vacio");
        }

    }

    public void pasarDatos() {
        int fila = busquedaPro.busquedaProductoTabla.getSelectedRow();
        principal.lbl_idProducto.setText(busquedaProductoTabla.getValueAt(fila, 0).toString());
        principal.lbl_nombre.setText(busquedaProductoTabla.getValueAt(fila, 1).toString());
        principal.lbl_precio.setText(busquedaProductoTabla.getValueAt(fila, 4).toString());
        principal.lbl_stock.setText(busquedaProductoTabla.getValueAt(fila, 5).toString());
        busquedaPro.setVisible(false);
        principal.txt_cantidad.requestFocus();
    }

    public void limpiarCamposNuevaVenta() {
        lbl_nombre.setText(null);
        lbl_idProducto.setText(null);
        txt_cantidad.setText(null);
        lbl_stock.setText(null);
        lbl_precio.setText(null);
        lbl_cliente.setText(null);
    }

    public void agregarTabla() {
        if (!"".equals(lbl_nombre) && !"".equals(txt_cantidad.getText()) && !"".equals(lbl_stock) && !"".equals(lbl_precio)) {

            String idV = lbl_idProducto.getText();
            String nombreV = lbl_nombre.getText();
            int cantidadV = Integer.parseInt(txt_cantidad.getText());
            int stockV = Integer.parseInt(lbl_stock.getText());
            double precioV = Double.parseDouble(lbl_precio.getText());
            double total = cantidadV * precioV;

            if (stockV >= cantidadV) {
                objVenta++;
                tablaNuevaV = (DefaultTableModel) nuevaVentaTabla.getModel();
                //no se repitan productos
                for (int i = 0; i < nuevaVentaTabla.getRowCount(); i++) {
                    if (nuevaVentaTabla.getValueAt(i, 1).equals(lbl_nombre.getText())) {
                        JOptionPane.showMessageDialog(null, "EL PRODUCTO SE REPITE, MODIFIQUE LA CANTIDAD");
                        return;
                    }
                }
                ArrayList listaVenta = new ArrayList();
                listaVenta.add(objVenta);
                listaVenta.add(idV);
                listaVenta.add(nombreV);
                listaVenta.add(precioV);
                listaVenta.add(cantidadV);
                listaVenta.add(total);

                Object[] NV = new Object[5];
                NV[0] = listaVenta.get(0);
                NV[1] = listaVenta.get(2);
                NV[2] = listaVenta.get(3);
                NV[3] = listaVenta.get(4);
                NV[4] = listaVenta.get(5);

                tablaNuevaV.addRow(NV);
                nuevaVentaTabla.setModel(tablaNuevaV);

                limpiarCamposNuevaVenta();

                //TotalPagar();
            } else {
                JOptionPane.showMessageDialog(null, "NO DISPONIBLE , REABASTECER");
            }
        } else {
            JOptionPane.showMessageDialog(null, "INGRESE CANTIDAD");
        }
    }

    //*********************************************************
    public void listarCliente(JTable tabla) {
//        for (int i = 0; i < tablaBusquedaCliente.getRowCount(); i++) {
//            tablaBusquedaCliente.removeRow(i);
//            i = i - 1;
//        }
        List<Cliente> listaCli = clienteDAO.listarCliente();
        tablaBC = (DefaultTableModel) tabla.getModel();
        Object[] obj = new Object[5];
        for (int i = 0; i < listaCli.size(); i++) {
            obj[0] = listaCli.get(i).getId();
            obj[1] = listaCli.get(i).getNombre();
            obj[2] = listaCli.get(i).getApellidoP();
            obj[3] = listaCli.get(i).getApellidoM();
            obj[4] = listaCli.get(i).getCelular();
            
            tablaBC.addRow(obj);
            System.out.println(obj[0] + "\n" + obj[1] + "\n" + obj[2] + "\n" + obj[3] + "\n" + obj[4]);
        }
        tabla.setModel(tablaBC);
    }
    //*********************************************************
    public void tablaDatosCliente(JTable tabla) {
        for (int i = 0; i < tablaBC.getRowCount(); i++) {
            tablaBC.removeRow(i);
            i = i - 1;
        }
        String valor = txt_buscarCliente.getText();
        List<Cliente> listaCli = clienteDAO.buscarCliente(valor);
        //System.out.println("filtro : " + filtro + "\n" + "valor : " + a);
        tablaBC = (DefaultTableModel) tabla.getModel();
        Object[] obj = new Object[6];
        for (int i = 0; i < listaCli.size(); i++) {
            obj[0] = listaCli.get(i).getId();
            obj[1] = listaCli.get(i).getNombre();
            obj[2] = listaCli.get(i).getApellidoP();
            obj[3] = listaCli.get(i).getApellidoM();
            obj[4] = listaCli.get(i).getCelular();
            obj[5] = listaCli.get(i).getEstado();
            tablaBC.addRow(obj);
            //System.out.println(obj[0] + "\n" + obj[1] + "\n" + obj[2] + "\n" + obj[3] + "\n" + obj[4] + "\n" + obj[5]);
        }
        tabla.setModel(tablaBC);
    }

    public void buscarCliente() {
        //BusquedaCliente busC = new BusquedaCliente(principal, true);
        KeyListener evento = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {              
                tablaDatosCliente(busquedaCli.busquedaClienteTabla);
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
        busquedaCli.txt_valorCliente.addKeyListener(evento);
    }
}
