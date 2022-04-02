
package Ejercicios;

import java.util.Scanner;

public class Prueba_factura {
    public static void main(String[] args) {
        String No_Cuenta; 
       int Multiplicador = 0, Consumo_Mensual, Consumo_Diario,Lectura_medidor = 0, Lectura_anterior_medidor;
       double Valor_Factura = 0;
        
       Scanner leer =new Scanner (System.in);
      Factura_electrica fac = new Factura_electrica();
        
        System.out.println("Ingrese el consumo mensual:");
        fac.setConsumo_Mensual(leer.nextInt());
        
        System.out.println("Ingrese el consumo diario:");
        fac.setConsumo_Diario(leer.nextInt());
        
        System.out.println("Ingrese el valor factura:");
        fac.setValor_Factura(leer.nextDouble());
        
        System.out.println("Ingrese la lectura actual:");
        fac.setLectura_medidor(leer.nextInt());
        
        System.out.println("Ingrese la lectura anterior");
        fac.setLectura_anterior_medidor(leer.nextInt());
        
        
        System.out.println(""+fac.calculo(fac));
        System.out.println(""+fac.consumo_diario(Lectura_medidor));
        System.out.println(""+fac.consumo_mensual(Lectura_medidor, Lectura_medidor, Multiplicador));
        System.out.println(""+fac.valorfac(Valor_Factura));
        
 }
 }
    
    
    
    

