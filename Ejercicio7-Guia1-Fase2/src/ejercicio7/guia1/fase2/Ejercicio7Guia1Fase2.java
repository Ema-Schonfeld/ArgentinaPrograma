
package ejercicio7.guia1.fase2;
import java.util.Scanner;

public class Ejercicio7Guia1Fase2 {

   
    public static void main(String[] args) {
        Robot tato = new Robot("que miras bobo?");
        Scanner Messi = new Scanner(System.in);
       
        System.out.println("Ingrese la cantidad de pasos!");
        tato.avanzar(Messi.nextInt());
    }
    
}
