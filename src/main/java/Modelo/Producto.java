package Modelo;

public class Producto {

    int id;
    String nombre;
    String descripcion;
    int cantidad;
    double precio;
    String estado;
    int id_categoria;
    String nomCategoria;

    public Producto() {
    }

    public Producto(int id, String nombre, String descripcion, int cantidad, double precio, String estado, int id_categoria, String nomCategoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
        this.id_categoria = id_categoria;
        this.nomCategoria = nomCategoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }


}
