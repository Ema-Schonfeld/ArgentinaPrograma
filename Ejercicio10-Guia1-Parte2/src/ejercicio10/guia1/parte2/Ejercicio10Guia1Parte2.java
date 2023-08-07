
package ejercicio10.guia1.parte2;

import java.util.Scanner;


public class Ejercicio10Guia1Parte2 {

 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in); //in = de entrada
        
        System.out.println("Ingrese un Número:");
        int num1 = leer.nextInt();
        Pensador calculo=new Pensador(num1);
        
        System.out.println("El numero invertido es: "+calculo.invertir());
        System.out.println("El numero par anterior es: "+calculo.ParAntes());
        System.out.println("El numero par posterior es: "+calculo.ParPosterior());
        System.out.println("El primer digito es: "+calculo.PrimerDigito());
        System.out.println("El ultimo digito es: "+calculo.UltimoDigito());
        
    }               
    
}
