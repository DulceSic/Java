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
public class Numero1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        float numero = 0;
        
        System.out.println("Ingrese un numero");
        numero = Float.valueOf(entrada.next());
        
        if(numero >=0 && numero < 10)
        {
        System.out.println("El numero solo tiene 1 digito");
        }
        if(numero >=10 && numero < 100)
        {
            System.out.println("El número tiene 2 dígitos");
        }
        if(numero >=100 && numero < 1000)
        {
            System.out.println("El número tiene  3 dígitos");
        }
        else if(numero >=1000 && numero < 10000)
        {
            System.out.println("El número tiene 4 dígitos");
        }
        else
        {
            System.out.println("Esta opcion es valida");
        }    
    }
   
}
