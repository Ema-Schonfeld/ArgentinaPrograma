
package ejercicio2extra.guia4;


public class Ejercicio2ExtraGuia4 {

   
    public static void main(String[] args) {
       
        Combustible combustible = new Combustible (400, "Infinia Super");
        Vehiculo auto = new Auto ("Chevrolet","MIX936",combustible);
        Viaje viaje = new Viaje ("Rosario", "La Plata", 356, auto, 4);
        
        System.out.println("El costo de peajes es: $" + viaje.calcularPeaje()+
                           "\nLa distancia del viaje es: $" + viaje.calcularDistancia()+
                           "\nEl costo del combustible es: $" + viaje.calcularCombustible()+
                           "\nEl costo total de su viaje es: $" + viaje.calcularTotal());
    }
    
}
