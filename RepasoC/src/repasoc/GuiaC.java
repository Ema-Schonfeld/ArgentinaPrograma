
package repasoc;

import java.util.Scanner;


public class GuiaC {
    
    static Scanner leer = new Scanner (System.in);
    
    public static void NotaIngresada(){
        //Scanner leer = new Scanner (System.in);
        int nota = leer.nextInt();
        while (!(nota >= 0 && nota <= 10)){
            System.out.println("Ingrese una nota valida");
            nota = leer.nextInt();
        }
        System.out.println("Nota válida");
    }
    
    public static void NumLimite(){
        //Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un limite");
        int num =  Math.abs(leer.nextInt());
        int suma = 0;
        while (suma <= num){
            System.out.println("Ingrese un numero");
            int num2=leer.nextInt();
            suma = suma + num2;
        }
        System.out.println("La suma: "+suma);
    }
    
    public static void Menu(){
        //Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num1=leer.nextInt();
        System.out.println("Ingrese otro numero");
        int num2=leer.nextInt();
        int opcion;
        do{
            System.out.println("  ");
            System.out.println("Bienvenido al Menú");
            System.out.println(("1. Sumar"+
                              "\n2. Restar"+
                              "\n3. Multiplicar"+
                              "\n4. Dividir"+
                              "\n5. Salir"));
            System.out.println("Ingrese una opcion");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("La suma es: "+(num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es: "+(num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: "+(num1*num2));
                    break;
                case 4:
                    if (num2==0){
                        System.out.println("No se puede dividir por 0");
                        Menu();   
                    }
                    System.out.println("La division es: "+((double)num1/num2));
                    break;
                case 5:
                    System.out.println("¿Desea salir?(S/N)");
                    String respuesta = leer.next();
                    if (respuesta.toLowerCase().charAt(0)== 's'){
                         System.out.println("Saliendo...");
                    }else{
                        opcion = 0;
                        System.out.println("Volviendo al Menú...");
                    }
                    break;
                default:
                    System.out.println("Numero incorrecto");
            }
        }while (opcion!=5);       
    }
    
    public static void sumar20Num(){
        //Scanner leer = new Scanner (System.in);
        int suma = 0;
        int num = 1;
        int cantNum = 0;
        while ((num!=0)&& cantNum < 20){
            System.out.println("Ingrese 20 numeros "+(cantNum+1)+ "/" +(20-cantNum-1));
            num = leer.nextInt();
            if (num >= 0){
                suma=suma+num;
            }
            cantNum++;
        }
        System.out.println("La suma es: "+suma);    
    }
    
    public static void RS232(){
        int correcta = 0;
        int incorrecta = 0;
        
        //Scanner leer = new Scanner (System.in);
        System.out.println("Introdusca una cadena");
        String cadena = leer.nextLine();
        while (!cadena.equals("&&&&&")){
            if (cadena.length()==5 && cadena.startsWith("X")&& cadena.endsWith("0")){
                correcta ++; 
            }else{
                incorrecta++;
            }
            System.out.println("Introdusca una cadena");
            cadena = leer.nextLine();
        }   
        System.out.println("Las correctas son: "+ correcta);
        System.out.println("Las incorrectas son: "+ incorrecta);
    } 
   
    public static void Cuadrado(){
        //Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un número");
        int num=leer.nextInt();
        int contadorF = 0;
        int contadorC = 0;
        while (contadorF <= num-1) {
            contadorC = 0;
            while (contadorC <= num-1){
                if (contadorF == 0 || contadorF == num-1 || contadorC == 0 || contadorC == num-1){
                   System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                contadorC++;
            }
            System.out.println(" ");
            contadorF++;
        }
    }
        public static void CuatroNumeros() {
        int num1, num2, num3, num4;
        
        System.out.println("Ingrese 4 números ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();
        num4 = leer.nextInt();
        System.out.println("----------");
        
        if (num1 >= 1 && num1 <= 20) {
            System.out.print(num1 + " ");
            for (int i = 0; i < num1; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }else{
            System.out.println("El numero ingresado no esta entre 1 y 20");
        }
        
        if (num2 >= 1 && num2 <= 20) {
            System.out.print(num2 + " ");
            for (int i = 0; i < num2; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }else{
            System.out.println("El numero ingresado no esta entre 1 y 20");
        }
        
        if (num3 >= 1 && num3 <= 20) {
            System.out.print(num3 + " ");
            for (int i = 0; i < num3; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }else{
            System.out.println("El numero ingresado no esta entre 1 y 20");
        }
        
        if (num4 >= 1 && num4 <= 20) {
            System.out.print(num4 + " ");
            
            for (int i = 0; i < num4; i++) {
                System.out.print("*");  
            }
            System.out.println(" ");
        }else{
            System.out.println("El numero ingresado no esta entre 1 y 20");
        }   
    }
}

