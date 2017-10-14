
package Clases;
import java.util.Date;

public class  DetalleFactura extends Factura implements DatosProductos { //implements Producto
int iddetallefactura;
int cantidad;
double precioU;
double subtotal;



public DetalleFactura(){}

public DetalleFactura(
                      int iddetallefactura,
                      String tipo,
                      int NumeroFactura, 
                      Date fecha,
                      String idcliente,
                      String Nombre,
                      String Apellido,
                      String Nit,
                      String Direccion,
                      String Telefono,
                      String Email,
                      int idfactura,
                      int cantidad,
                      double precioU
                      ){

super(idfactura, tipo,NumeroFactura,fecha,idcliente, Nombre,Apellido, Nit,  Direccion, Telefono, Email );

this.iddetallefactura=iddetallefactura;
this.cantidad=cantidad;
this.precioU= precioU;
this.subtotal=subtotal;



}

    public int getIddetallefactura() {
        return iddetallefactura;
    }

    public void setIddetallefactura(int iddetallefactura) {
        this.iddetallefactura = iddetallefactura;
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
    