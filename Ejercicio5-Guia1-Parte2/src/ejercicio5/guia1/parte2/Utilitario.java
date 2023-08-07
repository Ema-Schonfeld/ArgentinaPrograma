
package ejercicio5.guia1.parte2;


public class Utilitario {
    
    public static void DibujarCuadrado (int n){
        for (int i=0;(i<=n-1);i++){
            System.out.print("* ");
        }
        
        System.out.println(" ");
        for (int i=1;(i<=n-2);i++){
            System.out.print("* ");
            for (int j=1; (j<=n-2); j++){
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println(" ");
        }
        for (int i=0;(i<=n-1);i++){
            System.out.print("* ");
        }
        System.out.println(" ");
    }
    
    public static String elDiaEs(int numero){
        String dia;
        switch (numero){
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Dia Invalido";
        }
        return dia;
    }
    
    
    public static void EsMayor(int a, int b, int c){
        
        if (a == c && b == c) {
            System.out.println("Son todos iguales");
        } else {
            if (a >= b && a >= c) {
                if (a == b) {
                    System.out.println("A es igual a B");
                    System.out.println("A y B son:" + b);
                } else if (a == c) {
                    System.out.println("A es igual a C");
                    System.out.println("A y C son: " + a);
                } else {
                    System.out.println("A es mayor a B y a C");
                }
            } else if (b >= c) {
                if (b == c) {
                    System.out.println("B es igual a C");
                    System.out.println("B y c son: " + b);
                }else{
                    System.out.println("B es mayor a C" + b);
                }
            }else{
                System.out.println("C es mayor a B");
            }    
        } 
    }   
    
    
    
}

