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
public class no29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        float numero1 = 0;
        float numero2 = 0;
        float numero3 = 0;
        float promedio = 0;
        
        System.out.println("ingresa la nota1");
        numero1 = Float.valueOf(sc.next());
        System.out.println("ingresa la nota2");
        numero2 = Float.valueOf(sc.next());
        System.out.println("ingresa la nota3");
        numero3 = Float.valueOf(sc.next());
        promedio = (numero1+numero2+numero3)/3;
        
        if(promedio >= 16){
            System.out.println(promedio);
            System.out.println("El promedio total es 20 gano");
            
        }
        else if(promedio >= 9.5){
            System.out.println("Aprobado");
        }
        else{
            System.out.println("Desaprobado");
        }
        
    }
    
}
