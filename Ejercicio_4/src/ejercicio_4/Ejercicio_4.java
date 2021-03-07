/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author jdavi
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PUNTO 4
       /**
        4. Implementa la clase Bicicleta, que tiene tres atributos, 
        * velocidadActual, platoActual y piñonActual, de tipo entero, método
        * constructor, getters y setters, y los siguientes métodos miembros:
        * acelerar (), frenar (), cambiarPlato (int plato), y cambiarPiñon 
        * (int piñon), donde el primero dobla la velocidad actual, el segundo 
        * reduce a la mitad la velocidad actual, y el tercero y cuarto ajustan
        * el plato y el piñón actual respectivamente según los parámetros
        * recibidos. Crear una clase principal, e instancia un objeto bicicleta
        * y mostrar sus comportamientos.
        */
        Bicicleta a = new Bicicleta();
        
        Scanner entrada = new Scanner(System.in);
      
        
        System.out.println("Comportamiento de Bicilet ");
        System.out.print("¿Desea acelerar? 1.Si /2.No: ");
        int n=entrada.nextInt();
        System.out.print("¿Desea fenar? 1.Si /2.No : ");
        int n2=entrada.nextInt();
         System.out.print("¿Desea cambiar el plato? 1.Si /2.No: ");
        int n4=entrada.nextInt();
        if (n4 == 1){
             System.out.print("Numero de plato: ");
             int pl = entrada.nextInt();
             a.cambiarPlato(pl);
        }
        System.out.print("¿Desea cambiar piñon? 1.Si /2.No ");
        int n3=entrada.nextInt();
        if (n3 == 1){
             System.out.print("Numero de piñon: ");
             int pi = entrada.nextInt();
             a.cambiarPiñon(pi);
        }
        System.out.println("----------------------------------------");
        if (n == 1){
            System.out.println("Velocidad : "+ a.acelerar());
        }
        else{
            System.out.println("Velocidad : "+ a.getVelocidad());
        }
          if (n2 == 1)
            System.out.println("Velocidad frenada : "+ a.frenar());
      
        System.out.println("plato : " + a.getPlato());
        System.out.println("piñon: " + a.getPiñon());
  
    
    }
    
    
    
    
    
    
    
    
}
