
package ejercicio4.guia5;

import java.util.Random;


public class Ejercicio4Guia5 {

   
    public static void main(String[] args) {
 
        int[][] matriz = new int [4][4];

        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                matriz[i][j] = new Random().nextInt(10);
            }
        }
        //MOSTRAR MATRIZ
        System.out.println("--Matriz comun--");
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("--Matriz Inversa--");
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }
    }
    
}
