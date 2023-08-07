package guia.pkg5.pkg2ej1cine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Cine {
    private String nombre;
    private String direccion;
    ArrayList <Pelicula>proyecciones;

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        proyecciones = new ArrayList();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Pelicula> getProyecciones() {
        return proyecciones;
    }

    public void setProyecciones(ArrayList<Pelicula> proyecciones) {
        this.proyecciones = proyecciones;
    }
    
    public void agregarPelicula(Pelicula pelicula){
        proyecciones.add(pelicula);
    }
    
    public void listarTodo(){
        System.out.println("Peliculas registradas en el cine");
        for (Pelicula proye : proyecciones) {
            System.out.println("Titulo"+proye.getTitulo());
            System.out.println("Director"+proye.getDirector());
            System.out.println("Duracion"+proye.getDuracion()+"horas");
        }
    }
    
    public void  listarMayorDuracion (int horas){
        System.out.println("Peliculas con mayor duracion "+horas+"horas");
        for (Pelicula proye : proyecciones) {
            if (proye.getDuracion()>horas) {
                System.out.println("Titulo"+proye.getTitulo());
                System.out.println("Director"+proye.getDirector());
                System.out.println("Duracion"+proye.getDuracion()+"horas");
              
            }
        }
    }
    
    public void listarMenorDuracion(){
         System.out.println("Peliculas ordenadas de menor a mayor duraciÃ³n");
        Collections.sort(proyecciones,Pelicula.compararMayorDuracion);
        listarTodo();
    }

    
    public void listarOrdenadasPorTituloAZ (){
        System.out.println("Peliculas ordenadas alfabeticamente por Titulo");
        Collections.sort(proyecciones, Comparator.comparing(Pelicula::getTitulo)); 
            for (Pelicula proye : proyecciones) {
                System.out.println("Titulo"+proye.getTitulo());
                System.out.println("Director"+proye.getDirector());
                System.out.println("Duracion"+proye.getDuracion()+"horas");
            
        }
    }
    
    public void listarOrdenadasPorDirectorAZ(){
        Collections.sort(proyecciones, Pelicula.compararDirector);
        listarTodo();
    }
}
