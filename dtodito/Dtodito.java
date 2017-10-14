package dtodito;
import Clases.Archivo;
import Clases.DetalleFactura;
import java.util.Scanner;
import java.util.ArrayList;
import Clases.Cliente;
import Clases.Factura;
import Clases.Producto;
import Clases.ArchivoProducto;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dtodito extends DetalleFactura{
    int op;
    String Teclado;
    
    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
public static Cliente validarCliente(String Nit){
    
    return Archivo.show(Nit);
}
public static Producto validarProducto(String codigopro){
       return ArchivoProducto.show(codigopro);
}

public static boolean validarEmail(String email) {
 
        // Compiles the given regular expression into a pattern.
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
 
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
 
    }
 


    public static void main(String[] args) {
        int num;
        
        do{       
        
            System.out.println("************ DTODITO  ************");
            System.out.println("**  1.- VENTA                   **");
            System.out.println("**  2.- ABONAR                  **");
            System.out.println("**  3.- LISTAR VENTAS           **");
            System.out.println("**  4.- INVENTARIO              **");
            System.out.println("**  5.- SALIR                   **");
            System.out.println("**********************************");
            
            Scanner opc=new Scanner(System.in);
            num=opc.nextInt();
            Scanner Teclado =new Scanner(System.in); 
            if(num>5){
               
                        System.out.println("OPCION NO VALIDA VUELVA A INTENTARLO");
                        num=opc.nextInt();
                        if(num>5){
                           continue;
                           
                        }
             }
            
            switch (num){
                case 1:
                     System.out.println("************ DTODITO  ************");
                     System.out.println("         1.- VENTA                ");
                     System.out.println("Ingresar Datos");      
                     System.out.println("\n Nit: ");
                     Cliente resultado;
                     String nit= Teclado.nextLine();     
                     resultado = validarCliente(nit); 
                     
                     
                     if (resultado.getNombre()==null){
                         
                      System.out.println("Cliente no existe favor ingresar datos: ");
                      System.out.println("Id Cliente: ");
                      String idcliente=Teclado.nextLine();
                      System.out.println("Nombre: ");
                      String nombre=Teclado.nextLine();
                      System.out.println("Apellido: ");        
                      String apellido = Teclado.nextLine();
                      System.out.println("Direccion: ");        
                      String direccion= Teclado.nextLine(); 
                      System.out.println("Telefono: ");
                      String telefono= Teclado.nextLine();
                      System.out.println("Email: ");
                      String email= Teclado.nextLine();
                      validarEmail(email);
                      boolean correo= validarEmail(email);
                      if(!correo){
                      System.out.println("ERROR favor Vuelva a intentarlo");
                      System.out.println("Email: ");
                      email= Teclado.nextLine();
                                           
                        }
                      
                      System.out.println("\n ");
                     Archivo.guardar(idcliente, nombre, apellido, nit,  direccion,telefono, email);
                     }
                 else
                     {
                     System.out.println("Nombre: "+resultado.getNombre());
                     System.out.println("Apellido: "+resultado.getApellido());
                     System.out.println("Id: "+resultado.getId());
                     System.out.println("Nit: "+resultado.getNit());
                     System.out.println("Direccion: "+resultado.getDireccion());
                     System.out.println("Telefono: " +resultado.getTelefono());
                     System.out.println("Email: "+resultado.getEmail());
                      System.out.println("\n ");
                     }
                     break;

                case 2:
                    System.out.println("************ DTODITO  ************");    
                    System.out.println("          2.- ABONAR              ");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    break;

                case 3:
                     
                    System.out.println("************ DTODITO  ************");    
                    System.out.println("*         3.-  VENTAS            *");
                    System.out.println("* 1.- Incresar Venta             *");      
                    System.out.println("* 2.- Listar Ventas              *");
                    System.out.println("* 3:- Retornar                   *");      
                    System.out.println("**********************************");    
                       do{  
                           System.out.println("Ingresar Opcion          ");
                                   num= Teclado.nextInt();  

                            switch(num) {

                               case 1:
                                   System.out.println("************ DTODITO  ************");    
                                   System.out.println("*      3.-  LISTAR VENTAS        *");
                                   System.out.println("*         3.1 INGRESAR VENTAS     *");
                                   System.out.println("Ingresar nit del Cliente          ");
                                   String Nit= Teclado.nextLine();
                                   

                                 break;
                    
                                            
                            }
                    
                        }while(num!=2);
                    
                     break; 
                   
                case 4:
                    
                    System.out.println("************ DTODITO  ************");    
                    System.out.println("      4.- INVENTARIO              ");
                    
                    System.out.println("Codigo Producto");
                       
                    Producto resultadoProducto;   
                    String codigoProducto= Teclado.nextLine();              
                    resultadoProducto = validarProducto(codigoProducto);
                    
                    if(resultadoProducto.getCodigopro()==null){
                        System.out.println("ID PRODUCTO: ");
                        String Idproducto=Teclado.nextLine();
                        
                        System.out.println("NOMBRE DEL PRODUCTO: ");
                        String nombre = Teclado.nextLine();
                                  String precio="";              
                        
                        do{
                            System.out.println("PRECION: ");
                            precio= Teclado.nextLine();
                            
                        }while(!ArchivoProducto.esNumero(precio));                  
                        
                        double aDouble = Double.parseDouble(precio);
                        ArchivoProducto.guardar(Idproducto, codigoProducto, nombre,aDouble);
                                                                       
                      }
                    else{
                        System.out.println("PRODUCTO EXISTENTE");
                    }

                    {}             
                    break;                
                    
                case 5:
                    System.out.println("************ DTODITO  ************");
                    System.out.println("          5.   SALIR              ");
                    System.out.println("              ADIOS               ");
                break;
                           
            }
        }while(num!=5);
             
    
    }
}