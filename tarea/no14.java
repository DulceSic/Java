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
public class no14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int A = 0;
        int B = 0;
        int C = 0;
        System.out.println("Ingrese un numero de 0 a 9");
        A = Integer.valueOf(sc.next());
        System.out.println("Ingrese otro numero de o a 9");
        B = Integer.valueOf(sc.next());
        System.out.println("Ingrese otro nunero de 0 a 9");
        C = Integer.valueOf(sc.next());
        System.out.println(C+""+B+""+A);
        
    }
    
    }

