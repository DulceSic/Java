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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); 
        
        int num1[], num2[], num3[];
        
        num1 = new int [10];
        num2 = new int [10];
        num3 = new int [20];
        
        System.out.println("Ingrese el primer arreglo:.");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+"Ingrese un numero:.");
            num1[i] = sc.nextInt();
        }
        
        System.out.println("Ingrese el segundo arreglo:.");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+"Ingrese un numero:.");
            num2[i] = sc.nextInt();
        }
        
        int j=0;
        for (int i = 0; i < 10; i++) {
            num3[j] = num1[i];
            j++;
            num3[j] = num2[i];
            j++;
        }
        
        System.out.print("\nEl tercer arreglo es de:.");
        for (int i = 0; i < 20; i++) {
            System.out.print(num3[i]+" ");
        }
        System.out.println("");
        
    }
}