/*
 * Digite su edad e imprima si es mayor de edad o menor
 */
package logica;
import java.util.Scanner;

public class MayoriaEdad {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("***SABER SI UNA PERSONA ES MAYOR DE EDAD***");
        System.out.print("Ingrese la edad de la persona: ");
        int edad = entrada.nextInt();
        
        if (edad >= 18){
            System.out.println("La persona tiene " + edad + " años, es mayor de edad.");
        } else if (edad < 18 && edad >= 1){
            System.out.println("La persona tiene " + edad + " años, es menor de edad.");
        } else {
            System.out.println("El valor ingresado no es una edad válida.");
        }
    }
    
}
