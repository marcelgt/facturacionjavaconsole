/*
 * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.util.Date; 
//import java.util.*;
/**
 *
 * @author HEYRY
 */
 public class Factura extends Cliente  {
 Date fecha;
  String tipo;
  int NumFac;
 
  
  public Factura(){}
  
public Factura(String tipo,int NumFac, Date fecha,String Nombre,String Apellido, String Nit, String Direccion, String Telefono, String Email ){
      super(Nombre,Apellido,Nit,Direccion, Telefono, Email);
      this.NumFac=NumFac;
      this.fecha=fecha;
      this.tipo=tipo;
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

    public int getNumFac() {
        return NumFac;
    }

    public void setNumFac(int NumFac) {
        this.NumFac = NumFac;
    }

}

