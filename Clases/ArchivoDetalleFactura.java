
package Clases;
import static Clases.Archivo.cliente;
import Clases.Producto;
import java.util.ArrayList;
import Clases.DatosProductos;
import java.util.Date;
import Clases.DetalleFactura;
/**
 *
 * @author HEYRY
 */
public class ArchivoDetalleFactura {
    static ArrayList<DetalleFactura> factura = new ArrayList<>();
      
    public static void guardar(int iddetallefactura,
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
                      double precioU){
        DetalleFactura facturaNuevo= new DetalleFactura(iddetallefactura,tipo,NumeroFactura,fecha,idcliente,Nombre,Apellido,Nit,Direccion,Telefono,Email,idfactura,cantidad,precioU);
        factura .add(facturaNuevo);
         System.out.println("Detalle creado!");
        ShowCurrentDetalleFactura();
    }   
                                
    public static void ShowCurrentDetalleFactura() {
        
        System.out.println("ID DETALLE DE FACTURA: " +factura.get(0).getIddetallefactura());
        System.out.println("TIPO DE FACTURA: " +factura.get(0).getTipo());
        System.out.println("NUMERO DE FACTURA: " +factura.get(0).getNumeroFactura());
        System.out.println("FECHA: "+factura.get(0).getFecha());
        System.out.println("ID CLIENTE: "+factura.get(0).getId());
        System.out.println("FECHA: "+factura.get(0).getFecha());
        System.out.println("NOMBRE: "+factura.get(0).getNombre() );
        System.out.println("APELLIDO: "+factura.get(0).getApellido() );
        System.out.println("NIT: "+factura.get(0).getNit() );
        System.out.println("DIRECCION: "+factura.get(0).getDireccion() );
        System.out.println("TELEFON: "+factura.get(0).getTelefono());
        System.out.println("EMAIL: "+factura.get(0).getEmail());
        System.out.println("ID FACTURA: "+factura.get(0).getIdfactura());
        System.out.println("cANTIDAD: "+factura.get(0).getCantidad());
        System.out.println("PRECION: "+factura.get(0).getPrecioU() );            
        
        }

    public static DetalleFactura show(int idfactura ) {
        
        for (DetalleFactura list: factura) {
           int id= list.getIdfactura();
            if(id ==idfactura) {                
                return list;               
            } 
        }
        DetalleFactura vacio = new DetalleFactura();
        return vacio;
    }
    public static boolean esNumero(String cadena){
	try {
		Double.parseDouble(cadena);//convertir una cadena a int
		return true;
	} catch (NumberFormatException nfe){
            	return false;
	}
    
    }
    
}
