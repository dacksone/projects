
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
public class SumResMulDivMod {
    /*
    Diseñar el algoritmo (ordinograma y pseudocódigo) correspondiente a un programa
    que pida por teclado dos números enteros y muestre su suma, resta, multiplicación,
    división y el resto (módulo) de la división. Si la operación no es conmutativa, también
    se mostrará el resultado invirtiendo los operadores.
    */
    public static void main (String [] args){
        double num1,num2,sum,res,mult,div,mod;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2: "));
        sum = num1 + num2;
        res = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;
        JOptionPane.showMessageDialog(null,"Valor de la suma: "+num1+" + "+num2+" ="+sum+"\n"+
                                            "Valor de la resta: "+num1+" - "+num2+" ="+res+"\n"+
                                            "Valor de la multiplicación: "+num1+" * "+num2+" ="+mult+"\n"+
                                            "Valor de la division: "+num1+" / "+num2+" ="+div+"\n"+
                                            "Valor de modulo: "+num1+" %(mod) "+num2+" ="+mod);
                
    }
    
}
