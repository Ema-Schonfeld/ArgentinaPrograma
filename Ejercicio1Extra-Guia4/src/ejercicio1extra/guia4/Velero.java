package ejercicio1extra.guia4;

public class Velero extends Barco {

    private int cantMastiles;

    public Velero(int cantMastiles, String matricula, double eslora, int anio) {
        super(matricula, eslora, anio);
        this.cantMastiles = cantMastiles;
    }

    public int getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }
    
    @Override
    public double calcularModulo() {
        return super.calcularModulo() + this.cantMastiles;
    }

    
}
