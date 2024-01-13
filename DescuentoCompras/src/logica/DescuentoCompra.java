/*
 * En </u>coltisTechnology se hace un descuento del 20% de descuento a los clientes cuya
   compra supere los 300.
 */
package logica;
import javax.swing.JOptionPane;

public class DescuentoCompra {
    
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "**APLICAR DESCUENTOS A COMPRAS SUPERIORES A 300**");
        
        float valorCompra = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de su compra"));
        
        if (valorCompra > 300){
            float porcentajeDescuento = 0.20f;
            float descuento = valorCompra * porcentajeDescuento;
            float valorPagar = valorCompra - descuento;
            
            JOptionPane.showMessageDialog(null, "El valor de la compra fue de " + valorCompra + "\n" + 
                    "El descuento fue de " + descuento + "\n" + 
                    "El total a pagar es de " + valorPagar);
        } else{
            JOptionPane.showMessageDialog(null, "El valor de la compra fue de " + valorCompra + ", no aplica para descuento");
        }
        
    }
    
}
