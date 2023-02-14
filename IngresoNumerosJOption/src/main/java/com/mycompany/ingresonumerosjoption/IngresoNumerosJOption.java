/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ingresonumerosjoption;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class IngresoNumerosJOption {

    public static void main(String[] args) {
       String nomb = JOptionPane.showInputDialog("Ingrese su nombre");
       int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
       
       double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura wacho"));
       JOptionPane.showMessageDialog(null,"Hola "+ nomb + "\n"+ "cuya edad es de "+ edad + "años"+"\n"+"Y de altura "+altura+"Metros");
       
    }
}
