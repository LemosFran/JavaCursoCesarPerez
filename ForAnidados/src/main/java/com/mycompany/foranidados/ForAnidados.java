/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.foranidados;

/**
 *
 * @author Usuario
 */
public class ForAnidados {

    public static void main(String[] args) {
        
       
        
       int sum;
       for(int k=1; k<5; k++) //avanza 1 cuando el for de abajo llega a 5
        {
            for(int l=1; l<5; l++)
            {
               sum = k * l;
               System.out.println(k + " * " + l + " es igual a: " + sum + "\n");
            }
                System.out.println(); //separa los bloques, con un espacio
        }
       
    }
}
