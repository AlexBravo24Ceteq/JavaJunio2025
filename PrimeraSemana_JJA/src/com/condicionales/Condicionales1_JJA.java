package com.ciclos;
import java.util.Scanner;

public class Condicionales1_JJA {
    //1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número:");
        int numero1 = scanner.nextInt();

        System.out.print(" Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println(" El primer número (" + numero1 + ") es mayor que el segundo (" + numero2 + ").");
        } else if (numero2 > numero1) {
            System.out.println(" El segundo número (" + numero2 + ") es mayor que el primero (" + numero1 + ").");
        } else {
          System.out.println(" Ambos números son iguales.");
      }

        scanner.close();
    }
}
