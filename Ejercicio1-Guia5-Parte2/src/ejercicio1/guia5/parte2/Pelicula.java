
package ejercicio1.guia5.parte2;

public class Pelicula {
    public String titulo;
    public String direccion;
    public int duracion;

    public Pelicula(String titulo, String direccion, int duracion) {
        this.titulo = titulo;
        this.direccion = direccion;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "El título es: " + titulo;
    }
    
    
}
