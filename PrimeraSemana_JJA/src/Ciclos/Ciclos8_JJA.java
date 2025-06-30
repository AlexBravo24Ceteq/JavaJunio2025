package Ciclos;

import java.util.Scanner;

public class Ciclos8_JJA {
    //8. Programa Java que lea dos números y muestre los números desde el menor hasta el
    //mayor
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print(" Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        System.out.println(" Números del menor al mayor:");
        for (int i = menor; i <= mayor; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // salto de línea
        scanner.close();
    }
}