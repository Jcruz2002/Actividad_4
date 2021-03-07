/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

/**
 *
 * @author jdavi
 */
public class Bicicleta {
    
    
    private int velocidadActual;
    private int platoActual;
    private int piñonActual;
    
     public Bicicleta(){
        
        this.velocidadActual = 44;
        this.platoActual = 2;
        this.piñonActual = 3;
    }
    
      public int getVelocidad(){
        return this.velocidadActual;
    }
       public int getPlato(){
        return this.platoActual;   
    }  
        public int getPiñon(){
        return this.piñonActual;
    }
       public void setVelocidad(int a){
        this.velocidadActual = a;
    }
       public void setPlato(int b){
        this.platoActual = b;
    }
       public void setPiñon(int c){
        this.piñonActual = c;
    }
          
    public int acelerar(){
         return this.velocidadActual*2;
     }
    
    public int frenar(){
         return this.velocidadActual/2;
     }
    
    public int cambiarPlato (int plato){
         
        this.platoActual = plato;
        return this.platoActual;
     }
     public int cambiarPiñon (int piñon){
        this.piñonActual = piñon;
        return this.piñonActual;
     }
        
        
}
