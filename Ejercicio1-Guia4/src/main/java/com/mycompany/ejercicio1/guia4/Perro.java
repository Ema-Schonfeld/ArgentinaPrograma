package com.mycompany.ejercicio1.guia4;


import com.mycompany.ejercicio1.guia4.Animal;

public class Perro extends Animal {

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimento() {
        super.alimento();
        System.out.println("Perro " + nombre + ": Me vuelve loco comer " + alimento + ", pero mis dueños solo me dan productos");
    }
}
