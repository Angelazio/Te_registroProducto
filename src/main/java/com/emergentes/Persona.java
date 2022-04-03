

package com.emergentes;
public class Persona {
    private String nombre;
    private String producto;
    private String cliente;
    private String precio;
    private String categoria;

    public String getNombre() {
        return nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public Persona(){
    
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setExistencia(String cliente) {
        this.cliente = cliente;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
}

