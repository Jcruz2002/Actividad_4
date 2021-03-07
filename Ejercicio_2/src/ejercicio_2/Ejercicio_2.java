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
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PUNTO 2
       /**
        *Crear una clase Coche, a través de la cual se pueda conocer
        * el color del coche, la marca, el modelo, el número de caballos, el
        * número de puertas y la matricula. Crear el constructor del coche, 
        * así como los métodos que considere necesarios. Crear una clase
        * PruebaCoche que instancie varios coches, cambiándole el color a lo 
        * largo de la vida a algunos de ellos y mostrándolo por pantalla.
        */
       
       
       Coche a = new Coche();
       
       a.setColor("Rojo");
       a.setMarca("Mazda");
       a.setMatricula("123-x");
       a.setModelo(2002);
       a.setCaballos(130);
       a.setPuertas(4);
       
       InfCoche(a);
       
    }
    
    public static void InfCoche( Coche coche ){
        
       System.out.println("Color     : "+ coche.getColor());
       System.out.println("Marca     : "+ coche.getMarca());
       System.out.println("Modelo    : "+ coche.getModelo());
       System.out.println("Caballos  : "+ coche.getCaballos());
       System.out.println("Puertas   : "+ coche.getPuertas());
       System.out.println("Matricula : "+ coche.getMatricula());
        
    }
    
}
