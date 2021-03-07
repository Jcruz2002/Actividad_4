/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

/**
 *
 * @author jdavi
 */
public class Producto {
    
    private long codigo;
    private String nombre;
    private double precioCompra;
    private double precioUtilidad;
    
    
    
    
      public long getCodigo(){
        return this.codigo;
    }
       public String getNombre(){
        return this.nombre;   
    }  
        public double getPrecioCompra(){
        return this.precioCompra;
    }
       public double getPrecioUtilidad(){
        return this.precioUtilidad;
    } 
   
       public void setCodigo(long a){
        this.codigo = a;
    }
    
      public void setNombre(String b){
        this.nombre = b;
    }
      
      public void setPrecioCompra(double c){
        this.precioCompra = c;
    }
    
      public void setPrecioUtilidad(double d){
        this.precioUtilidad = d;
    }
      public double PrecioVenta (){
      return this.precioCompra +(this.precioCompra*this.precioUtilidad);
     }
    
}
