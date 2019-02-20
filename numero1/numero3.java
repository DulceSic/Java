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
public class numero3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int numero1 = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int numero2 = 0;
       
        System.out.println("Ingrese el numero");
        numero1=entrada.nextInt();
        numero2=numero1;
        if(numero1>999)
        {
            a=numero1/1000;
            numero1-=(a*1000);    
        }
        if(numero1>99)
           {
                b=numero1/100;
                numero1-=(b*100);
           }
        if(numero1>9)
           {
               c=numero1/10;
               numero1-=(c*10);
               
           }
        if(numero1<10)
        {
            d=numero1;
        }    
        if(a==c||b==d)
        {
            System.out.println("si es capiua");
        }
        else
        {
                System.out.println("no es capicua");
    }
}    
}
