/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clases;

/**
 *
 * @author Usuario
 */
public class EjemploDeClasesCuentasAhorro {
    double saldo;
    String titular;
    int numeroDeCuenta; //atributos en forma de variables!
    
    // SE CREAN LOS GETTERS, LOS SETTERS Y LOS CONSTRUCTORES
    public EjemploDeClasesCuentasAhorro(double saldo, String titular, int numeroDeCuenta) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    //ahora constructor vacio

    public EjemploDeClasesCuentasAhorro() 
    {
    }
      //fuera del constructor vacio
    
    // metodo = funcion (todo dentro del objeto dentro de la clase)
    public double consigSaldo(double consignacion){ 
            double nuevoSaldo = saldo + consignacion;
            saldo = nuevoSaldo;
            return nuevoSaldo;
        }
    // ahora un metodo para retirar dinero
    
    public double retirarGuita(double extraccion)
    {
       // double dineroMenos = saldo - extraccion; 
        //saldo = dineroMenos; 
       // return dineroMenos;
        
        //se puede acortar el codigo
        
        saldo = saldo - extraccion;
        return saldo;
    }
    
    
    //  GETTER AND SETTERS
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    
    
    
}
