package ejercicio2.guia4;

public class Electrodomestico {

    protected int precio;        

    protected String color;

    protected char consumo;

    protected double peso;


    public Electrodomestico(int precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    

    public void comprobarConsumoEnergetico(char letra) {
        switch (letra){
            case 'a':
                consumo = 'a';
                break;
            case 'b':
                consumo = 'b';
                break;
            case 'c':
                consumo = 'c';
                break;
            case 'd':
                consumo = 'd';
                break;
            case 'e':
                consumo = 'e';
                break;
            default:
                consumo = 'f';
        }
    }

    public void comprobarColor(String Color) {
        switch (Color) {
            case "negro":
                color = Color;
                break;
            case "rojo":
                color = Color;
                break;
            case "azul":
                color = Color;
                break;
            case "gris":
                color = Color;
                break;
            default:
                color = "blanco";
        }
        
    }

    public void precioFinal() {
        switch (this.consumo) {
            case 'a':
                precio += 1000;
                break;
            case 'b':
                precio += 800;

                break;
            case 'c':
                precio += 600;

                break;
            case 'd':
                precio += 500;
                break;
            case 'e':
                precio += 300;
                break;
            default:
                precio += 100;       
        }
        if (peso >= 1 && peso <= 19) {
                   precio += 100;
                }else if(peso >= 20 && peso <= 49){
                    precio +=500;
                }else if (peso >= 50 && peso <= 79){  
                    precio +=800;
                }else if (peso >= 80){
                    precio += 1000;
                }
        System.out.println("El precio base del electrodomestico es: $" + precio);
    }    
}
