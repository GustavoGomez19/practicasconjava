/*
 * Ingresar una nota de 0 al 10 y mostrar si es, insuficiente, suficiente, bien, notable o sobresaliente
 */
package logica;

import javax.swing.JOptionPane;

public class Notas {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "***SABER EL RESULTADO DE LAS NOTAS***");
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota"));

        if (nota >= 0 && nota < 4) {
            JOptionPane.showMessageDialog(null, "La nota fue insuficiente");
        } else if (nota >= 4 && nota < 6) {
            JOptionPane.showMessageDialog(null, "La nota fue suficiente");
        } else if (nota >= 6 && nota < 8) {
            JOptionPane.showMessageDialog(null, "La nota fue bien");
        } else if (nota >= 8 && nota <= 9) {
            JOptionPane.showMessageDialog(null, "La nota fue notable");
        } else if (nota == 10){
            JOptionPane.showMessageDialog(null, "La nota fue sobresaliente");
        }
    }

}
