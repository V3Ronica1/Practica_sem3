
package Ejercicios;

public class Factura_electrica {
    
   private String No_Cuenta; 
   private long Multiplicador, Consumo_Mensual, Consumo_Diario,Lectura_medidor, Lectura_anterior_medidor;
   private double Valor_Factura;

    public String getNo_Cuenta() {
        return No_Cuenta;
    }

    public void setNo_Cuenta(String No_Cuenta) {
        this.No_Cuenta = No_Cuenta;
    }

    public long getMultiplicador() {
        return Multiplicador;
    }

    public void setMultiplicador(long Multiplicador) {
        this.Multiplicador = Multiplicador;
    }

    public long getConsumo_Mensual() {
        return Consumo_Mensual;
    }

    public void setConsumo_Mensual(long Consumo_Mensual) {
        this.Consumo_Mensual = Consumo_Mensual;
    }

    public long getConsumo_Diario() {
        return Consumo_Diario;
    }

    public void setConsumo_Diario(long Consumo_Diario) {
        this.Consumo_Diario = Consumo_Diario;
    }

    public long getLectura_medidor() {
        return Lectura_medidor;
    }

    public void setLectura_medidor(long Lectura_medidor) {
        this.Lectura_medidor = Lectura_medidor;
    }

    public long getLectura_anterior_medidor() {
        return Lectura_anterior_medidor;
    }

    public void setLectura_anterior_medidor(long Lectura_anterior_medidor) {
        this.Lectura_anterior_medidor = Lectura_anterior_medidor;
    }

    public double getValor_Factura() {
        return Valor_Factura;
    }

    public void setValor_Factura(double Valor_Factura) {
        this.Valor_Factura = Valor_Factura;
    }
    
    
    public String calculo(Factura_electrica fac){
        String cal="";
        cal+="La lectura actual es:"+fac.getLectura_medidor()+"\n";
        cal+="El consumo mensual es:"+fac.getConsumo_Mensual()+"\n";
        cal+="El consumo diario es:"+fac.getConsumo_Diario()+"\n";
        cal+="El valor de la factura es:"+fac.getValor_Factura()+"\n";
        
        return cal;
    }
   
      public  int consumo_mensual(int lectura_actual, int lectura_anterior, int multiplicador){
        int consumo;
        consumo=(lectura_actual-lectura_anterior)*multiplicador;
        return consumo;
        
    }
    public int consumo_diario(int lectura_actual){
       int consumd;
       consumd=(lectura_actual*24);
       return consumd;
    }
    public double valorfac(double consumo ){
        double valor;
        valor=consumo*0.20;
        return valor;
    }
    
    
}
