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
public class no23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        
        float numero = 0;
        
        System.out.println("ingrese numero para elevarlo al cubo");
        numero = Float.valueOf(sc.next());
        
        System.out.println("el numero elevado al cubo es "+(numero*numero*numero));
        
    }
    
}
