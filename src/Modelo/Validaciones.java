package Modelo;

import javax.swing.JOptionPane;

public class Validaciones {
         

    public boolean Escadena(String s) {
        String m;
            

            if(!s.matches("^[A-Za-zñÑ]*$")){
                JOptionPane.showMessageDialog(null ,"ah ingresado un dato distinto al pedido"
                        + "\nPor favor, vuelva a ingresar la palabra");
                m = "";
                return false;
            }else{
                return true;
            }       
        
    }       
 
}


