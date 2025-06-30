package com.condicionales;

import java.util.Scanner;

public class Condicionales8_JJA {
    //8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
    //seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado
    //obtenido.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingresa el número del dado (1-6): ");
        int numero = scanner.nextInt();

        String caraOpuesta;

        if (numero == 1) {
            caraOpuesta = "seis";
        } else if (numero == 2) {
            caraOpuesta = "cinco";
        } else if (numero == 3) {
            caraOpuesta = "cuatro";
        } else if (numero == 4) {
            caraOpuesta = "tres";
        } else if (numero == 5) {
            caraOpuesta = "dos";
        } else if (numero == 6) {
            caraOpuesta = "uno";
        } else {
            System.out.println(" ERROR: número incorrecto.");
            scanner.close();
            return;
        }

        System.out.println(" La cara opuesta es: " + caraOpuesta);
        scanner.close();
    }
}

