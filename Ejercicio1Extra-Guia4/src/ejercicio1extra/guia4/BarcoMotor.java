package ejercicio1extra.guia4;

public class BarcoMotor extends Barco {

    private int potenciaCV;

    public BarcoMotor(int potenciaCV, String matricula, double eslora, int anio) {
        super(matricula, eslora, anio);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + this.potenciaCV;
    }
}
