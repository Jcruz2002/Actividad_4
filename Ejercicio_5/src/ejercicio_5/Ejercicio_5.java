/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;
import java.util.Scanner;
/**
 *
 * @author jdavi
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PUNTO 5
       /**
        *Se desea crear una aplicación en java para el registro del inventario
        * de productos de una tienda. Para ello, se solicita diseñar e
        * implementar la clase Producto, con atributos de instancia para el
        * Código, nombre, precio de compra,porcentaje de utilidad. La clase 
        * debe implementar método constructor, getters y setters para sus
        * atributos y el método precioVenta, que retornara el precio de venta 
        * al público (a partir del % de utilidad del producto). Implementar una 
        * clase principal, en la que se defina un arreglo de Productos, se 
        * registren datos de diferentes productos y luego se impriman
        * incluyendo el precio de venta.
        */
       
        Scanner Producto = new Scanner(System.in); 
        Producto z = new Producto();
        int m = 1;
        int n;
        long codigo = 0;
        String nombre;
        double precioCompra = 0;
        double precioUtilidad = 0;
        long a[] = new long[4];
        String b[]  = new String[4];
        String au;
        double c[] = new double[4];
        double d[] = new double[4];
        double e[] = new double[4];

        for(int i=0; i<4; i++){
        
       System.out.printf("Producto %d\n",m);
       System.out.printf("Codigo : ");
       codigo = Producto.nextLong();
       z.setCodigo(codigo);
       a[i]=codigo;
       System.out.printf("Nombre : ");
       nombre = Producto.next();
       b[i] = nombre;
       System.out.printf("Precio de Compra       : ");
       precioCompra = Producto.nextDouble();
       z.setPrecioCompra(precioCompra);
       precioCompra = c[i];
       System.out.printf("Porcentaje de Utilidad : ");
       precioUtilidad = Producto.nextDouble();
       z.setPrecioUtilidad(precioUtilidad);
       e[i]=precioUtilidad;
        m++;
       e[i] = z.PrecioVenta();
        }
        m=1;
        
       for (int i=0; i<4; i++){
           
           System.out.printf("Producto %d\n ",m);
           System.out.printf("Codigo : %d\n", a[i]); 
           System.out.printf("Nombre : %s\n", b[i]);
           System.out.printf("Precio de Venta : %.1f\n",e[i]);          
           
       }
       
       
       
       
       
       
       
       
    }
    
}
