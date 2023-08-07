package ejercicio3.guia4;

public class Circulo implements calculosFormas {

    private double pi;
    private int radio;
    private int diametro;

    public Circulo(double pi, int radio, int diametro) {
        this.pi = pi;
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
    
    @Override
    public void calcularArea(){
        System.out.println("El area del circulo es: " + pi*(Math.pow(radio,2)));
    }
    
    public void calcularPerimetro(){
        System.out.println("El perimetro del circulo es: " + pi*diametro);
    }
}
