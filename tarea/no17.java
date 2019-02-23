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
public class no17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        float Tasa = (float) 0.10;
        float sueldo = (float) 0;
        float venta1 = (float) 0;
        float venta2 = (float) 0;
        float venta3 = (float) 0;
        float comision = (float) 0;
        
        System.out.println("Ingrese el sueldo de base:");
        sueldo = Float.valueOf(sc.next());
        
        System.out.println("Ingrese valor de la primera venta:");
        venta1 = Float.valueOf(sc.next());
        System.out.println("Ingrese valor de la segunda venta:");
        venta2 = Float.valueOf(sc.next());
        System.out.println("Ingrese valor de la tercera venta:");
        venta3 = Float.valueOf(sc.next());
        
        comision = (venta1 + venta2 + venta3) * Tasa;
        
        System.out.println("Tu sueldo es de: " + sueldo);
        System.out.println("tu comision es de: "+ comision);
        System.out.println("Total:"+ (sueldo+comision));
        
    }
    
}