package com.mycompany.ejercicio2guia3;


import java.time.LocalDate;


public class Ejercicio2Guia3 {

    public static void main(String[] args) {
        
        Empleado e1 = new Empleado ("Emanuel","Schönfeld",LocalDate.of(2003,6,18), 43936727);
        Empleado e2 = new Empleado ("Tiara","Barreto",LocalDate.of(2001,5,30), 42763502);
        Empleado e3 = new Empleado ("Agustin","Alvez",LocalDate.of(2002,10,14), 42936726);
        
        Kiosco kioscoItalia = new Kiosco ("9 de Julio 674","Kiosco Italia",1806,e1,e2,e3);
        
        System.out.println("El Nombre del empleado más antiguo es: " + kioscoItalia.EmpleadoAntiguo().getNombre() + " " + kioscoItalia.EmpleadoAntiguo().getApellido());
    }
}