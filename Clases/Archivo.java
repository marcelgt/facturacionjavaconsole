
package Clases;
import java.util.ArrayList;
import Clases.Cliente;

/**
 * 
 * @author HEYRY
 */
public class Archivo {
    
    static ArrayList<Cliente> cliente = new ArrayList<>();
    public static void Registrarse() {
        //codigo
     }

   
    public static void guardar(String idcliente, String Nombre,String Apellido, String Nit, String Direccion, String Telefono, String Email){
        Cliente clienteNuevo= new Cliente(idcliente,Nombre,Apellido,Nit,Direccion, Telefono, Email);

         cliente.add(clienteNuevo);
         System.out.println("Cliente creado!");

        ShowCurrentCliente();
    }   
    
    public static void ShowCurrentCliente() {
        
        System.out.println("ID: " +cliente.get(0).getId() );
        System.out.println("Nombre: " +cliente.get(0).getNombre() );
        System.out.println("Apellido: "+cliente.get(0).getApellido() );
        System.out.println("Nit: "+cliente.get(0).getNit() );
        System.out.println("Direccion: "+cliente.get(0).getDireccion());
        System.out.println("Telefono: "+cliente.get(0).getTelefono() );
        System.out.println("Emai: "+cliente.get(0).getEmail() );
        

        // ShowCliente();
    }

    public static Cliente show(String nit ) {
        
        for (Cliente DataCliente : cliente) {
            
            if(DataCliente.getNit().equalsIgnoreCase(nit)) {                
                return DataCliente;               
            } 
        }
        Cliente vacio = new Cliente();
        return vacio;
    }

    
}
