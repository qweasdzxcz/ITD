package Modelo;

import Utilidades.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    int respuesta;
    boolean rpta;

    public int agregarProducto(Producto pro) {
        String sql = "insert into producto(nombre,descripcion,cantidad,precio,id_categoria) values(?,?,?,?,?);";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, pro.getNombre());
            ps.setString(2, pro.getDescripcion());
            ps.setInt(3, pro.getCantidad());
            ps.setDouble(4, pro.getPrecio());
            ps.setInt(5, pro.getId_categoria());

            ps.executeUpdate();

        } catch (Exception e) {
        }
        return respuesta;
    }

    public List listarProducto() {
        String sql = "select p.id_producto,p.nombre,p.descripcion,p.cantidad,p.precio,c.nombre_cat,p.estado from producto p inner join categoria c on p.id_categoria=c.id_categoria";
        List<Producto> lista = new ArrayList<>();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto pro = new Producto();

                pro.setId(rs.getInt("id_producto"));
                pro.setNombre(rs.getString("nombre"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setNomCategoria(rs.getString("nombre_cat"));
                pro.setPrecio(rs.getDouble("precio"));
                pro.setCantidad(rs.getInt("cantidad"));
                pro.setEstado(rs.getString("estado"));
                lista.add(pro);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public boolean eliminarProducto(int id) {
        String sql = "delete from producto where id_producto = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public Producto buscarProducto(int id) {
        Producto p = new Producto();
        String sql = "select * from producto where id_producto=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setCantidad(rs.getInt(4));
                p.setPrecio(rs.getDouble(5));

            }
        } catch (Exception e) {
        }
        return p;
    }

    public int actualizarProducto(Producto pr) {
        String sql = "update producto set nombre=?,descripcion=?,cantidad=?,precio=? where id_producto=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, pr.getNombre());
            ps.setString(2, pr.getDescripcion());
            ps.setInt(3, pr.getCantidad());
            ps.setDouble(4, pr.getPrecio());
            ps.setInt(5, pr.getId());

            ps.executeUpdate();

        } catch (Exception e) {
        }
        return respuesta;
    }

    //BUSCAR PRODCUTO POR ID O NOMBRE SEGUN LO QUE INGRESEMOS
    public List buscarSegunId_Producto(String filtro, String valor) {
        String sql = "select * from producto where " + filtro + " like '%" + valor + "%'";
        List<Producto> lista = new ArrayList<>();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto pro = new Producto();

                pro.setId(rs.getInt("id_producto"));
                pro.setNombre(rs.getString("nombre"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setCantidad(rs.getInt("cantidad"));
                pro.setPrecio(rs.getDouble("precio"));

                lista.add(pro);
            }
        } catch (Exception e) {
        }
        return lista;
    }

}
