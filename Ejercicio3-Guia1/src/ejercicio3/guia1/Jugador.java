
package ejercicio3.guia1;

public class Jugador {
    private String nombre, puntaje, nacionalidad;
    private int edad;

    public Jugador(String nombre, String puntaje, String nacionalidad, int edad) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }
    
    //2DO CONSTRUCTOR
    public Jugador (){}
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void saludar (){
        
        System.out.println("El nombre de mi Jugador es: "+nombre+
                           "\nEl puntaje es de: "+puntaje+
                           "\nLa nacionalidad es: "+nacionalidad+
                           "\nEdad: "+edad);
    }
    
    
}
