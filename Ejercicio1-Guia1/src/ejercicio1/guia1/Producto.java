
package ejercicio1.guia1;


public class Producto {
    
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    
    //ESTE ES MI PRIMER CONSTRUCTOR
    public Producto (int codigo, String descripcion, double precio, int stock){
    
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precio=precio;
        this.stock=stock;
    }
    
    //ESTE ES MI SEGUNDO CONSTRUCTOR
    public Producto (){}
    
    //METODOS GET AND SET

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void saludar (){
        
        System.out.println("El codigo de su producto es "+codigo);
        System.out.println("El precio de su producto es: "+precio);
        System.out.println("Su producto es "+descripcion);
        System.out.println("La cantidad de unidades disponibles de su producto es: "+stock);
    }
}
        
   
