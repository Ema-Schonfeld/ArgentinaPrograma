
package ejercicio1.guia1.parte2;


public class Ejercicio1Guia1Parte2 {

    
    public static void main(String[] args) {
        
        numero num = new numero (1459);
        
        if (num.esPar()){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
        
        if (num.esPositivo()){
            System.out.println("Es un numero positivo");
        }else{
            System.out.println("No es positivo");
        }
        
        if (num.esMultiplo(3)){
            System.out.println("El Multiplo");
        }else{
            System.out.println("No es multiplo");
        }
    }
    
}
