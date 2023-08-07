
package ejercicio2.guia1.parte2;


public class Cuadrilatero {
    private int largo;
    private int alto;
    
    public Cuadrilatero (int largo, int alto){
        this.largo = largo;
        this.alto = alto;        
    }
    
    //getter and setter

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    
    public int calcularPerimetro(){
        return largo*2 + alto*2;
    }
    
    public int calcularSuperficie(){
        return largo*alto;
    }
    
    public boolean esunCuadrado(){
        return largo == alto;
    }
}
