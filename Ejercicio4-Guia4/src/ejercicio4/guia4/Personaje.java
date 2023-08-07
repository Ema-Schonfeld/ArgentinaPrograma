package ejercicio4.guia4;

public class Personaje {

    protected Posicion ubicacion;

    protected String nick;

    protected int vidas = 3;

    protected int energia = 100;

    protected char orientacion = 'n';

    public Personaje(Posicion ubicacion, String nick) {
        this.ubicacion = ubicacion;
        this.nick = nick;
    }

    public Posicion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Posicion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public char getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(char orientacion) {
        this.orientacion = orientacion;
    }

    public void Disparar() {
        if (energia > 0){
            System.out.println("Un personaje disparó...");
            energia -= 10;
            System.out.println("Le queda " + energia + " de energia");
        }else{
            System.out.println("No tiene mas energia");
        }
    }

    public void Girar() {
        switch (orientacion) {
            case 'n':
                orientacion = 'e';
                break;
            case 'e':
                orientacion = 's';
                break;
            case 's':
                orientacion = 'o';
                break;
            case 'o':
                orientacion = 'n';
        }
        System.out.println("La orientacion es: " + orientacion);
    }

    public void Avanzar() {
        switch (orientacion) {
            case 'n':
                ubicacion.setY(ubicacion.getY()+1);
                break;
            case 'e':
                ubicacion.setX(ubicacion.getX()+1);
                break;
            case 's':
                ubicacion.setY(ubicacion.getY()-1);
                break;
            case 'o':
                ubicacion.setX(ubicacion.getX()-1);
        }
    }
}
