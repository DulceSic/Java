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
public class no31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        float PI = (float) 3.1416;
        float radio = 0;
        float area = 0;
        
        System.out.println("Bienvenido al prgrama de calcular area de un circulo");
        System.out.println("Ingrese radio de un circulo");
        
        radio = Float.valueOf(sc.next());
        
        area = (PI*(radio*radio));
        
        System.out.println("El area del circulo es de:."+area);
    }
    
}
