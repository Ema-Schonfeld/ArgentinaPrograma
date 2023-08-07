package EJ7;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Robot robo = new Robot("Tito");
        Scanner Alicia = new Scanner(System.in);
        System.out.println("Ingrese los pasos que quiere realizar");
        robo.avanzar(Alicia.nextInt());
        System.out.println(robo.bateriaVacia());
        
    }
}