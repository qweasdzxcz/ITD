package Controlador;

import Modelo.CategoriaDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Vista.Principal;
import static Vista.Principal.*;
import Vista.Producto.editProducto;
import Vista.Producto.formProducto;
import Vista.Ventas.BusquedaProducto;
import static Vista.Ventas.BusquedaProducto.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controlador_NuevaVenta implements ActionListener {

    private Principal principal;
    private BusquedaProducto busquedaPro;
    Producto producto = new Producto();
    ProductoDAO productoDAO = new ProductoDAO();

    DefaultTableModel tablaNuevaV = new DefaultTableModel();
    DefaultTableModel tablaBusquedaProducto = new DefaultTableModel();

    int objVenta = 0;

    public Controlador_NuevaVenta(Principal principal, BusquedaProducto busquedaPro) {
        this.principal = principal;
        this.busquedaPro = busquedaPro;
        principal.btn_nuevasVentas.addActionListener(this);
        principal.btn_buscarProducto.addActionListener(this);
        principal.btn_buscarCliente.addActionListener(this);
        principal.btn_generarVenta.addActionListener(this);
        principal.btn_agregarTabla.addActionListener(this);
        busquedaPro.btn_agregar.addActionListener(this);
        // listarProducto(busquedaProductoTabla);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == principal.btn_nuevasVentas) {
            principal.tabed.setSelectedComponent(panel_nuevasVentas);
            listarProducto(principal.productoTabla);
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
}
