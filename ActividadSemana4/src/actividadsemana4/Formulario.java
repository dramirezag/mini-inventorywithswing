/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadsemana4;

import javax.swing.*;


public class Formulario extends JFrame{
    
    JButton BtnGuardar,BtnLimpiar,BtnEliminarProducto,BtnModificarProducto,BtnVentaProducto;
    JLabel Lbtitulo,LbNombres,LbId,LbNumeroSerie,LbValor,LbProveedor,LbCantidad, LbProducto, LbIdentificacion, LbCant,LbNoFactura,LbProducto2,LbValorTotal,LbExistencia,LbVentas;
    JTextField TxtNombre,TxtId,TxtNumeroSerie,TxtValor, TxtProveedor, TxtCantidad;
    JTable TblExistencias, TblVentas;
    //JScrollPane sp1,sp2;
   
         Formulario (String title){
           super (title); 
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setBounds(20,20,900,900);
          getContentPane().setLayout(null);
          
          Lbtitulo = new JLabel ("Registro Productos");
          Lbtitulo.setBounds(10,10,150,20);
          getContentPane().add(Lbtitulo);
          
          LbId = new JLabel ("Identificacion");
          LbId.setBounds(10,40,80,20);
          getContentPane().add(LbId);
          
          LbNombres = new JLabel ("Nombre");
          LbNombres.setBounds(10,70,80,20);
          getContentPane().add(LbNombres);
          
          LbNumeroSerie = new JLabel ("Numero de serie");
          LbNumeroSerie.setBounds(10,100,150,20);
          getContentPane().add(LbNumeroSerie);
          
          LbValor = new JLabel ("Valor");
          LbValor.setBounds(10,130,80,20);
          getContentPane().add(LbValor);
          
          LbProveedor = new JLabel ("Proveedor");
          LbProveedor.setBounds(10,160,80,20);
          getContentPane().add(LbProveedor);
          
          LbCantidad = new JLabel ("Cantidad");
          LbCantidad.setBounds(10,190,80,20);
          getContentPane().add(LbCantidad);
          
                   
          
          TxtId = new JTextField ();
          TxtId.setBounds(170,40,300,20);
          getContentPane().add(TxtId);
          TxtId.setEditable(true);
          
          TxtNombre = new JTextField ();
          TxtNombre.setBounds(170,70,300,20);
          getContentPane().add(TxtNombre);
          TxtNombre.setEditable(true);
          
          TxtNumeroSerie = new JTextField ();
          TxtNumeroSerie.setBounds(170,100,300,20);
          getContentPane().add(TxtNumeroSerie);
          TxtNumeroSerie.setEditable(true);
          
          TxtValor = new JTextField ();
          TxtValor.setBounds(170,130,300,20);
          getContentPane().add(TxtValor);
          TxtValor.setEditable(true);
          
          TxtProveedor = new JTextField ();
          TxtProveedor.setBounds(170,160,300,20);
          getContentPane().add(TxtProveedor);
          TxtProveedor.setEditable(true);
          
          TxtCantidad = new JTextField ();
          TxtCantidad.setBounds(170,190,300,20);
          getContentPane().add(TxtCantidad);
          TxtCantidad.setEditable(true);
          
          
          
         BtnGuardar = new JButton("Guardar");
         BtnGuardar.setBounds(10,220,80,20);
         getContentPane().add(BtnGuardar);
         
         BtnLimpiar = new JButton("Limpiar");
         BtnLimpiar.setBounds(100,220,80,20);
         getContentPane().add(BtnLimpiar);
         
         BtnEliminarProducto = new JButton("Eliminar producto");
         BtnEliminarProducto.setBounds(200,220,140,20);
         getContentPane().add(BtnEliminarProducto);
                          
         BtnModificarProducto = new JButton("Modificar producto");
         BtnModificarProducto.setBounds(360,220,170,20);
         getContentPane().add(BtnModificarProducto);           
         
         BtnVentaProducto = new JButton("Venta producto");
         BtnVentaProducto.setBounds(550,220,140,20);
         getContentPane().add(BtnVentaProducto);
         
          LbExistencia = new JLabel ("Existencias de los Productos");
          LbExistencia.setBounds(100,260,300,20);
          getContentPane().add(LbExistencia);
          
          LbVentas = new JLabel ("Ventas de los Productos");
          LbVentas.setBounds(550,260,300,20);
          getContentPane().add(LbVentas);
         
         
          LbProducto = new JLabel ("Producto");
          LbProducto.setBounds(10,300,120,20);
          getContentPane().add(LbProducto);
          
          LbIdentificacion = new JLabel ("Identificacion");
          LbIdentificacion.setBounds(150,300,120,20);
          getContentPane().add(LbIdentificacion);
          
          LbCant = new JLabel ("Cantidad");
          LbCant.setBounds(280,300,120,20);
          getContentPane().add(LbCant);
          
          LbNoFactura = new JLabel ("No Factura");
          LbNoFactura.setBounds(450,300,120,20);
          getContentPane().add(LbNoFactura);
          
          LbProducto2 = new JLabel ("Producto");
          LbProducto2.setBounds(590,300,120,20);
          getContentPane().add(LbProducto2);
          
          LbValorTotal = new JLabel ("Valor Total");
          LbValorTotal.setBounds(720,300,120,20);
          getContentPane().add(LbValorTotal);
         
         TblExistencias = new JTable();
         TblExistencias.setBounds(10,320,400,400);
         //TblExistencias.setVisible(true);
         //TblExistencias.setAutoCreateRowSorter(true);
         //sp1 = new JScrollPane(TblExistencias);
         getContentPane().add(TblExistencias);
        // sp1.setOpaque(true);
         //add(sp1);
         //TblExistencias.setFillsViewportHeight(true);
         //TblExistencias.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
         
         TblVentas = new JTable();
         TblVentas.setBounds(450,320,400,400);
         
         // TblVentas.setAutoCreateRowSorter(true);
         //sp2 = new JScrollPane(TblVentas);
         getContentPane().add(TblVentas);
         //TblVentas.setFillsViewportHeight(true);
                 
          //setVisible(true);
           
     }

