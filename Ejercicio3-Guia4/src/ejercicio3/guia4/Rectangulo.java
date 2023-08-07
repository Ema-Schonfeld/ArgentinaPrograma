package ejercicio3.guia4;

public class Rectangulo implements calculosFormas {
    
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public void calcularArea(){
        System.out.println("El area del rectangulo es: " + base*altura);
    }
    
    public void calcularPerimetro(){
        System.out.println("El perimetro del rectangulo es: " + (base*altura)*2);
    }
}
