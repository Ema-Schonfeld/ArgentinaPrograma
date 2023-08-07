
package ejercicio10.guia1.parte2;


public class Pensador {
    
    private int num;

    public Pensador(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public int invertir(){
        int invertido=0;
        int resto;
        int num2=num;
        while( num2 > 0 ) {
         resto = num2 % 10;
         invertido = invertido * 10 + resto;
         num2 /= 10;
        }
        return invertido;
    }
    
    public int ParAntes(){
        int num2=num;
        
       if (num2 %2 ==0){
           return num2-2;
       }else{
           return num2-1;
       }
    }
    
    public int ParPosterior(){
        int num2=num;
        if (num2 %2 ==0){
           return num2+2;
       }else{
           return num2+1;
       }
    }
  
    public int PrimerDigito(){
       
        int aux = num;
        while (aux > 10){
            aux = aux / 10; 
        }
        return aux;
    }
    
    public int UltimoDigito(){
        
        int aux = num;
        return aux % 10;
    }
}
