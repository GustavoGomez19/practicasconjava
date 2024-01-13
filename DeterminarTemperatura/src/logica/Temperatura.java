/*
 * Diseñe un programa que lea la temperatura e imprima el tipo de clima de acuerdo con lo dado.
Temperatura: 
TP <= 10 - Frio 
10 < TP <=20 - Nublado 
20< TP <= 30 - Caluroso 
TP > 30 - Tropical
 */
package logica;
import java.util.Scanner;

public class Temperatura {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("**DETERMINAR LA TEMPERATURA DEL CLIMA**");
        
        System.out.print("Ingrese la temperaura: ");
        int temp = entrada.nextInt();
        
        if (temp <= 10){
            System.out.println("La temperatura es de " + temp + "° - FRIO");
        } else if (temp > 10 && temp <= 20){
            System.out.println("La temperatura es de " + temp + "° - NUBLADO");
        } else if (temp > 20 && temp <= 30){
            System.out.println("La temperatura es de " + temp + "° - CALUROSO");
        } else if (temp > 30){
            System.out.println("La temperatura es de " + temp + "° - TROPICAL");
        }
    }
    
}
