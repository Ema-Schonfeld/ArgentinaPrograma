
package ejercicio4.guia4;


public class Ejercicio4Guia4 {

   
    public static void main(String[] args) {
        
        Posicion dondeEstoy = new Posicion (200,100);
        Guerrero Thor = new Guerrero (true, "Thor", dondeEstoy);
        
        int aux = 1;
        while (aux <= 3){
            aux ++;
             Thor.Girar();
        }

        System.out.println("----------------");
        
        aux = 1;
        while (aux <= 5){
            aux ++;
             Thor.Avanzar();
        }
       
        System.out.println("----------------");
        
        aux = 1;
        while (aux <= 8){
            aux ++;
             Thor.Disparar();
        }
        
        
    }
    
}
