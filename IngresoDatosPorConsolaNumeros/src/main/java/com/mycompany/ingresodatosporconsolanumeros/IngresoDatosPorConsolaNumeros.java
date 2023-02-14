/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ingresodatosporconsolanumeros;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class IngresoDatosPorConsolaNumeros {

    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Ingrese un numero a dividir");
        double lect1 = num1.nextDouble();
        
        Scanner num2 = new Scanner(System.in);
          System.out.println("Ingrese otro numero a dividir");
          double lect2 = num2.nextDouble();
         
          double resultado = lect1 / lect2;
      
        System.out.println("Su division fue: " + " " + resultado);
        
        
        
    }
}
