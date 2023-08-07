
package com.mycompany.ejercicio1.guia3.extra;


public class Persona {
    
    private String nombre;
    private String apellido;
    private GPS satnav;

    //public Persona() {
    //}

    public Persona(String nombre, String apellido, GPS satnav) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.satnav = satnav;
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

    public GPS getSatnav() {
        return satnav;
    }

    public void setSatnav(GPS satnav) {
        this.satnav = satnav;
    }
    
    public void ubicarme(GPS satnav){
        satnav.mover();
        satnav.obtenerUltimaPosicion();
    }
    
 
}
