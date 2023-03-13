/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejemploingresarelvalordelindice_enclaseatrib;

import Entidad.Llenado;
import Servicio.servicioLlenado;

/**
 * EXCELENTE EJEMPLO
 *
 * @author Usuario
 */
public class EjemploIngresarElValorDelIndice_enClaseAtrib {

    public static void main(String[] args) {

        servicioLlenado sll = new servicioLlenado();
        Llenado le = sll.Llenar(); //¿aca Estaba el problema? si señor
        //se le pasa como parametro o referencia al metodo llenar de la clase
        //servicio

        /*El problema es que en la clase EjemploIngresarElValorDelIndice_enClaseAtrib, estás creando un objeto Llenado llamado le, pero nunca lo estás llenando con los valores ingresados por el usuario desde la clase servicioLlenado. En su lugar, estás imprimiendo la representación de cadena del objeto le recién creado, que en su estado inicial tiene null como valor del atributo str.

        Para solucionar este problema, 
        debes asignar el objeto Llenado creado desde la clase servicioLlenado 
        al objeto Llenado creado en la clase
        EjemploIngresarElValorDelIndice_enClaseAtrib. Para hacer esto,
        modifica el método Llenar() en la clase servicioLlenado para que
        devuelva el objeto Llenado llenado con los valores ingresados por el 
        usuario, y luego asigna ese objeto a la variable le en la clase 
        EjemploIngresarElValorDelIndice_enClaseAtrib.*/
        System.out.println(le.toString());

    }
}
