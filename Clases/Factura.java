package Clases;


import java.util.Date; 
//import java.util.*;
/**
 *
 * @author HEYRY
 */
 public class Factura extends Cliente  {
int idfactura;     
 Date fecha;
  String tipo;
  int NumeroFactura;
 
  
  public Factura(){}
  
public Factura(int idfactura, String tipo,int NumeroFactura, Date fecha,String idcliente,String Nombre,String Apellido, String Nit, String Direccion, String Telefono, String Email ){
      super(idcliente, Nombre,Apellido,Nit,Direccion, Telefono, Email);
      this.idfactura=idfactura;
      this.NumeroFactura=NumeroFactura;
      this.fecha=fecha;
      this.tipo=tipo;
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroFactura() {
        return NumeroFactura;
    }

    public void setNumeroFactura(int NumeroFactura) {
        this.NumeroFactura = NumeroFactura;
    }

}

