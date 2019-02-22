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
public class no5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String producto = "";
        float valor = 0;
        float descuento = (float) 0.35;
        float total = 0;
        float monto = 0;
        
        System.out.println("Ingrese el producto de la farmacia o la compra:");
        producto = sc.next();
        System.out.println("Ingres el valor del producto de la farmacia");
        valor = sc.nextInt();
        monto = valor * descuento;
        total = valor - monto;
        System.out.println("EL descuento del producto"+producto+"es:"+monto);
        System.out.println("El total a pagar con el descuento aplicado es de: Q."+total);
          
    }
    
}
