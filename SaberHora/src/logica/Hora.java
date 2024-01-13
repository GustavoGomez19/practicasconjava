/*
 * Pedir una hora de la forma hora, minutos y segundos, e imprimir la hora en el segundo siguiente
 */
package logica;
import java.util.Scanner;

public class Hora {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("**ARMAR HORA**");
        
        System.out.print("Ingrese la hora: ");
        int hora = entrada.nextInt();
        System.out.print("Ingrese los minutos: ");
        int minutos = entrada.nextInt();
        System.out.print("Ingrese los segundos: ");
        int segundos = entrada.nextInt();
        segundos++;
        System.out.println("La hora es: " + hora + ":" + minutos + ":" + segundos);
    }
    
}
