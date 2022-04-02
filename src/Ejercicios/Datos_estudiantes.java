
package Ejercicios;

public class Datos_estudiantes {
   int numero_carnet;
  String nombre;
  int codigo_carrera;


   
  public Datos_estudiantes(){
      
  }
  
  public Datos_estudiantes(String nombre,int codigo_carrera,int numero_carnet){
      this.nombre=nombre;
      this.numero_carnet=numero_carnet;
      this.codigo_carrera=codigo_carrera;
  }   
        
    
  
   
    public int getNumero_carnet() {
        return numero_carnet;
    }

    public void setNumero_carnet(int numero_carnet) {
        this.numero_carnet = numero_carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo_carrera() {
        return codigo_carrera;
    }

    public void setCodigo_carrera(int codigo_carrera) {
        this.codigo_carrera = codigo_carrera;
    }
 public String informacion_estudiantes(Datos_estudiantes est){
     String informacion ="";
     informacion+="El nombre del estudiante es: "+est.getNombre()+"\n";
     informacion+="El numero de carnet es:" + est.getNumero_carnet()+"\n";
     informacion+="El codigo de carrera es: "+est.getCodigo_carrera()+"\n";
     return informacion +"\n";
 }
 //estudiante2
  public String inform_estudiantes(Datos_estudiantes est2){
     String informacion ="";
     informacion+="El nombre del estudiante es: "+est2.getNombre()+"\n";
     informacion+="El numero de carnet es:" + est2.getNumero_carnet()+"\n";
     informacion+="El codigo de carrera es: "+est2.getCodigo_carrera()+"\n";
     return informacion+"\n";
 }
  //estudiante3
  public String informacion_estudi(Datos_estudiantes est3){
     String informacion ="";
     informacion+="El nombre del estudiante es: "+est3.getNombre()+"\n";
     informacion+="El numero de carnet es:" + est3.getNumero_carnet()+"\n";
     informacion+="El codigo de carrera es: "+est3.getCodigo_carrera()+"\n";
     return informacion+"\n";
 }
   //estudiante4
  public String informacion_est(Datos_estudiantes est4){
     String informacion ="";
     informacion+="El nombre del estudiante es: "+est4.getNombre()+"\n";
     informacion+="El numero de carnet es:" + est4.getNumero_carnet()+"\n";
     informacion+="El codigo de carrera es: "+est4.getCodigo_carrera()+"\n";
     return informacion+"\n";
 }
  public String informacion_es(Datos_estudiantes est5){
     String informacion ="";
     informacion+="El nombre del estudiante es: "+est5.getNombre()+"\n";
     informacion+="El numero de carnet es:" + est5.getNumero_carnet()+"\n";
     informacion+="El codigo de carrera es: "+est5.getCodigo_carrera()+"\n";
     return informacion+"\n";
 }
}
