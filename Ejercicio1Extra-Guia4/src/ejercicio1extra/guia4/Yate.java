package ejercicio1extra.guia4;

public class Yate extends BarcoMotor {

    private int camarotes;

    public Yate(int camarotes, int potenciaCV, String matricula, double eslora, int anio) {
        super(potenciaCV, matricula, eslora, anio);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    
    @Override
    public double calcularModulo() {
        return super.calcularModulo()+this.camarotes;
    }
}
