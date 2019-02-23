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
public class no7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        float urgencias = (float) 0.37;
        float pediatria = (float) 0.42;
        float traumatologia = (float) 0.21;
        float presupuesto = (float) 0;
        
        System.out.println("Ingresa presupuesto:.");
        
        presupuesto = Float.valueOf(sc.next());
       
        System.out.println("El presupuesto para la Emergencias es de:"+(presupuesto * urgencias) );
        
        System.out.println("El presupuesto para el area de Pediatria es de:"+(presupuesto * pediatria) );
        
        System.out.println("El presupuesto para el area de Traumatologia es de:"+(presupuesto * traumatologia) );
 
    }
    
}
