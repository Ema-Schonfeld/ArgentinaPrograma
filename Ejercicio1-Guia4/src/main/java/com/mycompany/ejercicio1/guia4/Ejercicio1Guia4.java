
package com.mycompany.ejercicio1.guia4;

import com.mycompany.ejercicio1.guia4.Animal;

public class Ejercicio1Guia4 {

    public static void main(String[] args) {
       
        Perro perro = new Perro ("Stich","carne",15, "Doberman");
        perro.alimento();
        Perro perro1 = new Perro ("Teddy","croquetas",10,"Chihuahua");
        perro1.alimento();
        
        Animal gato = new Gato ("Peluza","galletas",16,"Sianes");
        gato.alimento();
        
        Animal caballo = new Caballo ("Spark","pasto",25,"Fino");
        caballo.alimento();
        
        
    }
}
