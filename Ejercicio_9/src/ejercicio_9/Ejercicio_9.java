/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author jdavi
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //PUNTO 9
       /**
        *9. Crea una clase Fracción con los atributos numerador y denominador, 
        * método constructor, métodos getter y setter, y los siguientes métodos 
        * miembros: sumarFraccion, restarFraccion, multiplicarFraccion, 
        * dividirFraccion, simplificarFraccion e imprimirFraccion. Crear una
        * clase principal, instancia dos fracciones e imprime el resultado de
        * su suma, multiplicación, resta y división. El resultado impreso 
        * debe estar simplificado
        */
     
        Scanner entrada = new Scanner(System.in);
      
        System.out.println("Fraccion 1 ");
        System.out.print("Numerador  : ");
        double numerador=entrada.nextInt();
        System.out.print("Denominador: ");
        double denominador=entrada.nextInt();
        System.out.println("Fraccion 2");
        System.out.print("Numerador  : ");
        double numerador2=entrada.nextInt();
        System.out.print("Denominador: ");
        double denominador2=entrada.nextInt();
 
        Fraccion Fra = OpeFraccion(numerador, denominador, numerador2, denominador2);
        ImprimirFraccion(Fra);
    }
    
       public static Fraccion OpeFraccion(double nume, double deno, double nume2, double deno2){
        
        Fraccion a = new Fraccion();
        
        a.setNumerador(nume);
        a.setDenominador(deno);
        a.setNumerador2(nume2);
        a.setDenominador2(deno2);
        
        return a;
    }
    
        public static void ImprimirFraccion(Fraccion a){
        System.out.println("----------------------------------------");
        System.out.printf("Suma          : %.2f\n", a.sumarFraccion());
        System.out.printf("Resta         : %.2f\n",  a.restaFraccion());
        System.out.printf("Multiplicacion: %.2f\n", a.multiplicarFraccion());
        System.out.printf("División      : %.2f\n", a.DivisionFraccion());
        
        
        
        }
       
       
    
    
}
