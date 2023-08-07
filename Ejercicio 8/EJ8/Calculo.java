/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ8;

/**
 *
 * @author Matìas Fernàndez
 */
public class Calculo {
    
  public static boolean esPrimo(int n){
      int cont=0;
     for(int i=1;i<=n;i++){
         
     if(n%i==0){
         cont++;
     }

  }
  return cont==2;    
    
}
  
  public static int valorAbsoluto(int num){
     
          return Math.abs(num);
      
  }
  
  public static double calcularRaices(double a, double b, double c){
    
        double x1 = (-b+(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
        double x2 = (-b-(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);

        if (a*Math.pow(x1,2)+b*x1+c==0 && a*Math.pow(x2,2)+b*x2+c==0){
            System.out.println("Las raices son " + x1 + " y " + x2);
        }else{
            System.out.println("No tiene raices");
        }
       
        return 0;        
    }   
  
}