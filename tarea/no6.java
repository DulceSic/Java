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
public class no6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
 
       float aumento = (float) 0.08;
       float descuento = (float) 0.025;
       float sueldo = (float) 0;      
       float aumento_s = (float) 0;
       float descuento_s = (float) 0;       
       System.out.println("Ingresa tu sueldo:.");
       sueldo = Float.valueOf(sc.next());       
       aumento_s = sueldo * aumento;        
       descuento_s = sueldo * descuento;     
       System.out.println("Su descuento es de: "+ (descuento_s));      
       System.out.println("Su aumento es de:" + (aumento_s));    
       System.out.println("Tu sueldo actual es de:." + ((sueldo -descuento_s)+ aumento_s));

    }
    
}
