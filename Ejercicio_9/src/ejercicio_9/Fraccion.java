/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9;

/**
 *
 * @author jdavi
 */
public class Fraccion {
    
    private double numerador , denominador, numerador2 , denominador2;
 
    
    public Fraccion () {}
    
    public double getNumerador(){return this.numerador;}
    public double getDenominador(){return this.denominador;}
    public double getNumerador1(){return this.numerador2;}
    public double getDenominador1(){return this.denominador2;}
    
    public void setNumerador(double a){this.numerador = a;}
    public void setDenominador(double b){this.denominador = b;}
    public void setNumerador2(double c){this.numerador2 = c;}
    public void setDenominador2(double d){this.denominador2 = d;}
    
     public double sumarFraccion(){
         return ((this.numerador*this.denominador2)+(this.numerador2*this.denominador))/(this.denominador*this.denominador2);
     }
     
     public double restaFraccion(){
         return ((this.numerador*this.denominador2)-(this.numerador2*this.denominador))/(this.denominador*this.denominador2);
     }
     public double multiplicarFraccion(){
         return (this.numerador*this.numerador2)/(this.denominador*this.denominador2);
     }
     public double DivisionFraccion(){
         return (this.numerador*this.denominador2)/(this.numerador2*this.denominador);
     }    
}


