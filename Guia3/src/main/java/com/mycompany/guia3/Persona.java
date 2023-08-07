
package com.mycompany.guia3;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Perro perro1;
    private Perro perro2;
    private Perro perro3;

    public Persona(String nombre, String apellido, int edad, int documento, Perro perro1, Perro perro2, Perro perro3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro1 = perro1;
        this.perro2 = perro2;
        this.perro3 = perro3;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }
    
    public Perro adoptarPerro(){
        
        Perro perroAdoptado = null;
        
        if(perro1.getNombre() == null){
            perro1 = perroAdoptado;
            System.out.println("El perro " + perro1.getNombre() + " fue adoptado"); 
        } else if (perro2 == null){
            perro2 = perroAdoptado;
            System.out.println("El perro " + perro2.getNombre() + " fue adoptado");
        } else if (perro3 == null){
            perro3 = perroAdoptado;
            System.out.println("El perro " + perro3.getNombre() + " fue adoptado");
        }else 
        System.out.println("El perro no puede ser adoptado");
        return perroAdoptado;
    }
    
    
}
