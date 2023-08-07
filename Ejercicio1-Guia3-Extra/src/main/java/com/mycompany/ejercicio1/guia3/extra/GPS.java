
package com.mycompany.ejercicio1.guia3.extra;


public class GPS {
    
    private String marca;
    private String modelo;
    private Posicion ultimaUbicacion;

    //public GPS() {
    //}

    public GPS(String marca, String modelo, Posicion ultimaUbicacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.ultimaUbicacion = ultimaUbicacion;
    }
    
    public void mover (){
        ultimaUbicacion.setLatitud((float)Math.random()*100);
        ultimaUbicacion.setLongitud((float)Math.random()*100); 
    }
    
    public void obtenerUltimaPosicion (){
        System.out.println("La Latitud es: " + ultimaUbicacion.getLatitud());
        System.out.println("La longitud es: " + ultimaUbicacion.getLongitud());
    } 
    
}
