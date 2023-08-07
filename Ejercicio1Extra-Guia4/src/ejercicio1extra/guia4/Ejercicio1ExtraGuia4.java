
package ejercicio1extra.guia4;

import java.time.LocalDate;


public class Ejercicio1ExtraGuia4 {

    
    public static void main(String[] args) {
        
        Barco Velero1 = new Velero (3,"abc345",3.5,2019);
        Barco Yate1 = new Yate (3,7,"abc678",3.5,2019);
        Alquiler alquiler = new Alquiler ("Juana",3496362, LocalDate.of(2013, 7, 11)
        , LocalDate.of(2013, 7, 16), "Norte", Yate1);
        
        System.out.println("El valor del alquiler es: " + alquiler.calcularAlquiler());
        
    }
    
}
