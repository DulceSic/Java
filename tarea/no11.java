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
public class no11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner sc = new Scanner(System.in);
        float segundos = (float ) 0;
        float minutos = (float ) 0;
        float hora = (float ) 0;
        float pre_segun = (float ) 0.25;
        float tiempo_s = (float ) 0;
        System.out.println("Ingresa la cantidad de horas:.");
        hora = Float.valueOf(sc.next());
        System.out.println("Ingresa la cantidad de minutos:.");
        minutos = Float.valueOf(sc.next());
        System.out.println("Ingresa la cantidad de segundos:.");
        segundos = Float.valueOf(sc.next());
        tiempo_s = segundos + (minutos * 60 )+ ((hora * 60)*60) ;
        System.out.println("El costo es:."+ (tiempo_s * pre_segun));
    }
    
}