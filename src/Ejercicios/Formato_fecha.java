
package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;




public class Formato_fecha {
    public static void main(String[] args) {
        Formato_fecha polimorfismo=new Formato_fecha();
        System.out.println(""+polimorfismo.fecha_Guiones());
        System.out.println(""+polimorfismo.fecha_Plecas());
    }
    
    
    public String fecha_Guiones(){
    LocalDate fecha1 = LocalDate.parse("2022-04-01");
    System.out.println("Fecha con guiones: " + fecha1);
    return "";
    }
    
    public String fecha_Plecas(){
    DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
    System.out.println("Fecha con plecas 1/4/2022 " + fechaConHora.format(esDateFormat));
    
   return "";
   
}

    private static class fechaConHora {

        private static String format(DateTimeFormatter esDateFormat) {
          
            return "";
          
        }

        public fechaConHora() {
        }
    }

   
    }
  

    