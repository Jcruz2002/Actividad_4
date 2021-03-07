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
public class PruebaRectangulo {
    
    private double base1;
    private double altura1;
    private double base2;
    private double altura2;
    private double base3;
    private double altura3;
    
    public PruebaRectangulo(){
        
        this.base1 = 5;
        this.altura1 = 6;
        this.base2 = 4;
        this.altura2 = 9;
        this.base3 = 3;
        this.altura3 = 5;
        
    }
    
    public double getBase1(){
        
        return this.base1;
    }
     public double getBase2(){
        
        return this.base2;
    }
      public double getBase3(){
        
        return this.base3;
    }
    
    public double getAltura1(){
        
        return this.altura1;
    }
     public double getAltura2(){
        
        return this.altura2;
    }
      public double getAltura3(){
        
        return this.altura3;
    }
    
    public void setBase1(double a){
        this.base1 = a;
    }
    public void setBase2(double a){
        this.base2 = a;
    }
    public void setBase3(double a){
        this.base3 = a;
    }
    
     public void setAltura1(double b){
        this.altura1 = b;
    }
     public void setAltura2(double b){
        this.altura2 = b;
    }
     
     public void setAltura3(double b){
        this.altura3 = b;
    }
     
     
     public double calcularArea1(){
         return this.base1 * this.altura1;
     }
     public double calcularArea2(){
         return this.base2 * this.altura2;
     }
     public double calcularArea3(){
         return this.base3 * this.altura3;
     }
     
      public double calcularPerimetro1(){
         return 2*(this.base1 + this.altura1);
     }
      public double calcularPerimetro2(){
         return 2*(this.base2 + this.altura2);
     }
      public double calcularPerimetro3(){
         return 2*(this.base3 + this.altura3);
     }
    
}
