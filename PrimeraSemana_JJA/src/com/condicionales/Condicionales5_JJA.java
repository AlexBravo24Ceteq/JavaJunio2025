package com.condicionales;

import java.util.Scanner;

public class Condicionales5_JJA {
    //5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
    //parámetros: edad, nota y sexo.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos
        System.out.print(" Ingresa la nota (0 a 10): ");
        double nota = scanner.nextDouble();

        System.out.print(" Ingresa la edad: ");
        int edad = scanner.nextInt();

        scanner.nextLine(); // Limpiar buffer

        System.out.print(" Ingresa el sexo (M/F): ");
        String sexo = scanner.nextLine();

        // Evaluar condiciones
        if (nota >= 5 && edad >= 18 && sexo.equalsIgnoreCase("M")) {
            System.out.println(" Resultado: POSIBLE");
        } else if (nota >= 5 && edad >= 18 && sexo.equalsIgnoreCase("F")) {
            System.out.println(" Resultado: ACEPTADA");
        } else {
            System.out.println(" Resultado: NO ACEPTADA");
        }

        scanner.close();
    }
}
