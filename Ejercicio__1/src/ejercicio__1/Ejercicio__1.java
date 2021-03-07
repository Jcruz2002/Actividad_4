/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio__1;

/**
 *
 * @author jdavi
 */
public class Ejercicio__1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        //PUNTO 1
       /**
        * Crear una clase Rectángulo, con atributos longitud y ancho.
        * Crear también el constructor de la clase y los métodos
        * necesarios para calcular el área y el perímetro. Crear otra
        * clase PruebaRectangulo que pruebe varios rectángulos y
        * muestre por pantalla sus áreas y perímetros.
        */
       
       
       Rectangulo r = new Rectangulo();
       PruebaRectangulo a = new PruebaRectangulo();
       System.out.println("Base     : "+ r.getBase());
       System.out.println("Altura   : "+ r.getAltura());
       System.out.println("Area     : "+ r.calcularArea());
       System.out.println("Perimetro: "+ r.calcularPerimetro());
       System.out.println("Rectangulo 2");
       System.out.println("Base     : "+ a.getBase1());
       System.out.println("Altura   : "+ a.getAltura1());
       System.out.println("Area     : "+ a.calcularArea1());
       System.out.println("Perimetro: "+ a.calcularPerimetro1());
       System.out.println("Rectangulo 3");
       System.out.println("Base     : "+ a.getBase2());
       System.out.println("Altura   : "+ a.getAltura2());
       System.out.println("Area     : "+ a.calcularArea2());
       System.out.println("Perimetro: "+ a.calcularPerimetro2());
       System.out.println("Rectangulo 4");
       System.out.println("Base     : "+ a.getBase3());
       System.out.println("Altura   : "+ a.getAltura3());
       System.out.println("Area     : "+ a.calcularArea3());
       System.out.println("Perimetro: "+ a.calcularPerimetro3());
        
    }
    
}
