/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadsemana4;

public class Productos {
    
    private int identificacion;
    private String nombre;
    private int numeroserie;
    private String nombreproveedor;
    private int cantidad;
    private int valor;
    
    public Productos (){
    
    }

    public Productos(int identificacion, String nombre, int numeroserie, String nombreproveedor, int cantidad, int valor) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.numeroserie = numeroserie;
        
        this.nombreproveedor = nombreproveedor;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public Productos(int identificacion, String nombre, int cantidad, int valorunitario) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valor = valor;
    }

   

    
    
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

   

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroserie() {
        return numeroserie;
    }

    public void setNumeroserie(int numeroserie) {
        this.numeroserie = numeroserie;
    }
   

    public String getNombreproveedor() {
        return nombreproveedor;
    }

    public void setNombreproveedor(String nombreproveedor) {
        this.nombreproveedor = nombreproveedor;
    }
   
    
    
    
}
