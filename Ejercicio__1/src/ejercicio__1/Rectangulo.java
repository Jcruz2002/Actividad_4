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
public class Rectangulo {
    private double base;
    private double altura;
    
    public Rectangulo(){
        
        this.base = 12;
        this.altura = 15;
    }
    
    public double getBase(){
        
        return this.base;
    }
    
    public double getAltura(){
        
        return this.altura;
    }
    
    public void setBase(double a){
        this.base = a;
    }
    
     public void setAltura(double b){
        this.altura = b;
    }
     
     public double calcularArea(){
         return this.base * this.altura;
     }
     
      public double calcularPerimetro(){
         return 2*(this.base + this.altura);
     }
}
