/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplos_foreach;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Ejemplos_ForEach {

    public static void main(String[] args) {
     // Vector con numeros
        int [] num1 = {45, 54, 8, 26, 15};
     // Vector con Strings
        String [] str1 = {"gabriel omar", "cuca", "zaza", "sarasa"};        
    
        // for con sout normal
        for(int jojo:num1) //sin []
        {
            System.out.println(jojo);
        }
        
        // sout toString
        
            System.out.println(Arrays.toString(num1));// Se coloca el nombre del array no de la var
        
        // imprimimos los strings
        
        for(String jaja:str1)
        {
            System.out.println(jaja);
        }
        
        //Imprimir Strings a arrays to.string
        System.out.println(Arrays.toString(str1)); // los imprime con [] y separados por comas
        
        System.out.println();
        System.out.println();
        
        // Ahora forEcha de marices
        int [][] num2 = {{6}, {45}, {54}, {87}};
        String [][] str2 = {{"dodo", "juju"}, {"cucu", "dfs"}, {"nene", "saff"}};
        
        //Imprimir datos con ln nomrmal
        for(int [] sarasa1:num2)
        {
            for(int fafa: sarasa1) //siempre este nombre en el sout
            {
                System.out.println(fafa);
            }
        }
        
        //imprimir con arrays to string
        for(int [] sarasa1:num2)
        {
                //basta con un solo for
            //con dos for el resultado es el mismo
                System.out.println(Arrays.toString(sarasa1));
           
        }
        
        System.out.println();
        
        //Imprimimos la mat string
        for(String [] hj:str2)
        {
            for(String coco:hj) //larga la matriz armada como en el to.string
            {
                System.out.print(coco + " ");
            }
            System.out.println();
        }
        
        //Imprimimos con arrays to string
        for(String [] soso:str2)
        {
            System.out.print(Arrays.toString(soso) + " ");
            System.out.println();
        }
        
   // PRACTICA EN UNA MATRIZ CON DATOS INGRESADOS POR EL USUARIO
        
    }   
    
    
}
