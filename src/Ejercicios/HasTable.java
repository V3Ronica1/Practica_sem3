
package Ejercicios;

import java.util.Scanner;


public class HasTable {
    public static void main(String[] args) {
        String nombre;
        int numero_carnet,codigo_carrera;
         Scanner leer =new Scanner(System.in);
         Datos_estudiantes est=new Datos_estudiantes();
         Datos_estudiantes est2=new Datos_estudiantes();
         Datos_estudiantes est3=new Datos_estudiantes();
         Datos_estudiantes est4=new Datos_estudiantes();
         Datos_estudiantes est5=new Datos_estudiantes();
         
         //estudiante1
         System.out.println("El nombre del estudiante es:");
         est.setNombre(leer.nextLine());
         System.out.println("El numero de su carnet es :");
         est.setNumero_carnet(Integer.parseInt(leer.nextLine()));
         System.out.println("El codigo de la carrera es :");
         est.setCodigo_carrera(Integer.parseInt(leer.nextLine()));
         
         //estudiante2
         System.out.println("El nombre del estudiante es:");
         est2.setNombre(leer.nextLine());
         System.out.println("El numero de su carnet es :");
         est2.setNumero_carnet(Integer.parseInt(leer.nextLine()));
         System.out.println("El codigo de la carrera es :");
         est2.setCodigo_carrera(Integer.parseInt(leer.nextLine()));
         //estudiante3
         System.out.println("El nombre del estudiante es:");
         est3.setNombre(leer.nextLine());
         System.out.println("El numero de su carnet es :");
         est3.setNumero_carnet(Integer.parseInt(leer.nextLine()));
         System.out.println("El codigo de la carrera es :");
         est3.setCodigo_carrera(Integer.parseInt(leer.nextLine()));
         
         //estudiante4
         System.out.println("El nombre del estudiante es:");
         est4.setNombre(leer.nextLine());
         System.out.println("El numero de su carnet es :");
         est4.setNumero_carnet(Integer.parseInt(leer.nextLine()));
         System.out.println("El codigo de la carrera es :");
         est4.setCodigo_carrera(Integer.parseInt(leer.nextLine()));
         
        //estudiante5
         System.out.println("El nombre del estudiante es:");
         est5.setNombre(leer.nextLine());
         System.out.println("El numero de su carnet es :");
         est5.setNumero_carnet(Integer.parseInt(leer.nextLine()));
         System.out.println("El codigo de la carrera es :");
         est5.setCodigo_carrera(Integer.parseInt(leer.nextLine()));
         
        
        System.out.println(""+est.informacion_estudiantes(est));
        System.out.println(""+est2.inform_estudiantes(est2));
        System.out.println(""+est3.informacion_estudi(est3));
        System.out.println(""+est4.informacion_est(est4));
        System.out.println(""+est5.informacion_es(est5));
         
         
    }
   
}
