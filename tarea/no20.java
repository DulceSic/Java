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
public class no20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        
        int no_hombre = 0;
        int no_mujeres = 0;
        int total = 0;
        
        System.out.println("Ingresa la cantidad de hombres:");
        no_hombre = Integer.valueOf(sc.next());
        System.out.println("Ingresa la cantidad de mujeres:");
        no_mujeres = Integer.valueOf(sc.next());
        
        total = no_hombre + no_mujeres;
        
        System.out.println("El porcentaje de mujeres es de:" + ((no_mujeres *100) / total));
        System.out.println("El porcentaje de hombres es de:" + ((no_hombre *100) / total));
    }
    
}