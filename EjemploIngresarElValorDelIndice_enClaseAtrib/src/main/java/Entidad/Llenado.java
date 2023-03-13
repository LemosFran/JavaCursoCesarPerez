/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Llenado {
    private String [] str;

    public Llenado() {
    }
    
    public Llenado(int longitud) //pequeño metodo para darle un nro de indices al array
    {
        str= new String[longitud];
    }

    public Llenado(String[] str) {
        this.str = str;
    }

    public String[] getStr() {
        return str;
    }

    public void setStr(String[] str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Llenado{" + "str=" + Arrays.toString(str) + '}';
    }
    
    
}
