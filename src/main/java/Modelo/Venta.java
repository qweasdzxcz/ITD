
package Modelo;


public class Venta {
    
    private int id_venta;
    private int id_usuario;
    private int id_cliente;  
    private double monto;
    private String fecha;

    public Venta() {
    }

    public Venta(int id_venta, int id_usuario, int id_cliente, double monto, String fecha) {
        this.id_venta = id_venta;
        this.id_usuario = id_usuario;
        this.id_cliente = id_cliente;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
