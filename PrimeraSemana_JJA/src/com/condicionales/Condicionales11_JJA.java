package com.condicionales;

import java.util.Scanner;

public class Condicionales11_JJA {
    //Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo
    //de la entrega.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingresa el peso del paquete (kg): ");
        double peso = scanner.nextDouble();

        if (peso > 5) {
            System.out.println(" El paquete supera el límite de 5 kg. No se puede transportar.");
            scanner.close();
            return;
        }

        System.out.println(" Zonas disponibles:");
        System.out.println("1 - América del Norte");
        System.out.println("2 - América Central");
        System.out.println("3 - América del Sur");
        System.out.println("4 - Europa");
        System.out.println("5 - Asia");

        System.out.print(" Ingresa el número de zona (1 a 5): ");
        int zona = scanner.nextInt();

        double costoPorKilo;

        switch (zona) {
            case 1:
                costoPorKilo = 24.00;
                break;
            case 2:
                costoPorKilo = 20.00;
                break;
            case 3:
                costoPorKilo = 21.00;
                break;
            case 4:
                costoPorKilo = 10.00;
                break;
            case 5:
                costoPorKilo = 18.00;
                break;
            default:
                System.out.println(" Zona no válida.");
                scanner.close();
                return;
        }

        double total = peso * costoPorKilo;

        System.out.println(" Total a pagar: " + total + " €");
        scanner.close();
    }
}
