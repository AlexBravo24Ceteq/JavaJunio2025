package com.condicionales;

import java.util.Scanner;

public class Condicionales4_JJA {
//4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingresa una letra: ");
        String entrada = scanner.nextLine(); // Lee la entrada completa como texto

        if (entrada.length() == 1) {
            char letra = entrada.charAt(0); // Toma el primer carácter
            if (Character.isLetter(letra)) {
                if (Character.isUpperCase(letra)) {
                    System.out.println(" La letra '" + letra + "' es MAYÚSCULA.");
                } else {
                    System.out.println(" La letra '" + letra + "' NO es mayúscula.");
                }
            } else {
                System.out.println(" Lo que escribiste no es una letra.");
            }
        } else {
            System.out.println(" Error: Ingresa solo UNA letra.");
        }

        scanner.close();
    }
}

