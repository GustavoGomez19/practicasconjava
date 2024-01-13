/*
 Ingrese un nùmero e indique si es positivo o negativo
 */
package logica;
import java.util.Scanner;

public class Numero {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("*** NÚMEROS PARES | NÚMEROS IMPARES ***");
        
        System.out.print("Ingrese el número para validar si es par o impar: ");
        int numero = entrada.nextInt();
        
        if(numero >= 0){
            System.out.println("El número " + numero + " es positivo.");
        }
        else{
            System.out.println("El número " + numero + " es negativo.");
        }
        
    }
    
}
