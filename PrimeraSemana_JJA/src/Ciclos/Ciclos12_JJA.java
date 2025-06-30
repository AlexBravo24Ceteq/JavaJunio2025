package Ciclos;

import java.util.Scanner;

public class Ciclos12_JJA {
    //12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
    //cuando el promedio de las edades sea superior a 25.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumaEdades = 0;
        int cantidad = 0;
        double promedio = 0;

        while (promedio <= 25) {
            System.out.print(" Ingresa una edad: ");
            int edad = scanner.nextInt();

            sumaEdades += edad;
            cantidad++;
            promedio = (double) sumaEdades / cantidad;
        }

        System.out.println(" Promedio final: " + promedio);
        System.out.println(" Se ingresaron " + cantidad + " edades.");

        scanner.close();
    }
}