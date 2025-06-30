package com.condicionales;

import java.util.Scanner;

public class Condicionales3_JJA {
//3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el
//segundo número es 0, debe mostrar un mensaje de error.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingresa el número **dividendo** (el que se va a dividir): ");
        double numero1 = scanner.nextDouble();

        System.out.print("➗ Ingresa el número **divisor** (el que divide): ");
        double numero2 = scanner.nextDouble();

        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + resultado);
        } else {
            System.out.println(" ERROR: No se puede dividir entre cero.");
        }

        scanner.close();
    }
}


