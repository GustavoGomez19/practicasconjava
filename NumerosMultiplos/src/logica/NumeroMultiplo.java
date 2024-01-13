/*
 * Digitar dos números y decir si es múltiplo del otro
 */
package logica;
import java.util.Scanner;

public class NumeroMultiplo {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("***SABER SI UN NÙMERO ES MÙLTIPLO DE OTRO***");
        
        System.out.print("Ingrese el primer número: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = entrada.nextInt();
        
        if (num1 % num2 == 0){
            System.out.println("Los números " + num1 + " y " + num2 + " son múltiplos.");
        } else {
            System.out.println("Los números " + num1 + " y " + num2 + " no son múltiplos.");
        }
        
    }
    
}
