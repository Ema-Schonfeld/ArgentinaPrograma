
package ejercicio3.guia1.parte2;


public class Circulo {
    
    private double radio, pi;


    public Circulo(double radio) {
        this.radio = radio;
        this.pi = Math.PI;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
   
    public double calcularArea(){
        
        return pi * Math.pow(radio,2);
    }
    
    public double calcularPerimetro(){
        return 2 * pi * radio;
    }
}
