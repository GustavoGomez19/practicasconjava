/*
 * Digite dos números realice las 4 operaciones básicas.
 */
package logica;
import javax.swing.JOptionPane;



public class Operaciones {
    
    public static int suma(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }
    public static int resta(int num1, int num2){
        int resultado = num1 - num2;
        return resultado;
    }
    public static int division(int num1, int num2){
        int resultado = 0;
        try {
            resultado = num1 / num2;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede dividir por 0");
        }
        return resultado;
    }
    public static int multiplicacion(int num1, int num2){
        int resultado = num1 * num2;
        return resultado;
    }
    
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "**REALIZAR LAS OPERACIONES ARITMÈTICAS BÀSICAS**");
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer nùmero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo nùmero"));
        
        JOptionPane.showMessageDialog(null, "La suma es: " + suma(num1, num2) + "\n" +
                                                        "La resta es: " + resta(num1, num2) + "\n" +
                                                        "La división es: " + division(num1, num2) + "\n" + 
                                                        "La multiplicación es: " + multiplicacion(num1, num2));
        
    }
    
    
    
}
