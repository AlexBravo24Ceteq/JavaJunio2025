package Ciclos;

import java.util.Scanner;

public class Ciclos4_JJA {
    //4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
    //cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
    //“Carácter no encontrado”.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingresa una frase: ");
        String frase = scanner.nextLine();

        System.out.print(" Ingresa la letra que quieres contar: ");
        char letra = scanner.next().charAt(0);

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println(" La letra '" + letra + "' aparece " + contador + " veces.");
        } else {
            System.out.println(" Carácter no encontrado.");
        }

        scanner.close();
    }
}

