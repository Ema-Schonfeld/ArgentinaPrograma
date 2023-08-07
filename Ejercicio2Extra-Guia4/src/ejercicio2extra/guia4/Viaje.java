package ejercicio2extra.guia4;

public class Viaje {

    private String lugarOrigen;

    private String lugarDestino;

    private double distancia;

    private Vehiculo vehiculo;

    private int peaje;

    public Viaje(String lugarOrigen, String lugarDestino, double distancia, Vehiculo vehiculo, int peaje) {
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.distancia = distancia;
        this.vehiculo = vehiculo;
        this.peaje = peaje;
    }

    public double calcularDistancia() {
        return distancia;
    }

    public double calcularPeaje() {
        if (vehiculo instanceof Auto || vehiculo instanceof Camioneta){
            return peaje * 250;
        }else{
            return peaje * 450;
        }
    }

    public double calcularCombustible() {
        return (vehiculo.CalcularCostoDelCombustible() * calcularDistancia()) / 100;
    }

    public double calcularTotal() {
        return calcularCombustible() + calcularPeaje();
    }
}
