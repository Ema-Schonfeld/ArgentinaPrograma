package ejercicio2extra.guia4;

public class Camioneta extends Vehiculo {

    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    @Override
    public double CalcularCostoDelCombustible() {
        return combustible.getPrecio()*10.0;
    }
}
