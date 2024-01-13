/*
 * Comprobar si un carácter es un dígito, una letra mayúscula o una
   letra minúscula
 */
package logica;
import javax.swing.JOptionPane;

public class Caracter {
    
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "**COMPROBAR EL TIPO DE CARACTER**");
        
        char caracter = JOptionPane.showInputDialog("Ingrese al caracter").charAt(0);
        
        if (Character.isUpperCase(caracter)){
            JOptionPane.showMessageDialog(null, "El caracter ingresado fue (" + caracter + ") y está en mayúscula.");
        } else if (Character.isLowerCase(caracter)){
            JOptionPane.showMessageDialog(null, "El caracter ingresado fue (" + caracter + ") y está en minúscula.");
        } else if (Character.isDigit(caracter)){
            JOptionPane.showMessageDialog(null, "El caracter ingresado fue (" + caracter + ") y es un número.");
        } else {
            JOptionPane.showMessageDialog(null, "El caracter ingresado fue (" + caracter + ") y es un caracter especial.");
        }
    }
    
}
