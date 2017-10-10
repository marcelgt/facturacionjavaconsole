package Clases;

public abstract class Producto implements DatosProductos {
    public String codigo;
    private String nompro;
    private float precio;
    private String tipopro;
    private int cantidad;
    
    public Producto(){
         
    }
        
    public Producto(String codigo,String nompro,String tipopro, int cantidad,float precio){
        this.cantidad=cantidad;
        this.codigo=codigo;
        this.nompro=nompro;
        this.precio=precio;
        this.tipopro=tipopro;            
     }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nompro;
    }

    public void setNombre(String nompro) {
        this.nompro = nompro;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
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
    
    public abstract void datosPoducto();
    
    
    
}
