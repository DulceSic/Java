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
public class no1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int prestamo = 10000;
        float interes = (float) 0.27;
        float monto = 0;
        int años = 0;
        
        System.out.println("El prestamo dado es de: Q"+prestamo);
        monto = prestamo * interes;
        System.out.println("El monto toral a pagar es de: Q"+monto);
   
    }
    
}
