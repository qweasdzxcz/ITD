package Modelo;

import Utilidades.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    int respuesta;

    public int agregarCategoria(Categoria cat) {
        String sql = "insert into categoria(nombre_cat) values(?);";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, cat.getNombre());

            ps.executeUpdate();

        } catch (Exception e) {
        }
        return respuesta;
    }

    public int validarNombre(String nombre) {
        String sql = "select count(id_categoria) from categoria where nombre_cat= ?";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return 1;
        }
    }

    public List listarCategoria() {
        String sql = "select * from categoria";
        List<Categoria> lista = new ArrayList<>();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Categoria cat = new Categoria();

                cat.setId(rs.getInt("id_categoria"));
                cat.setNombre(rs.getString("nombre_cat"));
                cat.setEstado(rs.getString("estado"));

                lista.add(cat);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
     public List llenarCbxCategoria() {
        String sql = "select * from categoria where estado = 'Activo'";
        List<Categoria> lista = new ArrayList<>();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Categoria cat = new Categoria();

                cat.setId(rs.getInt("id_categoria"));
                cat.setNombre(rs.getString("nombre_cat"));
                cat.setEstado(rs.getString("estado"));

                lista.add(cat);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public boolean eliminarCategoria(int id) {
        String sql = "delete from categoria where id_categoria = ?";
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

    public int actualizarCategoria(Categoria cat) {
        String sql = "update categoria set nombre_cat=?,estado=? where id_categoria=?";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, cat.getNombre());
            ps.setString(2, cat.getEstado());
            ps.setInt(3, cat.getId());

            ps.executeUpdate();
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return respuesta;
    }
}
