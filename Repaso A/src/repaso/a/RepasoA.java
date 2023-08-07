package repaso.a;

import java.util.Scanner;

public class RepasoA {

    public static void main(String[] args) {

        //System.out.println("La suma es: "+GuiaA.sumaNum()); 
        //System.out.println("La suma es: "+GuiaA.sumaNum()); 
        //GuiaA.esMayusomin();
        //GuiaA.Grados();
        //GuiaA.Ecuacion();
        int num = 1;

        Scanner leer = new Scanner(System.in);
        while (num == 1) {
            System.out.println("  ");
            System.out.println("Menu");
            System.out.println("1. Suma de 2 enteros");
            System.out.println("2. Ingrese un Nombre");
            System.out.println("3. Pasar palabra a Mayus y Minuscula");
            System.out.println("4. Pasar de Celsius a Fahrenheit ");
            System.out.println("5. Ingrese un numero (x2)(x3)(Raiz)");
            System.out.println("6. Salir");
            switch (leer.nextInt()) {
                case 1:
                    System.out.println("La suma es: " + GuiaA.sumaNum());
                    break;
                case 2:
                    System.out.println("El nombre es: " + GuiaA.Nombre());
                    break;
                case 3:
                    GuiaA.esMayusomin();
                    break;
                case 4:
                    GuiaA.Grados();
                    break;
                case 5:
                    GuiaA.Ecuacion();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    num = 0;
                    break;
            }
        }
    }

}
