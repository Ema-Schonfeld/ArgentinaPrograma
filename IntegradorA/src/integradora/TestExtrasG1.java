
package integradora;

import java.util.Random;
import java.util.Scanner;


public class TestExtrasG1 {
    static Scanner leer = new Scanner (System.in);
    
   public static void calcularDiasHoras (){
       System.out.println("Ingrese la cantidad de minutos a calcular");
       int min = leer.nextInt();
       int dia = min/1440;
       int hora = (min%1440)/60;
       //If-else pero con el "?"
       System.out.println(dia != 1 ? dia + " dias " : dia + " dia ");
       System.out.println(hora != 1 ? hora + " horas " : hora + " hora "); 
   } 
   
   public static void Variables (){
       
       System.out.println("Ingrese A");
       int a = leer.nextInt();
       System.out.println("Ingrese B");
       int b = leer.nextInt();
       System.out.println("Ingrese C");
       int c = leer.nextInt();
       System.out.println("Ingrese D");
       int d = leer.nextInt();
       
       System.out.println("Los valores de las variables son:\nA: "+a+
                                                           "\nB: "+b+
                                                           "\nC: "+c+
                                                           "\nD: "+d);

       //B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B
       int aux = b;
       b = c;
       c = a;
       a = d;
       d = aux;
       
       System.out.println("Los valores de las variables son:\nA: "+a+
                                                           "\nB: "+b+
                                                           "\nC: "+c+
                                                           "\nD: "+d);
   }
   
   public static void DetectarVocal(){
       String letra;
       
       do {
          System.out.println("Ingresar una letra");
          letra = leer.next();
        
       }while (letra.length() > 1);
       
       //"aeiou".contains(String.valueOf(letra).toLowerCase());
       if (letra.equalsIgnoreCase("a")
               ||letra.equalsIgnoreCase("e")
               ||letra.equalsIgnoreCase("i")
               ||letra.equalsIgnoreCase("o")
               ||letra.equalsIgnoreCase("u")){
           System.out.println("Es una vocal");
       }else{
           System.out.println("Es una consonante");
       }
   }

    public static void Romanos(){
       int num;
        
       do {
            System.out.println("Ingrese un numero entre 1 y 10");
            num = leer.nextInt();
        }while (num >= 10 || num < 1);
       
        switch (num){
            case 1:
                System.out.println("El numero en romano es: I");
                break;
            case 2:
                System.out.println("El numero en romano es: II");
                break;
            case 3:
                System.out.println("El numero en romano es: III");
                break;
            case 4:
                System.out.println("El numero en romano es: IV");
                break;
            case 5:
                System.out.println("El numero en romano es: V");
                break;
            case 6:
                System.out.println("El numero en romano es: VI");
                break;
            case 7:
                System.out.println("El numero en romano es: VII");
                break;
            case 8:
                System.out.println("El numero en romano es: VIII");
                break;
            case 9:
                System.out.println("El numero en romano es: IX");
                break;
            case 10:
                System.out.println("El numero en romano es: X");
                break;
            default:
                System.out.println("El numero ingresado no esta entre los parametros");
                //el default no es necesario        
        }
    } 
    
    public static void obraSocial(){
        
        System.out.println("Ingrese la letra de socio");
        String socio = leer.next();
        socio = socio.toUpperCase();
        int monto = 0;
        
        if (socio.equalsIgnoreCase("A")
          ||socio.equalsIgnoreCase("B")
          ||socio.equalsIgnoreCase("C")){
            System.out.println("Ingrese el monto");
            monto = leer.nextInt(); 
        }
        
        switch (socio){
            case "A":
                System.out.println("Ust. debe abonar "+ (monto*50)/100);
                break;
            case "B":
                System.out.println("Ust. debe abonar "+ (monto*65)/100);
                break;
            case "C":
                System.out.println("Ust. debe abonar "+ monto);
                break;
            default:
                System.out.println("La opcion ingresada no es valida");
        }
    }
    
    public static void estatura(){
        
        double altura = 0;
        int contadorGeneral = 0;
        int contadorBajos = 0;
        double sumaGeneral = 0;
        double sumaBajos = 0;
        
        do {
            System.out.println("Ingrese las alturas");
            altura = leer.nextDouble();
            if (altura <= 1.60){
                sumaBajos += altura;
                contadorBajos++;
            }   
            sumaGeneral+= altura;
            contadorGeneral++;
        }while (altura != 0);
        
        contadorGeneral += -1;
        contadorBajos += -1;
        
        System.out.println("El promedio de todas las alturas es de: " + sumaGeneral/contadorGeneral + "%");
        System.out.println("El promedio de los que miden menos de 1,60 es de: "+ sumaBajos/contadorBajos + "%");  
    }    
    
