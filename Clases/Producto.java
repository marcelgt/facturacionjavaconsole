package Clases;

public  class Producto /*implements DatosProductos */{
    public String idproducto;
    public String codigopro;
    private String nompro;
    private  double precio;
    private String tipopro;
    private int cantidad;
    
    public Producto(){
         
    }
        
    public Producto(String idproducto, String codigopro,String nompro,String tipopro, int cantidad,double precio){
        this.idproducto=idproducto;
        this.cantidad=cantidad;
        this.codigopro=codigopro;
        this.nompro=nompro;
        this.precio=precio;
        this.tipopro=tipopro;            
     }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }
    

    public String getCodigopro() {
        return codigopro;
    }

    public void setCodigopro(String codigopro) {
        this.codigopro = codigopro;
    }

    public String getNombre() {
        return nompro;
    }

    public void setNombre(String nompro) {
        this.nompro = nompro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipopro;
    }

    public void setTipo(String tipopro) {
        this.tipopro = tipopro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    //public void datosPoducto();
    
    
    
}
