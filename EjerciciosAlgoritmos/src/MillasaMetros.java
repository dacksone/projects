
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
public class MillasaMetros {
    public static void main (String [] args){
        /*
        Diseñar el algoritmo (ordinograma y pseudocódigo) correspondiente a un programa
        que lea el valor correspondiente a una distancia en millas marinas y las escriba
        expresadas en metros. Sabiendo que 1 milla marina equivale a 1852 metros.
        */
        double millasaMetros = 1609;
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en millas:"));
        valor = valor * millasaMetros;
        String nValor = Double.toString(valor);
        
        JOptionPane.showMessageDialog(null,"El resultado en metros es: "+nValor);
        
    }
    
    
}
