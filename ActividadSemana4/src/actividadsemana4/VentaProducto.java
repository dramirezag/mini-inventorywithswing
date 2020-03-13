/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadsemana4;

/**
 *
 * @author p9ac00068
 */
public class VentaProducto extends Productos {
    
    private int numeroFactura;
    private int valorVenta;
    

    public VentaProducto() {
    }

    public VentaProducto(int identificacion, String nombre, int cantidad, int valor) {
        super(identificacion, nombre,cantidad, valor);
        this.numeroFactura = numeroFactura;
        this.valorVenta = valorVenta;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public int getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(int valorVenta) {
        this.valorVenta = valorVenta;
    }
    
    
    
}
