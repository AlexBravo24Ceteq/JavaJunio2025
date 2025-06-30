package com.condicionales;

import java.util.Scanner;

public class Condicionales13_JJA {
    //13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
    //centro de salud, un comedor de niños y una parte lo invierte
    //La institución desea saber cuánto de dinero destinará a cada rubro anualmente.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingresa el monto de la donación: ");
        double donacion = scanner.nextDouble();

        double salud, comedor, bolsa;

        if (donacion >= 10000) {
            salud = donacion * 0.30;
            comedor = donacion * 0.50;
            bolsa = donacion * 0.20;
        } else {
            salud = donacion * 0.25;
            comedor = donacion * 0.60;
            bolsa = donacion * 0.15;
        }

        System.out.println(" Centro de salud: $" + String.format("%.2f", salud));
        System.out.println(" Comedor infantil: $" + String.format("%.2f", comedor));
        System.out.println(" Inversión en bolsa: $" + String.format("%.2f", bolsa));

        scanner.close();
    }
}
