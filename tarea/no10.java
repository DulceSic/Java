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
public class no10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        float mts_cubico = (float)0.5;
        float largo = 0;
        float anch = 0;
        
        System.out.println("Ingrese el largo de la pared en metros:");
        largo = Float.valueOf(sc.next());
        System.out.println("Ingrese el ancho de la pared en metros:");
        anch =  Float.valueOf(sc.next());
        
        System.out.println("La arena requerida es de:."+ ((largo * anch )*mts_cubico));
        
    }
    
}
