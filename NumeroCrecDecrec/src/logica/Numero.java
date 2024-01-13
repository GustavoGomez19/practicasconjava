/*
 Digite tres números e imprima si están en orden creciente, 
 en orden decreciente o no aumenta ni disminuye el orden.
 */
package logica;
import java.util.Scanner;
public class Numero {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("***NÚMEROS CRECIENTES||DECRECIENTES||SIN ORDEN***");
        System.out.print("Ingrese el primero de tres números:");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo de tres números:");
        int num2 = entrada.nextInt();
        System.out.print("Ingrese el tercero de tres números:");
        int num3 = entrada.nextInt();
        
        if(num1 < num2 && num1 < num3 && num2 < num3){
            System.out.println("Los números están de forma creciente. " + num1 + " - " + num2 + " - " +num3);
        } else if (num3 < num2 && num3 < num1 && num2 < num1){
            System.out.println("Los números están de forma decreciente. " + num1 + " - " + num2 + " - " +num3);
        } else {
            System.out.println("Los números no están ni de forma creciente ni decreciente. " + num1 + " - " + num2 + " - " +num3);
        }
            
    }
    
}
