
package Clases;
import java.util.Date;
/**
 *
 * @author HEYRY
 */
public class Abono extends Factura {
    int idabono;
    Date fechaabono;
    public Abono(){}
    public Abono(int idabono,
                 Date fechaabono,
                 int idfactura,
                 Date fecha,
                 String tipo,
                 int NumFac,
                 String idcliente,
                 String Nombre,
                 String Apellido,
                 String Nit,
                 String Direccion,
                 String Telefono,
                 String Email){
    super(idfactura,tipo,NumFac,fecha,idcliente,Nombre,Apellido,Nit,Direccion,Telefono,Email);
    this.fechaabono=fechaabono;
    this.idabono=idabono;
    }

    public int getIdabono() {
        return idabono;
    }

    public void setIdabono(int idabono) {
        this.idabono = idabono;
    }

    public Date getFechaabono() {
        return fechaabono;
    }

    public void setFechaabono(Date fechaabono) {
        this.fechaabono = fechaabono;
    }
    
}