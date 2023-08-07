
package Entidad;

public class Perro {
    private String nombre;

    public Perro() {
    }

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + '}';
    }
    
}
