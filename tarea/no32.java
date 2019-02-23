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
public class no32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        float centimetros = 0;
        float pulgadas = (float) 0.39737;
        
        System.out.println("Ingrese la cantidad en centimetros para convertilos a pulgadas");
        centimetros = Float.valueOf(sc.next());
        
        System.out.println("la medida en pulgadas es de:."+(centimetros*pulgadas));
        
    }
}