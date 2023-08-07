
package ejercicio1.guia5.parte2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Cine {
    
    public String nombre;
    public String direccion;
    public ArrayList<Pelicula> proyecciones;

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.proyecciones = new ArrayList();
    }
    
    public void AgregarPelicula(Pelicula nueva){
        proyecciones.add(nueva);
        System.out.println("Se agregó correctamente");
    }
    
    public void ListarTodo(){
        //CICLO FOR EACH PARA CREAR ARRAY LIST
        for (Pelicula proyeccion : proyecciones){
        System.out.println(proyeccion.getTitulo());
        }
    }
    
    public void ListarDurarMas(int horas){
        
        System.out.println("Las peliculas mas de: " + horas + " horas");
        for (Pelicula proyeccion : proyecciones){
        if ((proyeccion.getDuracion()/60) >= horas){
            System.out.println(proyeccion.getTitulo());
        }
        }
    }
    
    public void MenorDuracionaMayorDuracion(){
        
        Comparator <Pelicula> orden = new Comparator <Pelicula> (){
            @Override
            public int compare(Pelicula pelicula1, Pelicula pelicula2) {
                if (pelicula1.getDuracion() < pelicula2.getDuracion()){
                    return -1;
                }
                if (pelicula1.getDuracion() == pelicula2.getDuracion()){
                    return 0;
                }
                //if (pelicula1.getDuracion() > pelicula2.getDuracion()){
                    return 1;
                //}
            }
        };
        
        Collections.sort(proyecciones,orden);
        System.out.println(proyecciones);
    }
    
    public void ListaOrdenafasporTitulo(){
        
        Comparator <Pelicula> orden = new Comparator <Pelicula> (){
            @Override
            public int compare(Pelicula pelicula1, Pelicula pelicula2) {
                return pelicula1.getTitulo().compareTo(pelicula2.getTitulo());
            }
        };
        Collections.sort(proyecciones,orden);
        System.out.println(proyecciones);
    }
    
    public void ListaOrdenafasporDirectorAZ(){
        
        Comparator <Pelicula> orden = new Comparator <Pelicula> (){
            @Override
            public int compare(Pelicula pelicula1, Pelicula pelicula2) {
                return pelicula1.getDireccion().compareTo(pelicula2.getDireccion());
            }
        };
        Collections.sort(proyecciones,orden);
        System.out.println(proyecciones);
    }
    
}
