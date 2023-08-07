package ejercicio4.guia4;

public class Guerrero extends Personaje {

    private boolean caballo;

    public Guerrero(boolean caballo, String nick, Posicion ubicacion) {
        super(ubicacion, nick);
        this.caballo = caballo;
    }
    
    @Override
    public void Avanzar() {
        if (caballo = true){
            switch (orientacion) {
            case 'n':
                ubicacion.setY(ubicacion.getY()+10);
                break;
            case 'e':
                ubicacion.setX(ubicacion.getX()+10);
                break;
            case 's':
                ubicacion.setY(ubicacion.getY()-10);
                break;
            case 'o':
                ubicacion.setX(ubicacion.getX()-10);
            }
        }else{
            super.Avanzar();
        }
        System.out.println("El guerrero avanzó");
    }

    @Override
    public void Disparar() {
        super.Disparar();
        if (energia < 30){
            caballo = false;
            System.out.println("Ha perdido el caballo");
        }
        
    }
}
