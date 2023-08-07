package guia.pkg5.pkg2ej1cine;

import java.util.Scanner;

public class Guia52Ej1Cine {

    public static void main(String[] args) {
        Cine cine = new Cine("Roma", "Rivadavia 325");
        Scanner sc = new Scanner(System.in);
        Pelicula peli;

        String elige;

        do {
            peli = new Pelicula();
            System.out.println("Ingrese el Titulo de la Pelicula: ");
            peli.setTitulo(sc.nextLine());
            System.out.println("Ingrese el nombre del Director: ");
            peli.setDirector(sc.nextLine());
            System.out.println("Ingrese la duracion: ");
            peli.setDuracion(sc.nextInt());
            sc.nextLine();
            cine.agregarPelicula(peli);
            System.out.println("Quieres agregar otra pelicula? si-no");
            elige = sc.nextLine();

        } while (!elige.equalsIgnoreCase("no"));
        
        cine.listarTodo();
        System.out.print("Ingrese cantidad de horas ");
        int duracion=sc.nextInt();
        cine.listarMayorDuracion(duracion);
        cine.listarOrdenadasPorTituloAZ();
        cine.listarOrdenadasPorDirectorAZ();        
        cine.listarMenorDuracion();
        sc.close();

    }

}
