package com.condicionales;

import java.util.Scanner;

public class Condicionales10_JJA {
    //10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el
    //mes correspondiente.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("📅 Ingresa el número del mes (1 al 12): ");
        int mes = scanner.nextInt();

        String mensaje;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                mensaje = "Este mes tiene 31 días.";
                break;
            case 4, 6, 9, 11:
                mensaje = "Este mes tiene 30 días.";
                break;
            case 2:
                mensaje = "Este mes tiene 28 días (29 en años bisiestos).";
                break;
            default:
                mensaje = " ERROR: número de mes inválido.";
        }

        System.out.println(" Resultado: " + mensaje);
        scanner.close();
    }
}

