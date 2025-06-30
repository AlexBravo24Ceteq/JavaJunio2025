package Ciclos;

import java.util.Scanner;

public class Ciclos2_JJA {
    //2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
    //desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
    //23 x 95 = ???
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingresa el número para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.print(" ¿Hasta qué número quieres multiplicar? ");
        int limite = scanner.nextInt();

        System.out.println(" Tabla del " + numero + " hasta " + limite + ":");

        for (int i = 1; i <= limite; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}
