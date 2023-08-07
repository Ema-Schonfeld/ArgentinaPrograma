package ejercicio2.guia4;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora(int carga, int precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }


    
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga >= 30){
            precio += 500;
        }
        System.out.println("El precio final de la lavandora es de: $" + precio);
        //(dia !=1 ? dia + "dias" : dia + "dia");
    }
}
