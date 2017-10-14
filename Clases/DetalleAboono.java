
package Clases;
import java.util.Date;
/**
 *
 * @author HEYRY
 */
public class DetalleAboono extends Abono  {
    int iddetalleAbono;
    double cantidaAbonar;

  
    
public DetalleAboono(){}

public DetalleAboono(
                    int iddetalleAbono,
                     double cantidadAbonar,
                     int idabono,
                     Date fechaabono, 
                     String tipo,
                     int NumFac,
                     int idcliente,
                     String Nombre,
                     String Apellido,
                     String Nit,
                     String Direccion,
                     String Telefono,
                     String Email){
    
        //super(idabono,fechaabono);
        this.iddetalleAbono=iddetalleAbono;
        this.cantidaAbonar=cantidadAbonar;
        }
    public int getIddetalleAbono() {
        return iddetalleAbono;
    }

    public void setIddetalleAbono(int iddetalleAbono) {
        this.iddetalleAbono = iddetalleAbono;
    }
      public double getCantidaAbonar() {
        return cantidaAbonar;
    }

    public void setCantidaAbonar(double cantidaAbonar) {
        this.cantidaAbonar = cantidaAbonar;
    }
    
    
}
