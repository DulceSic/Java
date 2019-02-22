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
public class no2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        double kilometros= 0;
        double costo_km = 10.50;
        
        System.out.println("Ingrese cantidad de los kilometros a recorrer: ");
        kilometros = Double.valueOf(sc.next());
        
        System.out.println("El precio del boleto: Bs."+(costo_km * kilometros)+"\nprecio de cada kilometro: Bs."+costo_km);
        
        
    }
    
}
