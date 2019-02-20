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
public class numero4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int dia, mes, año;
        System.out.println("Ingresa un dia: ");
        dia=entrada.nextInt();
        
        System.out.println("Ingresa el mes: ");
        mes=entrada.nextInt();
        
        System.out.println("Ingresa el año: ");
        año=entrada.nextInt();
        
        if (dia >= 1 && dia <=31)
            if (mes >= 1 && mes <=12)
                if (año != 0)
                    System.out.println("Que la fecha sea correcta");
                else
                    System.out.println("Que el año sea incorrecto");
            else
                System.out.println("Que el mea sea incorrecto");
        else 
            System.out.println("Que el dia sea incorrecto");
            
    }
    
}
