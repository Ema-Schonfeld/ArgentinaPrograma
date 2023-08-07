package ejercicio2.guia4;

public class Televisor extends Electrodomestico {

    private double resolucion;

    private boolean sintonizador;


    public Televisor(double resolucion, boolean sintonizador, int precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    @Override
    public void precioFinal() {
        super.precioFinal(); //precio = (resolucion > 40) ? precio += ((precio *30) / 100) : precio;
        if (resolucion > 40){
            precio += ((precio*30) / 100);
        }
        if (this.sintonizador == true){
            precio += 500;
        }
        System.out.println("El precio final de la tele es: $" + precio);
    }
}
