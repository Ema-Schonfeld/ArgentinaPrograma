
package ejercicio6.guia1.parte2;


public class Ejercicio6Guia1Parte2 {

    
    public static void main(String[] args) {
        Triangulo Tri = new Triangulo (0, -5, 14);
        System.out.println("Es un triangulo valido? "+Tri.EsUnTriangulo());
        
        Tri.TipoTriangulo();
        
        Triangulo Tri2 = new Triangulo (-3,100,40);
        Tri2.setLado1(70);
        System.out.println("Es triangulo? "+Tri2.EsUnTriangulo());
        
        Tri2.TipoTriangulo();
    }
    
}
