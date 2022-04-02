
package Ejercicios;

import java.util.Scanner;


public class Empleado_prueba {
    public static void main(String[] args) {
        Empleado emp= new Empleado();
        Scanner leer=new Scanner(System.in);
        String Nombre,Apellidos,Direccion,Ban_EmpleadoActivo;
        double Salario_Descuento=0 , Salario_Devengado=0,salario_total=0,salario= 0;
        int No_Nit;
        
        System.out.println("Ingrese el nombre del empleado:");
        emp.setNombre(leer.nextLine());
        System.out.println("Ingrese los apellido del empleado:");
        emp.setApellidos(leer.nextLine());
        System.out.println("Ingrese la direccion :");
         emp.setDirección(leer.next());
        System.out.println("Ingrese salario con descuento");
        emp.setSalario_Descuento(leer.nextDouble());
        System.out.println("Ingrese el numero de NIT:");
        emp.setNo_Nit( leer.nextInt());
        System.out.println("Ingrese si el empleado es activo o inactivo:");
        Ban_EmpleadoActivo=leer.next();
        
        
        
        System.out.println(""+emp.Datos_emp(emp));
        System.out.println(""+emp.calcularSalario(Salario_Descuento, Salario_Devengado));
        System.out.println(""+emp.calcular_renta(Salario_Devengado, salario_total,salario));
        
        
    }
    
  
   
    
    
}
