/*
 * Digite tres números e imprima el número mayor
 */
package logica;

import java.util.Scanner;

public class Numero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("***SABER EL NÚMERO MAYOR***");

        System.out.print("Ingrese el primero de tres número: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo de tres número: ");
        int num2 = entrada.nextInt();

        System.out.print("Ingrese el tercero de tres número: ");
        int num3 = entrada.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayor es el número " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número mayor es el número " + num2);
        } else {
            System.out.println("El número mayor es el número " + num3);
        }
    }

}
