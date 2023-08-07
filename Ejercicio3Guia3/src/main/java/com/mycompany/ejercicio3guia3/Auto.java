
package com.mycompany.ejercicio3guia3;

public class Auto {

    private String color;

    private String patente;

    private Double combustible = 50.0;

    private Rueda rueda1;

    private Rueda rueda2;

    private Rueda rueda3;
    
    private Rueda rueda4;

    public Auto() {
    }

    public Auto(String color, String patente, Rueda rueda1, Rueda rueda2, Rueda rueda3, Rueda rueda4) {
        this.color = color;
        this.patente = patente;
        this.rueda1 = rueda1;
        this.rueda2 = rueda2;
        this.rueda3 = rueda3;
        this.rueda4 = rueda4;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Double getCombustible() {
        return combustible;
    }

    public void avanzar(double metros) {
        double consumoLitros = metros*0.1;
        if (combustible  >= consumoLitros){
            System.out.println("Se avanzaron: " + metros + "mts.");
            combustible -= consumoLitros;
            System.out.println("Combustible: Litros " + combustible);
        }else{
            System.out.println("Combustible insuficiente");
        }
    }

    public void retroceder(double metros) {
        double consumoLitros = metros*0.1;
        if (combustible  >= consumoLitros){
            System.out.println("Se retrocedieron: " + metros + "mts.");
            combustible -= consumoLitros;
            System.out.println("Combustible: Litros " + combustible);
        }else{
            System.out.println("Combustible insuficiente");
        }
    }

    public void llenarTanque() {
        combustible = 50.0;
        System.out.println("Llenando tanque... Usted tiene "+ Math.round(combustible) + "litros");
    }
}
