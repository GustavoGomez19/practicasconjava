/*
 Ingrese un número e indique si es par o impar
 */
package logica;

import javax.swing.JOptionPane;

public class Numero {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "*** NÚMERO PAR || NÚMERO IMPAR ***");

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número para saber si es par o impar. Para finalizar ingrese el número 0"));

        while (numero != 0) {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es par");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es impar");
            }
            
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número para saber si es par o impar"));
        }
        JOptionPane.showMessageDialog(null, "Fin de la ejecucución del programa");

    }

}
