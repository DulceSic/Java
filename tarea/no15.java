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
public class no15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int años = 0;
        int meses = 0;
        int edad = 0;
        
        System.out.println("Ingresa el años ");
        años = Integer.valueOf(sc.next());
        System.out.println("Ingresa los meses ");
        meses = Integer.valueOf(sc.next());
        edad = (años * 12) + meses;
        System.out.println("tu edad en meses es de:."+ edad);
        
    }
    
}
