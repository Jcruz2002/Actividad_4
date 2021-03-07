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
public class Triangulo_Iso {
    
    
    
    private double base;
    private double altura;
    
    public Triangulo_Iso(){
        
        this.base = 4;
        this.altura = 8;
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
         return (this.base * this.altura)/2;
     }
     
    public double calcularLonguitud(){
         return Math.sqrt(Math.pow(this.altura,2)+(Math.pow(this.base/2,2)));
     }
     public double calcularPerimetro(){
         return 2*(calcularLonguitud())+this.base;
     }
}
