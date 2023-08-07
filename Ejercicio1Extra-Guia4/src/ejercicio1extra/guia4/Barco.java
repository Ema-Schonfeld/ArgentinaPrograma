package ejercicio1extra.guia4;

public abstract class Barco {

    protected String matricula;

    protected double eslora;

    protected int anio;

    protected double modulo;

    public Barco(String matricula, double eslora, int anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
        this.modulo = modulo = this.eslora*10;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getModulo() {
        return modulo;
    }

    public void setModulo(double modulo) {
        this.modulo = modulo;
    }
    
    public double calcularModulo(){
        return eslora*10;
    }
}

