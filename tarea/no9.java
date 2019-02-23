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
public class no9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner sc = new Scanner(System.in);
        
        float precio = (float) 0;
        int horas = 0;
        int horas_x = 0;
        
        System.out.println("Ingresa el precio de la hora:");
        precio = Float.valueOf(sc.next());
        System.out.println("Ingresa las horas trabajadas:.");
        horas = Integer.valueOf(sc.next());
        System.out.println("Ingresa las horas extra trabajadas:.");
        horas_x = Integer.valueOf(sc.next());
        
        System.out.println("Tu sueldo es de:."+ ((precio * horas) +(precio * (horas_x * 2))));
    }
    
}

