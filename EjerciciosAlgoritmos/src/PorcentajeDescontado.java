
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
public class PorcentajeDescontado {
    /*
    Diseñar el algoritmo (ordinograma y pseudocódigo) correspondiente a un programa
    que escribe el porcentaje descontado en una compra, introduciendo por teclado el
    precio de la tarifa y el precio pagado.
    */
    
    public static void main (String [] args){
        double porcentajeIngresado;
        double PrecioIngresado;
        double PrecioTotal;
        
        porcentajeIngresado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del porcentaje a descontar: "));
        porcentajeIngresado = porcentajeIngresado / 100;
        
        PrecioIngresado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor: "));
        
        PrecioTotal = PrecioIngresado - (PrecioIngresado * porcentajeIngresado );
        JOptionPane.showMessageDialog(null,"Valor total: "+PrecioTotal);
    }
    
}
