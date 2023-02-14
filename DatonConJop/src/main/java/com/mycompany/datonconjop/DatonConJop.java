/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datonconjop;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class DatonConJop {

    public static void main(String[] args) {
       /* String nombre = JOptionPane.showInputDialog("Hola Parcero, Pone Tu Nombre");   //Con strings
        JOptionPane.showMessageDialog(null, "Hola "+nombre);
       */
        //Ahora con numeros
        
      int num1, num2, resultSuma;
      double resultDiv;
      num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero"));
      num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su otro numero"));
      resultSuma = num1 + num2;
      resultDiv = (double)num1 / num2; // Atento a la forma extraña de colocar el double
      JOptionPane.showMessageDialog(null, "la el resultado es: "+ resultSuma+ "\n" + " Y el resultado de la division es: "+ resultDiv);
      
      
        
        
    }
}
