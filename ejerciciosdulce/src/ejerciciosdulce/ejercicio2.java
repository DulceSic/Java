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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int num[];
        
        num = new int[5];
        
        int conta_positivo = 0, conta_negativo = 0, conta_ceros = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa un valor ");
            num[i] = Integer.valueOf(sc.next());
            
            if(num[i] > 0){
                conta_positivo++;
            }
            else if(num[i] < 0){
                conta_negativo++;
            }
            else{
                conta_ceros++;
            }
        }
        
        System.out.println("La cantidad de los positivos es de"+ conta_positivo);
        System.out.println("La cantidad de los negativos es de"+ conta_negativo);
        System.out.println("La cantidad de ceros es de "+ conta_ceros);
    }
    
}
        