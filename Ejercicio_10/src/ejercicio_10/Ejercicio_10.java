/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author jdavi
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PUNTO 10
       /**
        *10 Diseñe e implemente en Java una clase que permita simular el
        * movimiento de caída libre de un cuerpo. Defina las variables que
        * considere necesarias, método constructor, getter y setter, método
        * miembros que permitan conocer la distancia recorrida por el cuerpo en
        * un tiempo t, y la velocidad final alcanzada. Cree una clase principal,
        * instancia un objeto y demuestre su comportamiento.

        */
       
       Scanner entrada = new Scanner(System.in);
      
        System.out.println("Caida Libre ");
        System.out.print("Velocidad inicial       : ");
        double velocidad = entrada.nextDouble();
        System.out.print("Tiempo en tarde en caer : ");
        double tiempo2 = entrada.nextDouble();
        System.out.print("Tiempo para que distancia recorre : ");
        double tiempo = entrada.nextDouble();
        
        CaidaLibre c = OpeCaida(velocidad, tiempo, tiempo2);
        ImprimirCaida(c);  
    }
       public static CaidaLibre OpeCaida(double vel, double tiem, double tiem2){
           CaidaLibre c = new CaidaLibre();
           
           c.setVelocidad(vel);
           c.setTiempo(tiem);
           c.setTiempo2(tiem2);
     
           
           return c;
       }
       
       
       public static void ImprimirCaida(CaidaLibre c){
        
        System.out.println("----------------------------------------");
        System.out.printf("Distancia recoorida en %.1f : %.2f\n",c.getTiempo(), c.Distancia());
        System.out.printf("Velocidad final     : %.2f\n", c.Velocidad());
       }
       
           
  }
       
       
       
    
    