    public static void maxMin(){
        int cantidadNum;
        int max = 0;
        int min = 999999;
        int num;
        int suma = 0;
       
        System.out.println("Ingrese la cantidad de numeros a ingresar");
        cantidadNum = leer.nextInt();
        int aux = cantidadNum;
        while (cantidadNum>0){
            System.out.println("Ingrese un numero");
            num = Math.abs(leer.nextInt());
            /* if (num>0){
            suma =+ num;
            }*/
            suma =+ num;
            if (min>num){
                min=num;
            }
            if (max<num){
                max=num;
            }
            cantidadNum--;
        }
        System.out.println("El numero maximo es: "+max+
                           "\nEl numero minimo es: "+min+
                           "\nEl promedio es: "+(suma/aux));
        
    }
    
    public static void Multiplocinco(){
        System.out.println("Ingrese numeros");
        int num = leer.nextInt();
        int contPar = 0;
        int contImpar = 0;
        int suma = 0;
        
        while (num%5 != 0){
            System.out.println("Ingrese numero");
            num = leer.nextInt();
            
            if (num>0){
                suma += num;
               if (num%2 == 0){
                   contPar++;
               }else{
                   contImpar++;
               } 
            }
        }
        System.out.println("Impares: "+contImpar+
                            "\nPares "+contPar+
                            "\nSuma: "+suma);
    }
    
    public static void RestaxDivision(){
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el divisor");
        int num2 = leer.nextInt();
        int contador = 0;
        
        while (num1>=num2){
            num1=num1-num2;
            contador++;
        }
        System.out.println("Residuo: "+ num1+
                           "\nCociente: " + contador);
    }
    
    public static void NumAleatorios(){
        
        int num1=(int)(Math.random()*10);
        //System.out.println("Numero: "+num1);
        int num2=(int)(Math.random()*10);
        int adivinanza = num1*num2;
        int respuesta;
        
        do{
            System.out.println("Adivine la adivinanza entre los numeros");
            System.out.println("Calcula... "+ num1 + " x " + num2);
            System.out.println("Ingrese su respuesta");
            respuesta = leer.nextInt();
            if (adivinanza != respuesta){
                System.out.println("Incorrecta");
            }
        }while (adivinanza!=respuesta);  
        
        System.out.println("Correcto");  
    }
    
    ///EJERCICIO DE FRAN
    /*public static void adivinarMultiplicacion(){
    Scanner sc=new Scanner(System.in);
    int numero;
    Random rnd= new Random();
    int a= rnd.nextInt(11);
    int b=rnd.nextInt(11);
    int adivinanza=a*b;
    do{
    System.out.println("Adivine el resultado de la multiplicacion " +
    "entre "+a+" y "+b);
    numero=sc.nextInt();
    if(numero!=adivinanza){
    System.out.println("Incorrecto intentelo nuevamente");
    }
    }while(adivinanza!=numero);
    System.out.println("correcto->"+a+"*"+b+"="+(a*b));
    }*/

    public static void CalcularDigitos(){
        System.out.println("Ingrese un numero de x cantidad de cifras");
        int num = leer.nextInt();
        int cont = 0;
        while (num>0){
            num = (int)Math.floor(num/10.0);
            cont++;
        }
        System.out.println("Digitos: "+cont);
    }
    
    public static void TresDigitos(){
        
        for (int a=0; a<=9; a++){
            for (int b=0; b<=9; b++){
                for (int c=0; c<=9; c++){
                    System.out.print((a==3)?"E":a);
                    System.out.print((b==3)?"-E-":"-"+b+"-");
                    System.out.print((c==3)?"E\n":c+"\n");
                }
            }
        }    
    }
    
    public static void escalera(){
        System.out.println("Ingrese el numero de su escalera");
        int num = leer.nextInt();
        
        for (int a=1; a<=num; a++){
            for (int b=1; b<=a; b++){
                System.out.print(b+"-");
            }
            System.out.println(" ");
        }
        
    }
    
}