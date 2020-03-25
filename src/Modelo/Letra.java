package Modelo;


public class Letra {
   private String letra;
   private String iLetra;

    public Letra(String letra, String iLetra) {
        this.letra = letra;
        this.iLetra = iLetra;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getiLetra() {
        return iLetra;
    }

    public void setiLetra(String iLetra) {
        this.iLetra = iLetra;
    }
   
}
