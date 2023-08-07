package ejercicio2extra.guia4;

public class Combustible {

    private double precio;

    private String tipoDeCombustible;

    public Combustible(double precio, String tipoDeCombustible) {
        this.precio = precio;
        this.tipoDeCombustible = tipoDeCombustible;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }
}
