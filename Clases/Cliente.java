/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author HEYRY
 */
public class Cliente {
public String idcliente;    
public String Nombre;
public String Apellido;
public String Nit;
public String Direccion;
public String Telefono;
public String Email;

public Cliente(){}
public Cliente(String idcliente, String Nombre,String Apellido, String Nit, String Direccion, String Telefono, String Email){
this.idcliente=idcliente;
this.Nombre=Nombre;
this.Apellido=Apellido;
this.Nit=Nit;
this.Direccion=Direccion;
this.Telefono=Telefono;
this.Email=Email;
}


    public String getId() {
        return idcliente;
    }

    public void setId(String idcliente) {
        this.idcliente = idcliente;
    }
int idcliene;





    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
     
}
