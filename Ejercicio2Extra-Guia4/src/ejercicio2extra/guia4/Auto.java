package ejercicio2extra.guia4;

public class Auto extends Vehiculo {

    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    @Override
    public double CalcularCostoDelCombustible() {
        return combustible.getPrecio()*7.0;
    }
}
