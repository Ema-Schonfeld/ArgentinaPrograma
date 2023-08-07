
package EJ7;


public class Robot {
    
    private double bateria=500;
    private String nombre;
    
    public Robot(String nombre) {
        this.nombre=nombre;
    }
    
    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double avanzar(int pasos){
        int cont=0;
        
        while (bateria>0){
            System.out.println("Bateria: "+bateria);
            bateria = bateria-(pasos*0.1);
            cont++;
        }
        System.out.println("Pasos dados: "+cont);
        return 0;
    }
    
    public boolean bateriaVacia(){
    
       if(bateria<=0){
           return true;
       }else {
       return false;
       }
        
    }
    
    
    
    
}
