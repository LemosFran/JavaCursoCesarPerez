/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploswitch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjemploSwitch {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Scanner ingNum = new Scanner(System.in);
        System.out.println("Ingrese un dato");
        
        switch (ingNum.nextInt()) {
            case 1 -> System.out.println("macanaki"); //te ahorras poner el break
            case 2 -> System.out.print("macanaqui 2");
            default -> {
                System.out.println("Ese nro no macanaki");;
            }
        }
       
    }
}
