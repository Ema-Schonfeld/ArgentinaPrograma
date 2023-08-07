package ejercicio2.guia5;

public class Ejercicio2Guia5 {

    public static void main(String[] args) {
        
        int [] vector = new int [100];
        
        for (int i=0; i < vector.length; i++){
            vector[i] = i+1;
        }
        System.out.println("---Descendiendo---");
        
        for (int i=99; i > -1; i--){
            System.out.println(vector[i]);
        }
    }
    
}
