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
public class no3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        float horas = 0;
        float costo_h = (float) 1.5;
        float total = 0;
        float resto = 0;
        
        System.out.println("Ingrese las horas que estara en el Internet:");
        horas = sc.nextFloat();
        
        if (horas < 5)
        {
            total = horas * costo_h;
            System.out.println("El total a pagar en el internet es de: Q."+total);
        }
        else if (horas > 5)
        {
            resto = horas -1;
            total = (float) (resto * 1.5);
            System.out.println("Se le dara un hora gratis por pasarse de las 5 horas");
            System.out.println("Su total a pagar es de: Q."+total);
        }
        else
        {
            System.out.println("Ingrese lo que se le pide por favor");
        }
        
        }
 
    }
    
