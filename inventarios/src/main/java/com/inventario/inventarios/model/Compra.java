package com.inventario.inventarios.model;

import java.io.Serializable;

public class Compra implements Serializable {
    private Producto producto;
    private String proveedorF;
    private double subtotal;
    private double iva; 
    private double total;
    private int cantidad;
    private int factura;

    public Compra(Producto producto, String proveedorF, int cantidad, double subtotal, double iva, double total) {
        this.producto = producto;
        this.proveedorF = proveedorF;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }


}
