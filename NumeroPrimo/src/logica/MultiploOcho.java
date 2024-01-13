/*
 Digite un número y que muestre si es múltiplo de 8
 */
package logica;

import java.util.Scanner;

public class MultiploOcho {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("*** NÚMERO MULTIPLO DE 8 ***");
        System.out.print("Saber si un número es múltiplo de 8." + "\n" + "Ingrese el número: ");
        int numero = entrada.nextInt();
        //String bandera = "s";

        while (numero > 0) {
            if (numero % 8 == 0) {
                System.out.println("El número " + numero + " es múltiplo de 8");
            } else {
                System.out.println("El número " + numero + " no es múltiplo de 8");
            }

            System.out.print("Ingrese el número: ");
            numero = entrada.nextInt();
        }

    }

}
