

package com.mycompany.ejercicio1.guia3.extra;

public class Ejercicio1Guia3Extra {

    public static void main(String[] args) {
        
        Posicion P1 = new Posicion ();
        GPS satnav = new GPS ("Garmin","Google maps", P1);
        Persona Emma = new Persona ("Emanuel","Schönfeld",satnav);
        
        Emma.ubicarme(satnav);
      
    }
}
