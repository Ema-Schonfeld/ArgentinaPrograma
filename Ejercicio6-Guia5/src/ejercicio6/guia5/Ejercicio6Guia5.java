
package ejercicio6.guia5;

import java.util.Scanner;


public class Ejercicio6Guia5 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int[][] matriz = new int [3][3];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.println("Ingrese numeros");
                matriz[i][j] = leer.nextInt();
            }
        }
        
        MatrizMagica.magica(matriz);
        MatrizMagica.matrizCorrecta(matriz);
    }
    
}
