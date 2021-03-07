/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author jdavi
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //PUNTO 7
       /**
        *  7. Implementar en java la clase que se indica en el diagrama de
        * clases (figura), incluyendo las validaciones necesarias en los métodos
        * consignar y retirar. Crear una clase principal en la que se cree un 
        * objeto de dicha y probar sus métodos.
        */
     
        Cuenta c = new Cuenta();
        c.setNoCuenta(1212);
        c.setNombre("Jesus");
        c.setSaldo(700000);
        
        Cuentinfo(c);
    }
    
     public static void Cuentinfo(Cuenta c){
        Scanner entrada = new Scanner(System.in);
        boolean aux2 = false;
        
        System.out.println("No Cuenta: " + c.getNoCuenta());
        System.out.println("Nombre Cliente: "+ c.getNombreCliente());
        System.out.println("Saldo: "+ c.getSaldo());
        System.out.print("1.Consignar // 2.Retirar:  ");
        int aux = entrada.nextInt();
        if (aux == 1)
           aux2= c.Consignar(aux2); 
        else
           aux2 = c.Retirar(aux2);
       
        if (aux2 == true)
        {
             System.out.print("Saldo a Retirar: ");
             int rt = entrada.nextInt();
             c.setSaldo(700000-rt);
        }
        else
        {
             System.out.print("Saldo a Cosignar: ");
             int rt = entrada.nextInt();
             c.setSaldo(700000+rt);
        } 
        System.out.println("----------------------------------------");
        System.out.println("Nuevo saldo");
        System.out.println("No Cuenta: " + c.getNoCuenta());
        System.out.println("Nombre Cliente: "+ c.getNombreCliente());
        System.out.println("Saldo: "+ c.getSaldo());
        
         
     }
   
    
    
    
    
    
    
    
    
    
}
