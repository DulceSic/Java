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
public class no12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        float descuento =(float) 0.20;
        float sueldo = 0;
        
        System.out.println("Ingresa tu sueldo actual:");
        sueldo = Float.valueOf(sc.next());
        System.out.println("Tu nuevo sueldo es de: "+ (sueldo - (sueldo * descuento)));
    }
    
}