
package ejercicio9.guia1.parte2;

public class Fecha {
public int dia;
public int mes;
public int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

public boolean esBisiesto(){
 return año % 4 == 0 && año % 100 != 0 || año % 400 == 0;


}
    
 public int calcularAños(int dia2, int mes2, int año2) {
     System.out.println("la diferencia de dias es: "+Math.abs(+dia - dia2)); 
          System.out.println("la diferencia de Meses es: "+Math.abs(mes - mes2)); 
               System.out.println("la diferencia de años es: "+Math.abs(año - año2));
        return 0;
 }

}
    
   