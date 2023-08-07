
package com.mycompany.luk;

import Entidad.Humano;
import Entidad.Perro;


public class Luk {

    public static void main(String[] args) {
        Perro p = new Perro();
        p.setNombre("Maty");
        
        Humano h = new Humano();
        h.setNombre("Emma");
        System.out.println(h);
    }
}
