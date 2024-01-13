/*
 * Diseñe un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] /altura2 [m]) 
   e indique el estado en el que se encuentra esa persona en función del valor de IMC:
    Valor de IMC Diagnóstico
    < 16 Criterio de ingreso en hospital
    de 16 a 17 infra peso
    de 17 a 18 bajo peso
    de 18 a 25 peso normal (saludable)
    de 25 a 30 sobrepeso (obesidad de grado I)
    de 30 a 35 sobrepeso crónico (obesidad de grado II)
 */
package logica;
import javax.swing.JOptionPane;

public class CalcularIMC {
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "***CALCULA EL IMC DE UNA PERSONA***");
        
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso en kgs"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en mts"));
        
        double imc = Math.round(peso / (altura*altura));
        
        if (imc < 16){
            JOptionPane.showMessageDialog(null, "El IMC de la persona es de " + imc + "\n" + 
                    "Debe ser remitido al hospital");
        } else if (imc >= 16 && imc < 17){
            JOptionPane.showMessageDialog(null, "El IMC de la persona es de " + imc + "\n" + 
                    "Sufre de infra peso");
        } else if (imc >= 17 && imc < 18){
            JOptionPane.showMessageDialog(null, "El IMC de la persona es de " + imc + "\n" + 
                    "Sufre de bajo peso");
        } else if (imc >= 18 && imc < 25){
            JOptionPane.showMessageDialog(null, "El IMC de la persona es de " + imc + "\n" + 
                    "Tiene peso normal");
        } else if (imc >= 25 && imc < 30){
            JOptionPane.showMessageDialog(null, "El IMC de la persona es de " + imc + "\n" + 
                    "Sufre de sobre peso (obesidad grado I)");
        } else if (imc >= 30){
            JOptionPane.showMessageDialog(null, "El IMC de la persona es de " + imc + "\n" + 
                    "Sufre de sobre peso cronico (obesidad grado II)");
        }
    }
    
}
