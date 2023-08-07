
package ejercicio1.guia5;

import java.util.Scanner;


public class Arreglo {
    
    Scanner leer = new Scanner(System.in);
    int suma = 0;
    
    public void sumarListas(int [] vector){
        //int[] vector = new int [4];
        //System.out.println("Ingrese los numeros de su vector");
        for (int i=0; i < vector.length; i++){
            //vector[i]=leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma es: " + suma +
                           "\nEl promedio es: " + suma/vector.length);
        
    }
    public void buscarMayor(){
        int[][] matriz = new int [2][3];
        int aux = 0;
        //int suma = 0;
        
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                System.out.println("Ingrese el valor para la posicion i: " +i+ " j: " +j);
                matriz[i][j] = leer.nextInt();
                if (matriz[i][j] > aux){
                    aux = matriz[i][j];  
                }
                //suma += matriz[i][j];
            }
        }
        //MOSTRAR MATRIZ
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("El entero mas grande es: " + aux);
        //System.out.println("La suma es: " + num);
    }
    
    public void cuentaVocales(){
       String vector1 = "Programacion";
       int cont = 0;
       
       for (int i=0; i < vector1.length(); i++){
           switch(vector1.charAt(i)){
               case 'a':
                   cont++;
                   break;
               case 'e':
                   cont++;
                   break;
               case 'i':
                   cont++;
                   break;
               case 'o':
                   cont++;
                   break;
               case 'u':
                   cont++;
                   break;
           }  
       }
        System.out.println("La cantidad de vocales fueron: "+cont); 
    }
    
    public void cuentaCaracter(char caracter){
        String palabra = "Diccionario";
        palabra = palabra.toLowerCase();
        int cont = 0;
        
        for (int i=0; i < palabra.length(); i++){
            if (caracter == palabra.charAt(i)){
                cont ++;
            }
        }
        System.out.println("La cantidad de veces que se encontró el caracter fue de: " + cont);
    }
    
}
