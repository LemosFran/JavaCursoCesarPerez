/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primerp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PrimerP {

    public static void main(String[] args) throws IOException {
      // Primero las 2 formas de ingresar datos
      //Buffered Reader
      
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); // se declara antes, se sabe que se va a ing algo
        System.out.println("Ingrese Su Nonbre");
        String nonvre = entrada.readLine(); // lee lo que se ingreso y lo guarda en una variable
      
        
        // Ahora com scanner
        
        Scanner tecla = new Scanner(System.in);
        System.out.println("ahora su apellido");
        String ingre = tecla.next();
        
        System.out.println("Hola "+ nonvre + " De Apellido "+ ingre);
    }

  

}
