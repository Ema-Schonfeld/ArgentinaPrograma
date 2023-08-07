package ejercicio1extra.guia4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {

    private String nombre;

    private int documento;

    private LocalDate fechaDeAlquiler;

    private LocalDate fechaDeDevolucion;

    private String posicionDelAmarre;

    private Barco barco;

    public Alquiler(String nombre, int documento, LocalDate fechaDeAlquiler, LocalDate fechaDeDevolucion, String posicionDelAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.posicionDelAmarre = posicionDelAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public String getPosicionDelAmarre() {
        return posicionDelAmarre;
    }

    public void setPosicionDelAmarre(String posicionDelAmarre) {
        this.posicionDelAmarre = posicionDelAmarre;
    }
    
    public double calcularAlquiler() {
        long dias = ChronoUnit.DAYS.between(fechaDeAlquiler, fechaDeDevolucion);
        double AlquilerTotal = dias * barco.calcularModulo();
        return AlquilerTotal;
    }
}
