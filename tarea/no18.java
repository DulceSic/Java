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
public class no18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        float Tasa = (float) 0.15;
        float valor_compra = 0;
        float descuento = 0;
        
        System.out.println("Ingrese el valor de la compra:");
        valor_compra = Float.valueOf(sc.next());
        
        descuento = valor_compra * Tasa;
        System.out.println("Tu descuento es de:"+ descuento);
        
        System.out.println("Tu total a pagar esde:" + (valor_compra - descuento));
        
        
    }
    
}