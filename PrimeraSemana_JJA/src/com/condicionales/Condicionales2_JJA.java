package com.condicionales;
import java.util.Scanner;

public class Condicionales2_JJA {
    //2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(" El número " + numero + " es PAR.");
        } else {
            System.out.println(" El número " + numero + " es IMPAR.");
        }

        scanner.close();
    }
}
