package com.mycompany.ejercicio1.guia4;

public class Animal {

    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    

    public void alimento() {
        System.out.println("¡Amo comer!");
    }
}
