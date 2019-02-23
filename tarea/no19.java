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
public class no19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int n_final = 0;
        
        System.out.println("Ingresa la primera nota:.");
        nota1 = Integer.valueOf(sc.next());
        System.out.println("Ingresa la segunda nota:.");
        nota2 = Integer.valueOf(sc.next());
        System.out.println("Ingresa la tercera nota:.");
        nota3 = Integer.valueOf(sc.next());
        
        System.out.println("Tu nota final es de:"+(nota1 + nota2 + nota3));
    }
    
}
