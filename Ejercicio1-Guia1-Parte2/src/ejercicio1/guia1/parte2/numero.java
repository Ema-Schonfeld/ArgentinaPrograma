
package ejercicio1.guia1.parte2;

public class numero {

    private int valor;

    public numero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean esPar() {
        return valor % 2 == 0;
    }
    
    public boolean esPositivo(){
        return valor >= 0;
    }
    
    public boolean esMultiplo (int numero){
        return valor % numero == 0;
    }
}
