/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero1;

import java.util.Scanner;

/**
 *
 * @author ANTONIO
 */
public class numero2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int numero = 0;
        int num = 0;
        
        System.out.println("Ingresa un numero para que lo muestre alreves");
        numero = entrada.nextInt();
       
        String str = String.valueOf(numero);
        String rpta = "";
        
        char[] valor = str.toCharArray();
        
        for (int i = valor.length-1; i>-1; i--)
        {
            rpta+= valor[i]+""; 
        }
        System.out.println("El numero alreves seria:"+ rpta);
                
        
        
        
    }
    
}
