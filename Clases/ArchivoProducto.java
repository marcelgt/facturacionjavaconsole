
package Clases;
import Clases.Producto;
import java.util.ArrayList;
import Clases.DatosProductos;

/**
 *
 * @author HEYRY
 */
public class ArchivoProducto/* extends Producto implements DatosProducto*/{
    static ArrayList<Producto> producto = new ArrayList<>();
    public static void Registrar() {
        //codigo
     }

   
    public static void guardar(String idproducto, String codigopro,String nompro,double  precio){
        Producto productoNuevo= new Producto(idproducto,codigopro,nompro,"",0, precio);

         producto.add(productoNuevo);
         System.out.println("Producto creado!");

        ShowCurrentProducto();
    }   
    
    public static void ShowCurrentProducto() {
        
        System.out.println("ID: " +producto.get(0).getIdproducto() );
        System.out.println("Codigo: " +producto.get(0).getCodigopro() );
        System.out.println("Nombre: "+producto.get(0).getNombre());
        System.out.println("Tipo de Producto: "+producto.get(0).getTipo() );
        System.out.println("Cantidad: "+producto.get(0).getCantidad());
        System.out.println("Precio Unidad: "+producto.get(0).getPrecio() );
                        
        

        }

    public static Producto show(String codigopro ) {
        
        for (Producto Producto: producto) {
            
            if(Producto.getCodigopro().equalsIgnoreCase(codigopro)) {                
                return Producto;               
            } 
        }
        Producto vacio = new Producto();
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
