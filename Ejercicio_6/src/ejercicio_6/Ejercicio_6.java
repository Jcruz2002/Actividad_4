/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author jdavi
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //PUNTO 6
       /**
        *Crea una clase Libro que modele la información que se mantiene en 
        * una biblioteca sobre cada libro: título, primer nombre, segundo 
        * nombre, primer apellido, ISBN, páginas, edición, editorial, 
        * ciudad, país y fecha de edición (String). La clase debe proporcionar
        * los siguientes servicios: getters y setters. Implementar una clase 
        * principal, en la cual, además del método main, se debe implementar 
        * método para leer la información del Libro y método para mostrar su
        * información. Este último método mostrará la información del libro 
        * con este formato:
        */
       
       Scanner entrada = new Scanner(System.in);
      
        System.out.print("Titulo: ");
        String titulo=entrada.nextLine();
        System.out.print("Primer Nombre: ");
        String primerNom=entrada.next();
        System.out.print("Segundo Nombre: ");
        String segundoNom = entrada.next();
        System.out.print("Apellido: ");
        entrada.nextLine();
        String apellido = entrada.nextLine();
        System.out.print("ISB: ");
        String isb = entrada.next();
        System.out.print("Editorial: ");
        String editorial = entrada.next();
        System.out.print("Ciudad: ");
        String ciudad = entrada.next();
        System.out.print("Pais: ");
        String pais = entrada.next();
        System.out.print("Fecha: ");
        entrada.nextLine();
        String fecha = entrada.nextLine();
        System.out.print("Paginas: ");
        int paginas = entrada.nextInt();
        System.out.print("Edicion: ");
        int edicion = entrada.nextInt();
        
        Libro lib = crearLibros(titulo, primerNom, segundoNom, apellido, isb,editorial, ciudad, pais, fecha, paginas, edicion);
        printInfoLibro(lib);
        
    }
        
        
        public static Libro crearLibros(String ti, String pN, String sN, String apl, String is, String edit, String ciu, String pa, String fe, int pag, int edi){
        Libro li = new Libro();
        
        li.setTitulo(ti);
        li.setPrimerNom(pN);
        li.setSegundoNom(sN);
        li.setapellido(apl);
        li.setISB(is);
        li.setEditorial(edit);
        li.setCiudad(ciu);
        li.setPais(pa);
        li.setFecha(fe);
        li.setPaginas(pag);
        li.setEdicion(edi);
       
        return li; 
    }
        
      public static void printInfoLibro(Libro li){
        System.out.println("----------------------------------------");
        System.out.println("Titulo: " + li.getTitulo());
        System.out.printf("%da. edición\n", li.getEdicion() );
        System.out.printf("Autor: %s %s %s\n", li.getPrimerNom(), li.getSegundoNom(),li.getapellido());
        System.out.println("ISBN: " + li.getISB());
        System.out.printf("%s, %s(%s), %s\n", li.getEditorial(), li.getCiudad(), li.getPais(), li.getFecha());
        System.out.printf("%d páginas\n", li.getPaginas());
    }
        
        
        
    
      
    }
    

