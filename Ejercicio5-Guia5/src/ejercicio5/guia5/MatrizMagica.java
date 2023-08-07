
package ejercicio5.guia5;

import java.util.Scanner;


public class MatrizMagica {
    static Scanner leer = new Scanner (System.in);
    static int cont = 0;
    
    
    public void magica(int [][]matriz){
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
               
                do{
                    while (matriz[i][j] < 1 || matriz[i][j] > 9){
                    System.out.println("Ingrese un numero valido");
                    matriz[i][j]= leer.nextInt();
                    }
                    
                    if((noRepetir (matriz, cont, matriz[i][j]))){
                        System.out.println("Ingrese un numero que no se repita");
                        matriz[i][j] = leer.nextInt();
                    }
                    
                }while(noRepetir (matriz, cont, matriz[i][j]));
                 cont++;
            }
        }
        System.out.println("Su matriz es valida");
    }
    
    public static boolean noRepetir (int[][] matriz, int cont2, int num){
    int cont1 = 0;
    
    for (int[]fila:matriz){
    for (int columna:fila){
            if (cont2 == cont1){
            return false;
            }
            if(num==columna){
            return true;
            }
            cont1++;
        }
        
    }
    return false;
    
    public static void matrizCorrecta (int [][]matriz){
        int a=0,b=0,c=0, aux=1, diag=0;
        int sumaInv = 0;
        
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                if (i==0){
                    a += matriz[i][j];
                }
                //Filas
                if (i!=0){
                    b += matriz[i][j];
                    if (j== 2 && a==b){
                    aux++;
                    b=0;
                    }
                }
                //Columnas
                if (j>0){
                    c+=matriz[i][j];
                    if (j == 2 && c == a){
                        aux++;
                        c=0;
                    }
                }
                //Diagonal 1
                if (i==j){
                    diag+= matriz[i][j];
                    if (j==2 && diag==a){
                        aux++;
                    }
                }
            }    
        }
        
        for (int i = 0; i < matriz.length; i++) {
            sumaInv += matriz[i][matriz.length - 1 -i];
        }
        if (aux == 8){
            System.out.println("La matriz es magica"); 
        }else{
            System.out.println("La matriz no es magica");
        }
   
    }      
}




