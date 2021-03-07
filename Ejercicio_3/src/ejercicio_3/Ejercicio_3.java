/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

/**
 *
 * @author jdavi
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //PUNTO 2
       /**
        *Diseñe e implemente una clase para trabajar con triángulos isósceles.
        * Defina atributos para la base y la altura proporcione un método 
        * constructor, métodos getter y setter e implemente métodos para 
        * calcular: el área, la longitud de
        * sus lados iguales, el perímetro, el valor del ángulo vértice. 
       */
       
       Triangulo_Iso a = new Triangulo_Iso();

       System.out.println("Base      : "+ a.getBase());
       System.out.println("Altura    : "+ a.getAltura());
       System.out.println("Area      : "+ a.calcularArea());
       System.out.printf("longuitud de lados : %.2f\n",a.calcularLonguitud());
       System.out.printf("Perimetro  : %.2f\n",a.calcularPerimetro());
       
    }
    
}
