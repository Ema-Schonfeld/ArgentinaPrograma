
package com.mycompany.guia3;


public class Guia3 {

    public static void main(String[] args) {
        
        Perro p1 = new Perro("Bouddy","Caniche", 4, "Chico");
        Perro p2 = new Perro("Scooby","Ovejero Aleman", 5, "Grande");
        Perro p3 = new Perro("Blanquita","Dalmata", 3, "Mediano");
        
        Persona persona = new Persona ("Emma","Schönfeld",19,43936727, p1, p2, p3);
        
        System.out.println("El perro adoptado es: " + persona.adoptarPerro());
    }
}
