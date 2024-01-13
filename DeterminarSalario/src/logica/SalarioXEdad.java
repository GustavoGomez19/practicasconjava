/*
 * Ingrese el nombre, edad, salario y muestre por pantalla los datos
    * Si la persona es menor de edad muestre un mensaje que inidique que no puede trabajar
    * Si la persona tiene entre 18 y 50 años el salario aumenta un 5%
    * Si la persona tiene entre 51 y 60 años el salario aumenta un 10%
    * Si la persona tiene más de 60 años el salario aumenta un 15%
 */
package logica;
import java.util.Scanner;

public class SalarioXEdad {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario = 0;
        System.out.println("**SABER EL SALARIO DE UNA PERSONA**");
        
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        
        if (edad < 18){
            System.out.println("Usted es menor de edad, no puede trabajar.");
        } else if (edad >= 18 && edad <= 50){
            System.out.print("Ingrese su salario: ");
            salario = entrada.nextDouble();
            double porcentajeAumento = 0.05;
            double aumento = salario *porcentajeAumento;
            double totalSueldo = salario + aumento;
            System.out.println();
            System.out.println("***INFORMACIÓN DE LA PERSONA***" + "\n" + 
                    "Nombre: " + nombre + "\n" +
                    "Edad: " + edad + "\n" + 
                    "Salario base: " + salario + "\n" +
                    "Concepto de aumento por edad (5%): " + aumento + "\n" +
                    "Total salario devengado: " + totalSueldo);
        } else if (edad >= 51 && edad < 61){
            System.out.print("Ingrese su salario: ");
            salario = entrada.nextDouble();
            double porcentajeAumento = 0.05;
            double aumento = salario *porcentajeAumento;
            double totalSueldo = salario + aumento;
            System.out.println();
            System.out.println("***INFORMACIÓN DE LA PERSONA***" + "\n" + 
                    "Nombre: " + nombre + "\n" +
                    "Edad: " + edad + "\n" + 
                    "Salario base: " + salario + "\n" +
                    "Concepto de aumento por edad (5%): " + aumento + "\n" +
                    "Total salario devengado: " + totalSueldo);
        } else if (edad >= 61){
            System.out.print("Ingrese su salario: ");
            salario = entrada.nextDouble();
            double porcentajeAumento = 0.05;
            double aumento = salario *porcentajeAumento;
            double totalSueldo = salario + aumento;
            System.out.println();
            System.out.println("***INFORMACIÓN DE LA PERSONA***" + "\n" + 
                    "Nombre: " + nombre + "\n" +
                    "Edad: " + edad + "\n" + 
                    "Salario base: " + salario + "\n" +
                    "Concepto de aumento por edad (5%): " + aumento + "\n" +
                    "Total salario devengado: " + totalSueldo);
        }
    }
    
}
