/*
 Digite tres números e imprima si todos los números son iguales, 
 todos los numero son diferentes o Ninguno de los dos es igual o diferente
 */
package logica;

import javax.swing.JOptionPane;

public class Numero {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "*** COMPARACIÓN DE NÚMEROS ***" + "\n" + "Ingrese 3 números para comparar");

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número"));

        if (num1 == num2 && num1 == num3 && num2 == num3) {
            JOptionPane.showMessageDialog(null, "Los números " + num1 + ", " + num2 + " y " + num3 + " son iguales.");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            JOptionPane.showMessageDialog(null, "Los números " + num1 + ", " + num2 + " y " + num3 + " son diferentes.");
        } else if ((num1 == num2 && num1 != num3 && num2 != num3) || (num1 == num3 && num1 != num2 && num3 != num2) || (num1 != num2 && num1 != num3 && num2 == num3)) {
            JOptionPane.showMessageDialog(null, "Los números " + num1 + ", " + num2 + " y " + num3 + " no todos son iguales ni diferentes.");
        } else {
            JOptionPane.showMessageDialog(null, "Los números " + num1 + ", " + num2 + " y " + num3 + " todos son diferentes.");
        }

    }

}
