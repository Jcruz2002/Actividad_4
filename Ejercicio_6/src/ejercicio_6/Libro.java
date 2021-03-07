/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

/**
 *
 * @author jdavi
 */
public class Libro {
    
    private String titulo, primerNom, segundoNom, apellido, isb,editorial, ciudad, pais, fecha;
    private int paginas, edicion; 
    
    
     
    public Libro(){}
    
    public String getTitulo(){return this.titulo;}
    public String getPrimerNom(){return this.primerNom;}
    public String getSegundoNom(){return this.segundoNom;}
    public String getapellido(){return this.apellido;}
    public String getISB(){return this.isb;}
    public String getEditorial(){return this.editorial;}
    public String getCiudad(){return this.ciudad;}
    public String getPais(){return this.pais;}
    public String getFecha(){return this.fecha;}
    public int getPaginas(){return this.paginas;}
    public int getEdicion(){return this.edicion;}
    
    public void setTitulo(String a){this.titulo = a;}
    public void setPrimerNom(String b){this.primerNom = b;}
    public void setSegundoNom(String c){this.segundoNom = c;}
     public void setapellido(String m){this.apellido = m;}
    public void setISB(String d){this.isb = d;}
    public void setEditorial(String e){this.editorial = e;}
    public void setCiudad(String f){this.ciudad = f;}
    public void setPais(String g){this.pais = g;}
    public void setFecha(String h){this.fecha = h;}
    public void setPaginas(int a){this.paginas = a;}
    public void setEdicion(int b){this.edicion = b;}
    
    
 
    
}
