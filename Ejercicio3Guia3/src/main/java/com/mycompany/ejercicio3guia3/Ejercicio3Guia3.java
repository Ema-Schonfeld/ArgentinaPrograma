

package com.mycompany.ejercicio3guia3;


public class Ejercicio3Guia3 {

    public static void main(String[] args) {
       
       
        Rueda rueda1 = new Rueda("Fatte", 28.0);
        Rueda rueda2 = new Rueda("Pirelli", 28.0);
        Rueda rueda3 = new Rueda("Still", 28.0);
        Rueda rueda4 = new Rueda("Good Year", 28.0);
        
        Auto tania = new Auto("Gris", "MIX936", rueda1, rueda2, rueda3, rueda4);
                
        tania.avanzar(177);
        tania.retroceder(30);
        tania.llenarTanque();
        
    }
}
