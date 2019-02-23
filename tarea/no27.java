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
public class no27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int actual = 0;
        int nacimiento = 0;
        
        System.out.println("Ingrese su fecha actual");
        actual = Integer.valueOf(sc.next());
        System.out.println("Inrese la fecha del nacimiento");
        nacimiento = Integer.valueOf(sc.next());
        
        int edad = (actual-nacimiento);
        if (edad > 0 && nacimiento > 0 && actual > nacimiento)
        {
            System.out.println("Su edad es de"+(actual-nacimiento));
        }
        else{
            System.out.println("La fecha de nacimiento es negativa");
        }
    }
    
}
