
package ejercicio2.guia1.parte2;


public class Ejercicio2Guia1Parte2 {

    public static void main(String[] args) {
       Cuadrilatero cuadri = new Cuadrilatero (70,50);
        System.out.println("Perimetro = " +cuadri.calcularPerimetro());
        System.out.println("Superficie = " +cuadri.calcularSuperficie());
        
        if (cuadri.esunCuadrado()){
            
            System.out.println("Es un cuadrado");
     
        }else{
            System.out.println("No es un cuadrado");
        }
        
                
    }
    
}
