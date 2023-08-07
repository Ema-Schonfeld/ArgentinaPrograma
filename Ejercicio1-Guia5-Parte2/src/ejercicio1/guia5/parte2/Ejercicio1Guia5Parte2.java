
package ejercicio1.guia5.parte2;

import javax.swing.JOptionPane;


public class Ejercicio1Guia5Parte2 {

    
    public static void main(String[] args) {
        
        Pelicula pelicula1 = new Pelicula ("Titanic","F. Ramirez", 120);
        Pelicula pelicula2 = new Pelicula ("Amores que matan","Wols Strret", 160);
        
        Cine GranRex = new Cine ("Gran Rex", "Avenida 9 de julio");
        
        
        GranRex.AgregarPelicula(pelicula1);
        GranRex.ListarTodo();
        GranRex.ListarDurarMas(2);
        GranRex.MenorDuracionaMayorDuracion();
        
        String on, titulo, director;
        int duracion;
        
        do{
            on = JOptionPane.showInputDialog(null, "¿Desea ingrese una pelicula? (SI/NO)");
            titulo = JOptionPane.showInputDialog(null, "Ingrese el Titulo de su pelicula)");
            //director = JOptionPane.showInputDialog(null, "Ingrese el director de la pelicula)");
            duracion = JOptionPane.showInputDialog(null, "Ingrese la duracion");
            
            
        }while("s".equalsIgnoreCase(on));
    }
    
}
