package guia.pkg5.pkg2ej1cine;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Pelicula {

    private String titulo;
    private String director;
    private Integer duracion;

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public static Comparator<Pelicula> compararMayorDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.duracion.compareTo(p2.duracion);

        }

    };
    public static Comparator<Pelicula>compararTitulo= new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
         return p1.titulo.compareToIgnoreCase(p2.titulo);
        }
    };
    
    public static Comparator<Pelicula>compararDirector=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.director.compareToIgnoreCase(p2.director);
        }
    };

}
