/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglos;

/**
 *
 * @author Usuario
 */
public class Arreglos {

    public static void main(String[] args) 
    {
        // EN REALIDAD SON MATRICES
        int[][] matriz1 = new int[4][4];   //se colocan antes del nombre los corchetes
        
        for(int i=0; i<matriz1.length; i++) // el primer for aumenta cuando el 2do llega  a 5
        {
            for(int j=0; j<matriz1.length; j++)
            {
                matriz1[i][j]=j; //funciona como un push, igual ver bien la funcion de la i fuera de los corchetes
                //se coloca i porque el 1er for imprime los 0 y los 1 necesarioas hasta que el otro for llegue a su nro
                //el segundo for va de el nro 0 hasta el 5 por ej. por eso no se lo pone
            }
        }
        // RAZONAR BIEN TODO ESTO, COMPRENDERLO
        for(int i=0; i<matriz1.length; i++)
        {
            for(int j=0; j<matriz1.length; j++)
            {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();  // espacios entre bloque de matrices
            // en este caso no sirve porque estan con print solo
        }
        
      /*  double[][] matriz2 = new double[4][4];
        
        for(int i=0; i<matriz2.length; i++)
        {
            for(int j=0; j<matriz2.length; j++)
            {
                matriz2[i][j]= Math.floor((Math.random())*10); //Math con primera en MAYUSCULA
                System.out.println(matriz2[i][j]);
                    }
        }
        */
        
        
    }
}
