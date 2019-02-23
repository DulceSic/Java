/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.Scanner;

/**
 *
 * @author ANTONIO
 */
public class no13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int valor1 = 0;
        int valor2 = 0;
        int operacion1 = 0;
        int operacion2 = 0;
        
        System.out.println("Ingresa el primer valor:");
        valor1 = Integer.valueOf(sc.next());
        System.out.println("Ingresa el primer valor:");
        valor2 = Integer.valueOf(sc.next());
        operacion1 = (valor1 * 2) + (valor2 *valor2);
        operacion2 = ((valor1 * valor1 * valor1)+(valor2 * valor2 * valor2))/3;
        
        System.out.println("La primera operacion es: " + operacion1);
        System.out.println("La segunda operacion es: " + operacion2);
    }
    
}
