/*
 * Digitar una letra e imprima si está en mayúscula o minúscula
 */
package logica;
import java.util.Scanner;

public class MayusMinus {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("***SABER SI UNA LETRA ESTÁ EN MAYÚSCULA O MINÚSCULA***");
        System.out.print("Ingres la letra para validar mayúcula o minúscula: ");
        char letra = entrada.next().charAt(0);
        
        if (Character.isLowerCase(letra)){
            System.out.println("La letra " + letra + " está en minúscula.");
        } else if (Character.isUpperCase(letra)){
            System.out.println("La letra " + letra + " está en mayúscula.");
        } else {
            System.out.println("El caracter ingresado fue " + letra + " y no corresponde a una letra del alfabeto.");
        }
        
    }
    
}
