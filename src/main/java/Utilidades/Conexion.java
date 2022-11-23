package Utilidades;

import java.sql.*;

public class Conexion {

    public static final String URL = "jdbc:mysql://localhost:3306/chosita_v2";
    public static final String USER = "root";
    public static final String CLAVE = "qwe12345";

    public static Connection getConnection() {
        Connection cn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            //System.out.println("se conecto");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("no se conecto");
        }
        return cn;
    }

    public static void main(String[] args) {

        getConnection();

    }

}
