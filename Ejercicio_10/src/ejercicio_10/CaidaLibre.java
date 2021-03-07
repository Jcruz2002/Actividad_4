/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

/**
 *
 * @author jdavi
 */
public class CaidaLibre {
    
    private double velocidad,tiempo,tiempo2;
    
    public CaidaLibre() {}
    
    public double getVelocidad(){return this.velocidad;}
    public double getTiempo(){return this.tiempo;}
    public double getTiempo2(){return this.tiempo2;}
    
    public void setVelocidad(double a){this.velocidad = a;}
    public void setTiempo(double b){this.tiempo = b;}
    public void setTiempo2(double c){this.tiempo2 = c;}
    
    public double Distancia(){
         return this.velocidad+((9.8)*this.tiempo2);
     }
    
    public double Velocidad(){
         
         return (0.5)*(9.8)*Math.pow(this.tiempo,2);
     }
    
}
