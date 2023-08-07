package com.mycompany.ejercicio2guia3;


import com.mycompany.ejercicio2guia3.Empleado;

public class Kiosco {

    private String direccion;
    private String nombre;
    private int cuit;
    private Empleado empleado1;
    private Empleado empleado2;
    private Empleado empleado3;

    public Kiosco() {
    }

    public Kiosco(String direccion, String nombre, int cuit, Empleado empleado1, Empleado empleado2, Empleado empleado3) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.cuit = cuit;
        this.empleado1 = empleado1;
        this.empleado2 = empleado2;
        this.empleado3 = empleado3;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public Empleado getEmpleado1() {
        return empleado1;
    }

    public void setEmpleado1(Empleado empleado1) {
        this.empleado1 = empleado1;
    }

    public Empleado getEmpleado2() {
        return empleado2;
    }

    public void setEmpleado2(Empleado empleado2) {
        this.empleado2 = empleado2;
    }

    public Empleado getEmpleado3() {
        return empleado3;
    }

    public void setEmpleado3(Empleado empleado3) {
        this.empleado3 = empleado3;
    }
    
    //isBefore: compara dos fechas y devuelve un boolean, responde ¿es esta Fecha anterior a **?
    
    //METODOS
    
    /*public Empleado EmpleadoAntiguo(){
        Empleado empleadoAntiguo = null;
        
        if (empleado1 != null && empleado2 != null && empleado3 != null) {
            if (empleado1.getFecha().isBefore(empleado2.getFecha()) &&
                    empleado1.getFecha().isBefore(empleado3.getFecha())) {
                empleadoAntiguo = empleado1;
            } else if (empleado2.getFecha().isBefore(empleado3.getFecha())) {
                empleadoAntiguo = empleado2;
            } else {
                empleadoAntiguo = empleado3;
            }
        } else if (empleado1 != null && empleado2 != null) {
            if (empleado1.getFecha().isBefore(empleado2.getFecha())) {
                empleadoAntiguo = empleado1;
            } else {
                empleadoAntiguo = empleado2;
            }
        } else if (empleado1 != null) {
            empleadoAntiguo = empleado1;
        }
        return empleadoAntiguo;
    }*/
    
    
    public Empleado EmpleadoAntiguo(){
       
        if(empleado1.getFecha().compareTo(empleado2.getFecha()) < 0 && empleado1.getFecha().compareTo(empleado3.getFecha()) < 0){
            return empleado1;
        } else if ( empleado2.getFecha().compareTo(empleado3.getFecha()) < 0) {
            return empleado2;
        } else {
            return empleado3;
        } 
            
    }
}
