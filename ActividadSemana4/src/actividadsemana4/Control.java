/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadsemana4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Control implements ActionListener{
    
    private Formulario formulario;
    private Productos productoTemp;
    private VentaProducto ventaTemp;
    private List<Productos> listaProductos;
    private List<VentaProducto> listaVenta;
    private DefaultTableModel tablaExistencias;
    private DefaultTableModel tablaVentas;
    private String[] cabeceraExistencias;
    private String[] cabeceraVentas;
    private String[] filaExistencias;
    private String[] filaVentas;
    private int contadorventas;
    private int cantidadTemp;
   
    
    
    public Control() {
        
    this.formulario = new Formulario("Registro de Inventario Olivanders");
    this.tablaExistencias = new DefaultTableModel(){
                         @Override
			public boolean isCellEditable(int row, int column) {
				return false;
        }};
    this.tablaVentas = new DefaultTableModel(){
                         @Override
			public boolean isCellEditable(int row, int column) {
				return false;
        }};
    iniciarTabla();
    this.listaProductos = new ArrayList<Productos>(2);
    this.listaVenta = new ArrayList<VentaProducto>(2);
    this.formulario.getBtnGuardar().addActionListener(this);
    this.formulario.getBtnLimpiar().addActionListener(this);
    this.formulario.getBtnEliminarProducto().addActionListener(this);
    this.formulario.getBtnModificarProducto().addActionListener(this);
    this.formulario.getBtnVentaProducto().addActionListener(this);
    //this.formulario.getSp1();
    //this.formulario.getSp2();
    this.contadorventas = contadorventas;
    this.cantidadTemp = cantidadTemp;
}
    
    public void iniciar() {
if (formulario == null) {
formulario = new Formulario("Registro de Inventario Olivanders");
formulario.setVisible(true);
} else {
formulario.setVisible(true);
}
}
    
private void iniciarTabla() {
cabeceraExistencias = new String[3];
cabeceraExistencias[0] = "Producto";
cabeceraExistencias[1] = "Identificacion";
cabeceraExistencias[2] = "Cantidad";
tablaExistencias.setColumnIdentifiers(cabeceraExistencias);
//formulario.sp1.setVisible(true);
//formulario.TblExistencias.setVisible(true);
formulario.getTblExistencias().setModel(tablaExistencias);

cabeceraVentas = new String[3];
cabeceraVentas[0] = "No Factura";
cabeceraVentas[1] = "Productos";
cabeceraVentas[2] = "Vlr Total Venta";
tablaVentas.setColumnIdentifiers(cabeceraVentas);
formulario.getTblVentas().setModel(tablaVentas);
}    

private Object[] crearFilaExistencias(Productos p) {
filaExistencias = new String[3];
filaExistencias[0] = p.getNombre();
filaExistencias[1] = String.valueOf (p.getIdentificacion());
filaExistencias[2] = String.valueOf (p.getCantidad());

return filaExistencias;
}

private Object[] crearFilaVentas(VentaProducto p) {
filaVentas = new String[3];
filaVentas[0] = String.valueOf (p.getNumeroFactura());
filaVentas[1] = p.getNombre();
filaVentas[2] = String.valueOf (p.getValorVenta());

return filaVentas;
}

public Productos obtenerProducto() {
   
productoTemp = new Productos();

productoTemp.setIdentificacion(Integer.parseInt(formulario.getTxtId().getText()));
productoTemp.setNombre(formulario.getTxtNombre().getText());
productoTemp.setNumeroserie(Integer.parseInt(formulario.getTxtNumeroSerie().getText()));
productoTemp.setValor(Integer.parseInt(formulario.getTxtValor().getText()));
productoTemp.setNombreproveedor(formulario.getTxtProveedor().getText());
productoTemp.setCantidad(Integer.parseInt(formulario.getTxtCantidad().getText()));
return productoTemp;

}

public VentaProducto obtenerVenta(){
ventaTemp = new VentaProducto();

ventaTemp.setIdentificacion(productoTemp.getIdentificacion());
ventaTemp.setNombre(productoTemp.getNombre());
ventaTemp.setNumeroFactura(contadorventas);
ventaTemp.setValorVenta(productoTemp.getValor()*cantidadTemp);



return ventaTemp;
}

private Productos obtProductoLista(int id) {
Productos salida = null;
for (Productos p : listaProductos) {
if (p.getIdentificacion() == id) {
salida = p;
break;
}
}
return salida;
}

public void limpiar() {
formulario.getTxtId().setText("");
formulario.getTxtNombre().setText("");
formulario.getTxtNumeroSerie().setText("");
formulario.getTxtValor().setText("");
formulario.getTxtProveedor().setText("");
formulario.getTxtCantidad().setText("");
}


    
   @Override
public void actionPerformed(ActionEvent e) {
if (e.getSource() == formulario.getBtnGuardar()) {
   // boolean test = formulario.getTxtId().getText().length() == 0 || formulario.getTxtNombre().getText().length() == 0 || formulario.getTxtNumeroSerie().getText().length() == 0 || formulario.getTxtValor().getText().length() == 0 || formulario.getTxtProveedor().getText().length() == 0 || formulario.getTxtCantidad().getText().length() == 0;
    
if (formulario.getTxtId().getText().length() == 0 || formulario.getTxtNombre().getText().length() == 0 || formulario.getTxtNumeroSerie().getText().length() == 0 || formulario.getTxtValor().getText().length() == 0 || formulario.getTxtProveedor().getText().length() == 0 || formulario.getTxtCantidad().getText().length() == 0) 
{
JOptionPane.showMessageDialog(null,"Por favor llene todos los campos", "Registro de productos", JOptionPane.WARNING_MESSAGE); 
 // limpiar();
} else {
productoTemp = obtenerProducto();
listaProductos.add(productoTemp);
tablaExistencias.addRow(crearFilaExistencias(productoTemp));
formulario.getTblExistencias().setModel(tablaExistencias);
limpiar();
productoTemp = null;
        }
                                                    }

else if (e.getSource() == formulario.getBtnLimpiar()) {
limpiar();
                                                      } 

else if (e.getSource() == formulario.getBtnEliminarProducto()) {
    if (listaProductos.isEmpty()){
      JOptionPane.showMessageDialog(null,"No Hay productos para Eliminar", "Error", JOptionPane.WARNING_MESSAGE);    
                                 }
                                  else{
    int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la identificación del producto que desea eliminar","Eliminación de asistentes",JOptionPane.WARNING_MESSAGE));
                                       productoTemp = obtProductoLista(id);
                                       if (productoTemp == null){
    JOptionPane.showMessageDialog(null,"El producto que ingreso no existe", "Error", JOptionPane.WARNING_MESSAGE);
    
                                                               } 
                                                                else {
      int confirmacion = JOptionPane.showConfirmDialog( null,"Esta seguro que desea eliminar el producto " + productoTemp.getNombre() + "?","Eliminacion de productos",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
                                                                     if (confirmacion == 0){
                                                                                            int index = listaProductos.indexOf(productoTemp);
                                                                                            listaProductos.remove(productoTemp);
                                                                                            tablaExistencias.removeRow(index);
                                                                                            formulario.getTblExistencias().setModel(tablaExistencias);
                                                                                             }
      
      
                                                                      } 
    
    
    
                                       }
                                        limpiar();
                                        productoTemp = null;
                                                               }

else if (e.getSource() == formulario.getBtnModificarProducto()) {
if (listaProductos.isEmpty()){
      JOptionPane.showMessageDialog(null,"No hay productos para Modificar", "Error", JOptionPane.WARNING_MESSAGE);    
                                 }
else {
int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la identificación del producto que desea modificar ","modificacion de producto",JOptionPane.QUESTION_MESSAGE));
productoTemp = obtProductoLista(id);
       if (productoTemp == null){
    JOptionPane.showMessageDialog(null,"El producto que ingreso no existe", "Error", JOptionPane.WARNING_MESSAGE);
                                 } 
       else{
       int index = listaProductos.indexOf(productoTemp);
       
       String seleccion = (String) JOptionPane.showInputDialog(null, "Escoge el campo que desea modificar","Modificacion productos", JOptionPane.QUESTION_MESSAGE, null,cabeceraExistencias, cabeceraExistencias[0]);
       String input = JOptionPane.showInputDialog(null,"Ingrese el nuevo valor para el campo seleccionado","modificacion de campo",JOptionPane.QUESTION_MESSAGE);
       int select = 0;
            
       
           if (seleccion.equals("Producto")){
           productoTemp.setNombre(input);
           select = 0;
           }
           if (seleccion.equals("Identificacion")){
           productoTemp.setIdentificacion(Integer.parseInt(input));
           select = 1;
           }
           if (seleccion.equals("Cantidad")){
           productoTemp.setCantidad(Integer.parseInt(input));
           select = 2;
           }
       
           listaProductos.set(index, productoTemp);
           tablaExistencias.setValueAt(input, index, select);
           formulario.getTblExistencias().setModel(tablaExistencias);
       
           }
    }

limpiar();
productoTemp = null;
                                                                }

else if (e.getSource() == formulario.getBtnVentaProducto()) {
if (listaProductos.isEmpty()){
      JOptionPane.showMessageDialog(null,"No Hay productos para Vender", "Error", JOptionPane.WARNING_MESSAGE);    
                                 }
else {

int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la identificación del producto que desea vender","venta de producto",JOptionPane.QUESTION_MESSAGE));
productoTemp = obtProductoLista(id);

       if (productoTemp == null){
    JOptionPane.showMessageDialog(null,"El producto que ingreso no existe", "Error", JOptionPane.WARNING_MESSAGE);
                                 }
       else{
       int index = listaProductos.indexOf(productoTemp);
       cantidadTemp = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de: " + productoTemp.getNombre() + " que desea comprar" ,"compra", JOptionPane.QUESTION_MESSAGE));
                if (cantidadTemp > productoTemp.getCantidad()){
                JOptionPane.showMessageDialog(null,"No hay la suficiente cantidad de: " + productoTemp.getNombre() + " para procesar la venta", "Error", JOptionPane.WARNING_MESSAGE);
                                                          }
                else{
                    productoTemp.setCantidad(productoTemp.getCantidad()-cantidadTemp);
                    listaProductos.set(index, productoTemp);
                    tablaExistencias.setValueAt(productoTemp.getCantidad(), index, 2);
                    formulario.getTblExistencias().setModel(tablaExistencias);
                    
                    contadorventas++;
                    ventaTemp = obtenerVenta();
                    listaVenta.add(ventaTemp);
                    tablaVentas.addRow(crearFilaVentas(ventaTemp));
                    formulario.getTblVentas().setModel(tablaVentas);
                    
                    productoTemp = null;
                    ventaTemp = null;
                    }
       
       }

}

                    limpiar();
                                                             }


} 
    
}

