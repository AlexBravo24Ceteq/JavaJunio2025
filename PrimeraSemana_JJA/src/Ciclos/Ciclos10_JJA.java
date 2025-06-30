package Ciclos;

import java.util.Scanner;

public class Ciclos10_JJA {
//10. Programa que lea 20 números e indique si son positivos o negativos y pares o
//impares y además muestre la sumatoria de los positivos y sumatoria de los impares.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumaPositivos = 0;
        int sumaImpares = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print(" Ingresa el número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero >= 0) {
                System.out.println(" Positivo");
                sumaPositivos += numero;
            } else {
                System.out.println(" Negativo");
            }

            if (numero % 2 == 0) {
                System.out.println(" Par");
            } else {
                System.out.println(" Impar");
                sumaImpares += numero;
            }

            System.out.println(); // Línea en blanco para separar entradas
        }

        System.out.println(" Sumatoria de positivos: " + sumaPositivos);
        System.out.println(" Sumatoria de impares: " + sumaImpares);

        scanner.close();
    }
}