/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioabecedario;

import java.util.Scanner;

/**
 *
 * @author LYSSASIC
 */
public class Ejercicioabecedario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        
        char Mayuscula[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++)
        {
            Mayuscula[j] = (char) i;
        }   
        
        String cadena = "";
        int elegir = -1;
        
        do
        {
            System.out.println("Ingresa otro numero entre 0 y"+(Mayuscula.length -1));
            elegir = Integer.valueOf(sc.next());
            
            if (!(elegir >= 0 && elegir <= Mayuscula.length -1))
            {
                System.out.println("Lo sentimos error, ingrese otro numero");
            }
            else
            {
                if (elegir != -1)
                {
                    cadena += Mayuscula[elegir];
                }
            }
        } while (elegir != -1);
        System.out.println(cadena);
    }
}
    
        