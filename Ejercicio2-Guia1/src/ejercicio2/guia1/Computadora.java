
package ejercicio2.guia1;


public class Computadora {
    
    private String marca;
    private int precio;
    private int modelo;
    private int windows;
    
    //PRIMER CONSTRUCTOR
    public Computadora (String marca, int precio, int modelo, int windows){
        
        this.marca=marca;
        this.precio=precio;
        this.modelo=modelo;
        this.windows=windows;
    }
    
    //SEGUNDO CONSTRUCTOR
    public Computadora (){}
    
    //METODOS GET AND SET

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }
    
    public void saludar (){
        
        System.out.println("La marca de su computadora es: \""+marca+"\"" +
                "\nEl precio de su computadora es: "+precio+
                "\nEl año de fabricación de su computadora es: "+modelo +
                "\nLa versionde windows que usa su computadora es: "+windows);
    }
}

