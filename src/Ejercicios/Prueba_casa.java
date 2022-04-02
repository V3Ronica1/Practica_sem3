
package Ejercicios;

import java.util.Scanner;


public class Prueba_casa {
    public static void main(String[] args) {
       
        
        Scanner leer =new Scanner(System.in);
        
        System.out.println("Ingrese el numero de la casa:");
        int numerocasa = leer.nextInt();
        System.out.println("Ingrese el nombre de la calle:");
        String nombrecalle = leer.next();
        
      
        System.out.println("El numero de la casa es : " +Prueba_casa.Mostrardatos(numerocasa));
        System.out.println("El nombre de la calle es: " + Prueba_casa.Mostrardatos( nombrecalle));
        
        
        
    }
    public static int Mostrardatos(int numerocasa){
       
        return numerocasa;
    }
      public static String Mostrardatos(String nombrecalle){
       
        return nombrecalle;
    }
    
}
