
package repasob;

import java.util.Scanner;


public class GuiaB {
    
    public static int elMayores(int num1, int num2){
        return Math.max(num2, num1); 
    }
    
    public static String esPar(int num){ 
        return (num%2==0)?"par":"impar";
    }
    
    public static String eureka(){
        Scanner leer = new Scanner (System.in);
        String frase = leer.nextLine();
        //return frase.equalsIgnoreCase("Eureka")?
                if ("Eureka".equalsIgnoreCase(frase)){
                    return "Correcto";
                }else{
                    return "Incorrecto";
                }
        
    }
    
    public static String Tiene8 (){
         Scanner leer = new Scanner (System.in);
         String frase = leer.nextLine();
         if (frase.length() == 8){
            return "Correcto";
        }else{
            return "Incorrecto";
        }
    }
          
   public static String ValidoA (){
       Scanner leer = new Scanner (System.in);
        String frase = leer.nextLine();
        frase=frase.toLowerCase();
        if (frase.charAt(0) == 'a'){
            return "Correcto";
        }else{
            return "Incorrecto";
        }
    }

   public static void FabricaMotores(){
       Scanner leer = new Scanner (System.in);
      int tipoMotor = leer.nextInt();
        switch (tipoMotor){
            case 1: 
            System.out.println("La boma es una bomba de agua");
            break;
            case 2:
            System.out.println("La bomba es una bomba de gasolina");
            break;
            case 3:
            System.out.println("La bomba es una bomba de hormigón");
            break;
            case 4:
            System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
            default:
            System.out.println("No existe un valor válido para tipo de bomba");
            
        }
    }
   
}
