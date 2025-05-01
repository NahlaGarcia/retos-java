package A01;

import java.util.Scanner;
import java.math.RoundingMode;

/**
 * Desarrolla un algoritmo que, dado un número decimal, devuelve su resultado entero redondeado siguiendo estas normas:
 * Todos los números decimales por debajo de ,5 se redondean a la baja.
 * Los que tengan decimales desde ,5 a superior, se redondean al alza.
 */
public class a01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la nota obtenida en el examen: ");
        double notaExamen = entrada.nextDouble(); //Introducir nota usuario

        double notaFinal = Math.round(notaExamen); //Redondear nota

        System.out.println("La nota final es: " + notaFinal);

        entrada.close();



    }
}
