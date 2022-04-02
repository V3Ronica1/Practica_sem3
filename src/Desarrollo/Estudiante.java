
package Desarrollo;


public class Estudiante {
    long carnet;
   String nombre, apellido;
   
   public void registroestudiante(){
       System.out.println("Metodo para registro de estudiante");
   }
    public void consultarEstudiante(){
        System.out.println("Metodo para consultar de estiudiante");
    }
    public void eliminarEstudiante(){
        System.out.println("Metodo para eliminar de estudiante");
    }
          
   
    public static void main(String[] args) {
        Estudiante est=new Estudiante();
        est.carnet= 1234;
        est.nombre="Amelia";
        est.apellido="Rosales";
        
        est.registroestudiante();
        est.consultarEstudiante();
        est.eliminarEstudiante();
        
        
        System.out.println("Carnet : " + est.carnet);
        System.out.println("Nombre: " + est.nombre);
        System.out.println("Apellido : " + est.apellido);
    }
   
}
