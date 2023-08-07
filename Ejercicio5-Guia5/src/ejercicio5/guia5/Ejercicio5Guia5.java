
package ejercicio5.guia5;

public class Ejercicio5Guia5 {

   
    public static void main(String[] args) {
        int[][] matriz = {{0, -2, 4}, {2, 0, 2},{-4, -2, 0}};

        boolean esMatrizAsimetrica = esMatrizAntisimetrica(matriz);
               
        if (esMatrizAsimetrica){
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz no es antisimetrica");
        }  
    }

    public static boolean esMatrizAntisimetrica(int[][] matriz) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                 return false;
                }
            }
        }
    return true;
    }
    
    public static void MostrarMatriz(int[][] matriz){
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
