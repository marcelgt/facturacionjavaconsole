
package Clases;
import java.util.Date;

public class  DetalleFactura extends Factura implements DatosProductos { //implements Producto
int cantidad;
double precioU;
double subtotal;



public DetalleFactura(){}

public DetalleFactura(
                      String tipo,
                      int NumFac, 
                      Date fecha,
                      String Nombre,
                      String Apellido,
                      String Nit,
                      String Direccion,
                      String Telefono,
                      String Email,
                      int cantidad,
                      double precioU,
                      double subtotal){

super(tipo,NumFac,fecha, Nombre,Apellido, Nit,  Direccion, Telefono, Email );
this.cantidad=cantidad;
this.precioU= precioU;
this.subtotal=subtotal;


}
         public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioU() {
        return precioU;
    }

    public void setPrecioU(double precioU) {
        this.precioU = precioU;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    @Override 
    public void DatosProducto(){
    };
  }
    