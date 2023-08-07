/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ8;

import java.util.Scanner;

/**
 *
 * @author Matìas Fernàndez
 */
public class Ejercicio_8 {
        public static void main(String[] args) {
            Scanner Alicia=new Scanner(System.in);
            
            System.out.println(Calculo.esPrimo(Alicia.nextInt()));
            System.out.println(Calculo.valorAbsoluto(-12));
            System.out.println(Calculo.calcularRaices(2, 0, 1));
        
        }
}
