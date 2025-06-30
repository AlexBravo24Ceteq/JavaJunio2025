package Ciclos;

import java.util.Scanner;

public class Ciclos3_JJA {
    //3. Realiza un programa para determinar si un String es palíndromo.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingresa una palabra o frase: ");
        String texto = scanner.nextLine();

        // Eliminar espacios y convertir a minúsculas
        String limpio = texto.replaceAll("\\s+", "").toLowerCase();

        // Invertimos el texto
        String invertido = "";
        for (int i = limpio.length() - 1; i >= 0; i--) {
            invertido += limpio.charAt(i);
        }

        if (limpio.equals(invertido)) {
            System.out.println(" Es un palíndromo.");
        } else {
            System.out.println(" No es un palíndromo.");
        }

        scanner.close();
    }
}




