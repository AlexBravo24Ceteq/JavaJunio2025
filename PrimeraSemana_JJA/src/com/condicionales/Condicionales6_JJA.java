package com.condicionales;

import java.util.Scanner;

public class Condicionales6_JJA {
    //6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se
    //clasifica en tipos (A y B), y además en tamaños (1 y 2).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingresa el tipo de uva (A o B): ");
        String tipo = scanner.nextLine().toUpperCase(); // Convertimos a mayúsculas

        System.out.print(" Ingresa el tamaño de uva (1 o 2): ");
        int tamaño = scanner.nextInt();

        System.out.print(" Ingresa el precio inicial por kilo (€): ");
        double precioInicial = scanner.nextDouble();

        System.out.print(" Ingresa la cantidad de kilos: ");
        double kilos = scanner.nextDouble();

        double ajuste = 0;

        // Determinar ajuste por tipo y tamaño
        if (tipo.equals("A")) {
            if (tamaño == 1) {
                ajuste = 0.20;
            } else if (tamaño == 2) {
                ajuste = 0.30;
            }
        } else if (tipo.equals("B")) {
            if (tamaño == 1) {
                ajuste = -0.30;
            } else if (tamaño == 2) {
                ajuste = -0.50;
            }
        } else {
            System.out.println(" Tipo de uva no válido.");
            scanner.close();
            return;
        }

        double precioFinal = precioInicial + ajuste;
        double total = precioFinal * kilos;

        System.out.println(" Precio final por kilo: " + precioFinal + " €");
        System.out.println(" Total a recibir: " + total + " €");

        scanner.close();
    }
}

