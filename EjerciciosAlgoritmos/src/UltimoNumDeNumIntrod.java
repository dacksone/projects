
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Juan Rodriguez
 */
public class UltimoNumDeNumIntrod {
    /*
    Diseñar el algoritmo (ordinograma y pseudocódigo) correspondiente a un programa
    que obtiene la última cifra de un número introducido.
    */
    public static void main (String [] args){
        /*
        100
        */
        
        int i;
        String Cadena;
        char c;
        
        Cadena = JOptionPane.showInputDialog("Ingrese el numero a analizar: ");
        for (i=(Cadena.length()-1);i < Cadena.length();i++){
            c = Cadena.charAt (i);
            JOptionPane.showMessageDialog(null,"De la cadena ingresada: "+Cadena+" El ultimo valor es: "+c);
        }
    }
    
}
