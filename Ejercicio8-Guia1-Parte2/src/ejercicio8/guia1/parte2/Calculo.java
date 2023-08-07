
package ejercicio8.guia1.parte2;

public class Calculo {
    public static boolean esPrimo(int num){
         if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
        return false;
        }
    }
    return true;
    }
    
   public static int valorAbsoluto(int num){
       return Math.abs(num);
    } 
    
    public static void calcularRaices(int a, int b, int c){
        if((Math.pow(b,2))- 4 * a * c < 0) && (a == 0){
            System.out.println("No posee raices.");
        }else{
                System.out.println((-b)- Math.sqrt((b*b)- 4 * a * c)/(2*a));
                System.out.println((-b)+ Math.sqrt((b*b)- 4 * a * c)/(2*a));
        }
        //x1 = (-b)- Math.sqrt((b*b)- 4 * a * c)/2*a);
        //x2 = (-b)+ Math.sqrt((b*b)- 4 * a * c)/2*a);
    }
    
}

