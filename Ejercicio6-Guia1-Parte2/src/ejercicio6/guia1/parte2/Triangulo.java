
package ejercicio6.guia1.parte2;


public class Triangulo {
    
    private int lado1, lado2, lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    
    public boolean EsUnTriangulo(){
        return this.lado1 + this.lado2 > this.lado3 &&
               this.lado1 + this.lado3 > this.lado2 &&
               this.lado2 + this.lado3 > this.lado1;
    }
    
    public String TipoTriangulo(){
        String TipoDeTriangulo = "No es un tipo de triángulo válido";
        if (this.lado1 > 0 && this.lado2 > 0 && this.lado2 > 0 && this.EsUnTriangulo()){
            if (this.lado1 == this.lado2 && this.lado2 == this.lado3){
                TipoDeTriangulo = "Equilátero";
            }else if
                    (this.lado1 == this.lado2 || this.lado1 == this.lado3 ||
                    this.lado2 == this.lado3){
                TipoDeTriangulo = "Isósceles";     
            }else{
                TipoDeTriangulo = "Escaleno";
            }
        }    
        System.out.println("TRIANGULO: "+TipoDeTriangulo);
        return TipoDeTriangulo;
    }
}
