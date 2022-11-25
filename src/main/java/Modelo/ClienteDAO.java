package Modelo;

import Utilidades.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {
   
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    int respuesta;
    boolean rpta;
    
    
    //AGREGAR USUARIO
    public int agregarCliente(Cliente cli) {
        String sql = "insert into cliente(nombre,apellidoP,apellidoM,celular,direccion) values(?,?,?,?,?);";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getApellidoP());
            ps.setString(3, cli.getApellidoM());
            ps.setString(4,cli.getCelular() );
            ps.setString(5, cli.getDireccion());

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return respuesta;
    }

     //LISTAR 
    public List listarCliente() {
        String sql = "select * from cliente";
        List<Cliente> lista = new ArrayList();
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();

                c.setId(rs.getInt("id_cliente"));
                c.setNombre(rs.getString("nombre"));
                c.setApellidoP(rs.getString("apellidoP"));
                c.setApellidoM(rs.getString("apellidoM"));
                c.setCelular(rs.getString("celular"));
                c.setDireccion(rs.getString("direccion"));
                c.setEstado(rs.getString("estado"));
                lista.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }

    //ELIMINAR
    public boolean eliminarCliente(int id) {
        String sql = "delete from cliente where id_cliente= ?";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    //ACTUALIZAR
    public int actualizarCliente(Cliente cli) {
        String sql = "update cliente set nombre=?,apellidoP=?,apellidoM=?,celular=?,direccion=?,estado=? where id_cliente=?";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getApellidoP());
            ps.setString(3, cli.getApellidoM());
            ps.setString(4,cli.getCelular() );
            ps.setString(5, cli.getDireccion());
            ps.setString(5, cli.getEstado());
            ps.setInt(5, cli.getId());
            
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
