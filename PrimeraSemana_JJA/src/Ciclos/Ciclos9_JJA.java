package Ciclos;

import java.util.Scanner;

public class Ciclos9_JJA {
    //9. Programa Java que lea dos números y muestre los números pares entre ellos
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print(" Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        System.out.println(" Números pares entre " + menor + " y " + mayor + ":");
        for (int i = menor; i <= mayor; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(); // salto de línea final
        scanner.close();
    }
}