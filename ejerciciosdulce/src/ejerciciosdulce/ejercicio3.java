/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdulce;

import java.util.Scanner;

/**
 *
 * @author ANTONIO
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero[];
        numero = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa un valor ");
            numero[i] = Integer.valueOf(sc.next());
        }
        System.out.println("los valores son");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("valor-"+ numero[i]+" valor2-"+numero[9-i]);
        }
    }
    
}