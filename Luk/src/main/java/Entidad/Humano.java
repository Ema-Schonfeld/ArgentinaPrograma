
package Entidad;


public class Humano {
    private String nombre;
    
    private Perro p;

    public Humano() {
    }

    public Humano(String nombre, Perro p) {
        this.nombre = nombre;
        this.p = p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Perro getP() {
        return p;
    }

    public void setP(Perro p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Humano{" + "nombre=" + nombre + ", p=" + p + '}';
    }
    
    
}
