
package ejercicio4.guia1;


public class Perro {
    private String nombre, raza;
    private double peso;
    private int edad;

    public Perro(String nombre, String raza, double peso, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarInfo (){
        
        System.out.println("El nombre del perro es: "+nombre+
                           "\nLa raza es: "+raza+
                           "\nEl peso es: "+peso+
                           "\nEdad: "+edad);
    }
    
}
