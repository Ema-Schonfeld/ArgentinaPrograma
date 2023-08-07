
package ejercicio7.guia1.fase2;


public class Robot {
    private double bateria = 500;
    private String nombre;

    public Robot(String nombre) {
        this.nombre = nombre;
    }

    public float getBateria() {
        return bateria;
    }

    public void setBateria(float bateria) {
        this.bateria = bateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void avanzar(int pasos) {
        int pasosdados = 0;
        int pasosrestantes = pasos;
        while (this.bateriaVacia() && pasos != 0) {
            this.bateria = this.bateria - 0.1f;
            pasos--;
            pasosdados++;
            pasosrestantes--;
            System.out.print("Pasos realizados: "+pasosdados+" / Pasos restantes: "+Math.abs(pasosrestantes));
            System.out.printf(" Bateria restante: %.2f"+"\n", this.bateria);
        }
    }
    
    // while*bateria>=0){
    //bateria=bateria - (pasos*0.1);
    //}
    //return bateria;
    
    public boolean bateriaVacia() {
         return this.bateria > 0;
    }
}

