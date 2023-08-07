
package ejercicio3.guia5;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3Guia5 {

    
    public static void main(String[] args) {
        
        int [] vector = new int[10];
        int cont = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Llenando vector");
        for (int i=0; i < vector.length; i++){
            vector[i] = new Random().nextInt(11);
            System.out.println(vector[i]);
        } 
        System.out.println("Que numero desea buscar?");
        int num = leer.nextInt();
        for (int i=0; i < vector.length; i++){
            if (vector[i] == num){
                cont++;
                System.out.println("El numero " + num + " se encontró en la posicion " + i);
            }
        }
        if (cont == 0){
            System.out.println("Este numero no se encontró");
        }else{
            System.out.println("La cantidad de numeros repetidos es: " + cont);
        }
        
    }
    
}
