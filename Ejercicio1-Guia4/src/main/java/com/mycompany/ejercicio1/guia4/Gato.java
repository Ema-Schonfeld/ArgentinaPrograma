package com.mycompany.ejercicio1.guia4;


import com.mycompany.ejercicio1.guia4.Animal;

public class Gato extends Animal {

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimento() {
        super.alimento();
        System.out.println("Gato " +nombre + ": Sin dudas me gusta comer " +alimento + ", pero prefiero los ratones!");
    }
}
