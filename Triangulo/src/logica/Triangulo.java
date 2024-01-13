/*
 * Dado tres de un triángulo decir: 
- Triángulo equilátero: es el que tiene los tres lados iguales 
- Triángulo isósceles: es el que tiene los dos lados iguales y uno distinto 
- Triángulo escaleno: es el que tiene los tres lados distintos
 */
package logica;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("**DETERMINAR EL TIPO DE TRIANGULO**");
        
        System.out.print("Ingrese el primer lado del triangulo: ");
        int ladoUno = entrada.nextInt();
        System.out.print("Ingrese el segundo lado del triangulo: ");
        int ladoDos = entrada.nextInt();
        System.out.print("Ingrese el tercer lado del triangulo: ");
        int ladoTres = entrada.nextInt();
        
        if (ladoUno == ladoDos && ladoUno == ladoTres && ladoDos == ladoTres){
            System.out.println("**INFORMACIÓN DEL TRINAGULO**" + "\n" +
                    "Lado uno: " + ladoUno + "\n" +
                    "Lado dos: " + ladoDos + "\n" +
                    "Lado tres: " + ladoTres + "\n" +
                    "Tipo de trinagulo: Equilátero");
        } else if (ladoUno == ladoDos || ladoUno == ladoTres || ladoDos == ladoTres){
            System.out.println("**INFORMACIÓN DEL TRINAGULO**" + "\n" +
                    "Lado uno: " + ladoUno + "\n" +
                    "Lado dos: " + ladoDos + "\n" +
                    "Lado tres: " + ladoTres + "\n" +
                    "Tipo de trinagulo: Isóceles");
        } else {
            System.out.println("**INFORMACIÓN DEL TRINAGULO**" + "\n" +
                    "Lado uno: " + ladoUno + "\n" +
                    "Lado dos: " + ladoDos + "\n" +
                    "Lado tres: " + ladoTres + "\n" +
                    "Tipo de trinagulo: Escaleno");
        }
        
    }
    
}