    public JButton getBtnGuardar() {
        return BtnGuardar;
    }

    public void setBtnGuardar(JButton BtnGuardar) {
        this.BtnGuardar = BtnGuardar;
    }

    public JButton getBtnLimpiar() {
        return BtnLimpiar;
    }

    public void setBtnLimpiar(JButton BtnLimpiar) {
        this.BtnLimpiar = BtnLimpiar;
    }

    public JButton getBtnEliminarProducto() {
        return BtnEliminarProducto;
    }

    public void setBtnEliminarProducto(JButton BtnEliminarProducto) {
        this.BtnEliminarProducto = BtnEliminarProducto;
    }

    public JButton getBtnModificarProducto() {
        return BtnModificarProducto;
    }

    public void setBtnModificarProducto(JButton BtnModificarProducto) {
        this.BtnModificarProducto = BtnModificarProducto;
    }

    public JButton getBtnVentaProducto() {
        return BtnVentaProducto;
    }

    public void setBtnVentaProducto(JButton BtnVentaProducto) {
        this.BtnVentaProducto = BtnVentaProducto;
    }

    public JTextField getTxtNombre() {
        return TxtNombre;
    }

    public void setTxtNombre(JTextField TxtNombre) {
        this.TxtNombre = TxtNombre;
    }

    public JTextField getTxtId() {
        return TxtId;
    }

    public void setTxtId(JTextField TxtId) {
        this.TxtId = TxtId;
    }

    public JTextField getTxtNumeroSerie() {
        return TxtNumeroSerie;
    }

    public void setTxtNumeroSerie(JTextField TxtNumeroSerie) {
        this.TxtNumeroSerie = TxtNumeroSerie;
    }

    public JTextField getTxtValor() {
        return TxtValor;
    }

    public void setTxtValor(JTextField TxtValor) {
        this.TxtValor = TxtValor;
    }

    public JTextField getTxtProveedor() {
        return TxtProveedor;
    }

    public void setTxtProveedor(JTextField TxtProveedor) {
        this.TxtProveedor = TxtProveedor;
    }

    public JTextField getTxtCantidad() {
        return TxtCantidad;
    }

    public void setTxtCantidad(JTextField TxtCantidad) {
        this.TxtCantidad = TxtCantidad;
    }
    
    public JTable getTblExistencias() {
        return TblExistencias;
    }

    public void setTblExistencias(JTable TblExistencias) {
        this.TblExistencias = TblExistencias;
    }

    public JTable getTblVentas() {
        return TblVentas;
    }

    public void setTblVentas(JTable TblVentas) {
        this.TblVentas = TblVentas;
    }

   /* public JScrollPane getSp1() {
        return sp1;
    }

    public void setSp1(JScrollPane sp1) {
        this.sp1 = sp1;
    }

    public JScrollPane getSp2() {
        return sp2;
    }

    public void setSp2(JScrollPane sp2) {
        this.sp2 = sp2;
    }
*/
         
    
   
     
     
     
}
