/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Funciones {
    // FUNCION SIMPLE
    public static void saludar(){
        JOptionPane.showMessageDialog(null, "Hola Hola");
    }
    // FUNICION CON UN PARAMAETRO
    public static void saludarA(String nombreASaludar){
        JOptionPane.showMessageDialog(null, "Hola " + nombreASaludar);
    }
    
    public static int sumarDosNros(int num1, int num2){
        int sumatoria = num1+num2;
            return sumatoria;
    }
    
    public static void main(String[] args) {
       saludar();
       
       String nom1 = JOptionPane.showInputDialog("Ingresa tu nombre");
       saludarA(nom1);
       
       int numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el peimer numero"));
       int numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
       
       // crear una variable para mostrar con el joptionPane
       
       int resultado = sumarDosNros(numero1, numero2);
       JOptionPane.showMessageDialog(null, resultado);
       
}}
