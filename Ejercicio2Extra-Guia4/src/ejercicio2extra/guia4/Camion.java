package ejercicio2extra.guia4;

public class Camion extends Vehiculo {

    public Camion(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    @Override
    public double CalcularCostoDelCombustible() {
        return combustible.getPrecio()*12.0;
    }
}
