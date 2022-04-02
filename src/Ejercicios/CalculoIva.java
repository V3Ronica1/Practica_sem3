
package Ejercicios;

import java.util.Scanner;


public class CalculoIva {
    
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double precio_articulo, IVA;
        double precio_sinIVA = 0;
        
        
        System.out.println("Ingrese el precio del articulo");
        precio_articulo=leer.nextDouble();
        System.out.println("Ingrese el precio sin IVA");
        
        
        IVA= calcularIVA(precio_articulo,precio_sinIVA);
        
        System.out.println("El precio del articulo sin IVA es de: " +precio_articulo);
        System.out.println("El precio con IVA es de: " +(precio_articulo+IVA));
        
         }
    public static double calcularIVA(double precio_articulo, double precio_sinIVA){
    double IVA;
    IVA= precio_articulo*0.13;
    return IVA;
   
}
    
    
}