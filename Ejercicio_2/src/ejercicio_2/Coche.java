/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

/**
 *
 * @author jdavi
 */
public class Coche {
    
    private String color;
    private String marca;
    private int modelo;
    private int caballos;
    private int puertas;
    private String matricula;
    
    
    
    public Coche(){
        
        
    }
    
    public String getColor(){
        
        return this.color;
    }
    
    public String getMarca(){
        
        return this.marca;
    }
    
    public int getModelo(){
        
        return this.modelo;
    }
    public int getCaballos(){
        
        return this.caballos;
    }
    public int getPuertas(){
        
        return this.puertas;
    }
    public String getMatricula(){
        
        return this.matricula;
    }
    public void setColor(String a){
        this.color = a;
    }
     public void setMarca(String b){
        this.marca = b;
    }
     public void setModelo(int c){
        this.modelo = c;
    }
     public void setCaballos(int d){
        this.caballos = d;
    }
     public void setPuertas(int e){
        this.puertas = e;
    }
     public void setMatricula(String f){
        this.matricula = f;
    }
    
    
}
