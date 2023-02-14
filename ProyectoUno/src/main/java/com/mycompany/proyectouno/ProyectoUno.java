

package com.mycompany.proyectouno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class ProyectoUno {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese Su Nombre");
        String nombre = entrada.readLine();
        System.out.println("Hola " + nombre);
        
        Scanner tecla = new Scanner(System.in);
        System.out.println("Ahora ingrese su apellido");
        String apellido = tecla.next();
        System.out.print("Hola "+nombre+ " de apellido "+ apellido);
    }
}
