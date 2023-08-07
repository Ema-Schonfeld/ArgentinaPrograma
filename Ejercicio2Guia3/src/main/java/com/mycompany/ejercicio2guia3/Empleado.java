package com.mycompany.ejercicio2guia3;


import java.time.LocalDate;

public class Empleado {

    private String nombre;
    private String apellido;
    private LocalDate fecha;
    private int dni;
   

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, LocalDate fecha, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
}
