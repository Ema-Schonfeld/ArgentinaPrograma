
package repaso.a;

import java.util.Scanner;


public class GuiaA {
   
    public static int sumaNum(){
        Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese un numero: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2 = leer.nextInt();
        return num1+num2;
    }
    
    public static String Nombre(){
        Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese su nombre: ");
        return leer.nextLine();
    }
    
    public static void esMayusomin(){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        System.out.println("La frase es");
        System.out.println(frase.toUpperCase()+ "\n"+frase.toLowerCase());
    }
    
    public static void Grados(){
        Scanner leer = new Scanner (System.in);
        double grados = leer.nextDouble();
        System.out.println(32+(9*grados/5));
    }
    
    public static void Ecuacion(){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        double num = leer.nextDouble();
        System.out.println((num*2)+
        "\n"+(num*3)+
        "\n"+(Math.sqrt(num)));
    }
    
}
