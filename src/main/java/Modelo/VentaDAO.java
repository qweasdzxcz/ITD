package Modelo;

import Utilidades.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VentaDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    int respuesta;
    boolean rpta;

    public int grabarVentas(Venta ve) {
        int rpta = 0;
        String sql = "insert into nueva_venta(id_usuario,id_cliente,monto) values (?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ve.getId_usuario());
            ps.setInt(2, ve.getId_cliente());
            ps.setDouble(3, ve.getMonto());

            ps.execute();
            rpta = 1;
        } catch (SQLException e) {
            System.out.println(e.toString());
            rpta = 0;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
                rpta = 0;
            }
        }
        return rpta;
    }

    public int ID_venta() {
        int idVenta = 0;
        String sql = "select max(id_venta) from nueva_venta";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                idVenta = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return idVenta;
    }

    public boolean actualizarStock(int cantidad, int id) {
        String sql = "UPDATE producto set cantidad=? where id_producto=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cantidad);
            ps.setInt(2, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public List listarVenta() {
        String sql = "select * from nueva_venta";
        List<Venta> lista = new ArrayList<>();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Venta vent = new Venta();
                vent.setId_venta(rs.getInt("id_venta"));
                vent.setId_usuario(rs.getInt("id_empleado"));
                vent.setId_cliente(rs.getInt("id_cliente"));
                vent.setFecha(rs.getString("fechaVenta"));
                vent.setMonto(rs.getDouble("monto"));
                lista.add(vent);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return lista;
    }
}
