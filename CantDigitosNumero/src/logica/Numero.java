/*
 * Ingrese un número y que imprima cuantas cifras tiene
 */
package logica;
import javax.swing.JOptionPane;

public class Numero {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "***CONOCER LA CANTIDAD DE DIGÍTOS DE UN NÚMERO INGRESADO***");
        
        long numero = Long.parseLong(JOptionPane.showInputDialog("Ingrese el número"));
        long cantCifras = 0;
        
        //int cantCifras = String.valueOf(numero).length();
        //JOptionPane.showMessageDialog(null, "La cantidad de digítos que tiene el número ingresado es " + cantCifras + " digitos");
        
        while(numero != 0){
            numero = numero / 10;
            cantCifras++;
        }
        JOptionPane.showMessageDialog(null, "La cantidad de digítos que tiene el número ingresado es " + cantCifras + " digitos");
        
    }
}
