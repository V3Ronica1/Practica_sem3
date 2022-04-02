
package Ejercicios;


public class Empleado {
 
   private int No_Nit; 
   private String Apellidos, Nombre, Dirección;
   private double Salario_Devengado,Salario_Descuento, Ban_EmpleadoActivo , Ban_EmpleadoInactivo ;

    public int getNo_Nit() {
        return No_Nit;
    }

    public void setNo_Nit(int No_Nit) {
        this.No_Nit = No_Nit;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public double getSalario_Devengado() {
        return Salario_Devengado;
    }

    public void setSalario_Devengado(double Salario_Devengado) {
        this.Salario_Devengado = Salario_Devengado;
    }

    public double getSalario_Descuento() {
        return Salario_Descuento;
    }

    public void setSalario_Descuento(double Salario_Descuento) {
        this.Salario_Descuento = Salario_Descuento;
    }

    public double getBan_EmpleadoActivo() {
        return Ban_EmpleadoActivo;
    }

    public void setBan_EmpleadoActivo(double Ban_EmpleadoActivo) {
        this.Ban_EmpleadoActivo = Ban_EmpleadoActivo;
    }

    public double getBan_EmpleadoInactivo() {
        return Ban_EmpleadoInactivo;
    }

    public void setBan_EmpleadoInactivo(double Ban_EmpleadoInactivo) {
        this.Ban_EmpleadoInactivo = Ban_EmpleadoInactivo;
    }
    
    
    public  double calcularSalario(double salario_descuento,double salario_devengado)
    {
       double sdescuento;
       double salario = 0;
       sdescuento=0.10*salario*salario_devengado;
       return sdescuento;
    }
    public  double calcular_renta(double salario_devengado,double salario_total, double salario){
     double renta = 0;
    double descuento_to = renta+salario_devengado;
    salario_total= salario-renta;
    return renta;
    }
    
     public String Datos_emp(Empleado emp){
        String Datos="";
        System.out.println("El nombre completo del empleado es:" + emp.getNombre()+ " " + emp.getApellidos() + "\n");
        System.out.println("La direccion es:" +emp.getDirección());
        System.out.println("El salario con descuento es:" + emp.getSalario_Descuento());
        System.out.println("Su numero de NIT es: " +emp.getNo_Nit());
        System.out.println("El empleado es activo:"+emp.getBan_EmpleadoActivo());
        return Datos;
    }
   
   
    
    
}
