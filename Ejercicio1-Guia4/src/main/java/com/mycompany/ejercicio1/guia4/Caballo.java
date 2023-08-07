package com.mycompany.ejercicio1.guia4;


import com.mycompany.ejercicio1.guia4.Animal;

public class Caballo extends Animal {

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimento() {
        super.alimento();
        System.out.println("Caballo " + nombre + ": Me gusta comer " + alimento + ", pero prefiero manzanas!");
    }
    
}
