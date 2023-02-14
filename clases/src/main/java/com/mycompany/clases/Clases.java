/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clases;

/**
 *
 * @author Usuario
 */
public class Clases {

    public static void main(String[] args) {
       EjemploDeClasesCuentasAhorro cuenta1 = new EjemploDeClasesCuentasAhorro(2000, "macaraca", 2);
    System.out.println(cuenta1.getTitular());// sintaxis dentro del main
    System.out.println(cuenta1.getSaldo());
    System.out.println(cuenta1.getNumeroDeCuenta());
    
    cuenta1.setTitular("Franquito Ariel"); //se cambia el titular
    
    // ejecutamos la func consignar
    cuenta1.consigSaldo(152200);
    
        System.out.println(cuenta1.getSaldo());
        
    cuenta1.retirarGuita(154000);
    
        System.out.println(cuenta1.getSaldo());
    
    }
}
    
