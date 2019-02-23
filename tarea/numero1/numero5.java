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
public class numero5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int dia = 0;
        int mes = 0;
        int año = 0;
        
        System.out.println("ingrese el dia");
        dia = entrada.nextInt();
        System.out.println("ingrese el mes");
        mes = entrada.nextInt();
        System.out.println("ingrese el año");
        año = entrada.nextInt();
        
        if (año > 0)
        {
            if (mes > 0 && mes <= 12)
            {
                switch(mes)
                    {
                    case 1:
                        if (dia > 0 && dia <= 31)
                        {
                            System.out.println("la fecha es correcta");
                        }
                        else
                        {
                            System.out.println("la fecha es incorrecta"); 
                        }
                        break;
                    case 2:
                        if (dia > 0 && dia <= 28)
                        {
                            System.out.println("la fecha es correcta");
                        }
                        else
                        {
                            System.out.println("la fecha es incorrecta"); 
                        }
                        break;
                    case 3:
                        if (dia > 0 && dia <= 31)
                        {
                            System.out.println("la fecha es correcta");
                        }
                        else
                        {
                            System.out.println("la fecha es incorrecta"); 
                        }
                        break;
                    case 4:
                        if (dia > 0 && dia <= 30)
                        {
                            System.out.println("la fecha es correcta");
                        }
                        else
                        {
                            System.out.println("la fecha es incorrecta"); 
                        }
                        break;
                    case 5:
                        if (dia > 0 && dia <= 31)
                        {
                            System.out.println("la fecha es correcta");
                        }
                        else
                        {
                            System.out.println("la fecha es incorrecta"); 
                        }
                        break;
                    case 6:
                        if (dia > 0 && dia <= 30)
                        {
                            System.out.println("la fecha es correcta");
                        }
                        else
                        {
                            System.out.println("la fecha es incorrecta"); 
                        }
                        break; 
                    case 7:
                        if (dia > 0 && dia <= 31)
                        {
                            System.out.println("la fecha es correcta");
                        }
                        else
                        {
                            System.out.println("la fecha es incorrecta"); 
                        }
                        break;   
                    case 8:
                        if (dia > 0 && dia <= 31)
                        {
                            System.out.println("la fecha es correcta");
                        }
                        else
                        {
                            System.out.println("la fecha es incorrecta"); 
                        }
                        break;   
                    case 9:
                        if (dia > 0 && dia <= 30)
                        {
                            System.out.println("la fecha es correcta");
                        }
                        else
                        {
                            System.out.println("la fecha es incorrecta"); 
                        }
                        break; 
                    case 10:
                        if (dia > 0 && dia <= 31)
                        {
                            System.out.println("la fecha es correcta");
                        }
                        else
                        {
                            System.out.println("la fecha es incorrecta"); 
                        }
                        break;
                    case 11:
                        if (dia > 0 && dia <= 30)
                        {
                            System.out.println("la fecha es correcta");
                        }
                        else
                        {
                            System.out.println("la fecha es incorrecta"); 
                        }
                        break;    
                    case 12:
                        if (dia > 0 && dia <= 31)
                        {
                            System.out.println("la fecha es correcta");
                        }
                        else
                        {
                            System.out.println("la fecha es incorrecta"); 
                        }
                        break;
                    }
                }
                else
            {
                System.out.println("fecha incorrecta");
            }
        }
        else
        {
            System.out.println("la fecha es incorrecta");    
        }
   }
    
}