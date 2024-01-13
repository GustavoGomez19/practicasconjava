/*
 * Digite un numero entre 1 a 12 e imprima el número de días que tiene el mes correspondido
 */
package logica;
import javax.swing.JOptionPane;

public class DiasMes {
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "***SABER LOS DÍAS DEL MES***");
        
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número correspondiente al mes (1 - 12)"));
        
        switch (mes) {
            case 1:
                JOptionPane.showMessageDialog(null, "El número ingresado corresponde a Enero y tiene 31 días");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El número ingresado corresponde a Febrero y tiene 28 días");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El número ingresado corresponde a Marzo y tiene 31 días");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El número ingresado corresponde a Abril y tiene 30 días");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "El número ingresado corresponde a Mayo y tiene 31 días");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "El número ingresado corresponde a Junio y tiene 30 días");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "El número ingresado corresponde a Julio y tiene 31 días");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "El número ingresado corresponde a Agosto y tiene 31 días");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "El número ingresado corresponde a Septiembre y tiene 30 días");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "El número ingresado corresponde a Octubre y tiene 31 días");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "El número ingresado corresponde a Noviembre y tiene 30 días");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "El número ingresado corresponde a Diciembre y tiene 31 días");
                break;
            default:
                JOptionPane.showMessageDialog(null, "El número ingresado no corresponde a ningún mes del año.");
                break;
        }
    }
    
}
