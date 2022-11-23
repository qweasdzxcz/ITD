package Modelo;

import Utilidades.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    int respuesta;
    boolean rpta;

    //INGRESAR
    public Usuario validarIngreso(String username, String password) {
        Usuario u = new Usuario();
        String sql = "SELECT * FROM usuario WHERE username=? AND password=?";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                u.setId(rs.getInt("id_usuario"));
                u.setNombre(rs.getString("nombre"));
                u.setApellidoP(rs.getString("apellido_p"));
                u.setApellidoM(rs.getString("apellido_m"));
                u.setDni(rs.getString("dni"));
                u.setCelular(rs.getString("celular"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setRol(rs.getString("rol"));
                u.setEstado(rs.getString("estado"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return u;
    }

    //AGREGAR USUARIO
    public int agregarUsuario(Usuario em) {
        String sql = "insert into usuario(nombre,apellido_p,apellido_m,dni,celular,username,password,rol) values(?,?,?,?,?,?,?,?);";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, em.getNombre());
            ps.setString(2, em.getApellidoP());
            ps.setString(3, em.getApellidoM());
            ps.setString(4, em.getDni());
            ps.setString(5, em.getCelular());
            ps.setString(6, em.getUsername());
            ps.setString(7, em.getPassword());
            ps.setString(8, em.getRol());

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return respuesta;
    }

    //validar 2
    public boolean validarDuplicado(String valor, String columna) {
        boolean existe = false;
        String sql = "select count(id_usuleado) from usuario where " + columna + " like '%" + valor + "%'";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, columna);
            rs = ps.executeQuery();
            if (rs.next()) {
                if (rs.getInt(1) > 0) {
                    return existe = true;
                }
            }
            return existe;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return existe;
        }
    }

    //VALIDAR DNI
    public int validarDni(String dni) {
        String sql = "select count(id_usuario) from usuario where dni = ?";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
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

    //VALIDAR CELULAR
    public int validarCelular(String celular) {
        String sql = "select count(id_usuario) from usuario where celular = ?";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, celular);
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

    //VALIDAR USERNAME
    public int validarUsername(String username) {
        String sql = "select count(id_usuario) from usuario where username = ?";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
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

    //LISTAR 
    public List listarUsuario() {
        String sql = "select * from usuario";
        List<Usuario> lista = new ArrayList();
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario u = new Usuario();

                u.setId(rs.getInt("id_usuario"));
                u.setNombre(rs.getString("nombre"));
                u.setApellidoP(rs.getString("apellido_p"));
                u.setApellidoM(rs.getString("apellido_m"));
                u.setDni(rs.getString("dni"));
                u.setCelular(rs.getString("celular"));
                u.setUsername(rs.getString("username"));
                //em.setPassword(rs.getString("password"));
                u.setRol(rs.getString("rol"));
                u.setEstado(rs.getString("estado"));
                lista.add(u);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }

    //ELIMINAR
    public boolean eliminarUsuario(int id) {
        String sql = "delete from usuario where id_usuario= ?";
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
    public int actualizarUsuario(Usuario em) {
        String sql = "update usuario set nombre=?,apellido_p=?,apellido_m=?,dni=?,celular=?,rol=?,estado=? where id_usuario=?";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, em.getNombre());
            ps.setString(2, em.getApellidoP());
            ps.setString(3, em.getApellidoM());
            ps.setString(4, em.getDni());
            ps.setString(5, em.getCelular());
            ps.setString(6, em.getRol());
            ps.setString(7, em.getEstado());
            ps.setInt(8, em.getId());
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
