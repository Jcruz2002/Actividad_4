/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7;

/**
 *
 * @author jdavi
 */
public class Cuenta {
    
    private int NoCuenta;
    private String nombreCliente;
    private double saldo;
    
    public Cuenta(){};

    public int getNoCuenta(){return this.NoCuenta;}
    public String getNombreCliente(){return this.nombreCliente;}
    public double getSaldo(){return this.saldo;}
    
    public void setNoCuenta(int n){this.NoCuenta = n;}
    public void setNombre(String name){this.nombreCliente = name;}
    public void setSaldo(double v){this.saldo = v;}
    
     public boolean Consignar(boolean monton){
        return false;
     }
     
      public boolean Retirar(boolean monton){
        return true;
     }
    
}

