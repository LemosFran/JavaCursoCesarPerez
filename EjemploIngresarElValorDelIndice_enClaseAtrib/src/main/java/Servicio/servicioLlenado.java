/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
import Entidad.Llenado;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class servicioLlenado {
    Scanner scan = new Scanner(System.in); 
    public Llenado Llenar() //tengo que retornar algo para que no me devuelva null
    {
        
        System.out.println("Ingrese la cantidad de espacios del array");
        int longi = scan.nextInt();
        
        Llenado ll = new Llenado(longi); //se instancia el metodo que esta
        //en la entiddad 
        
        String [] mc = new String[longi];
        
         for(int i=0; i<ll.getStr().length; i++)
         {
             System.out.println("Ingrese un valor para el array n°: "+i);
             
             mc[i]=scan.next();
         }
         
         ll.setStr(mc);
         
         return ll;
    }
}
