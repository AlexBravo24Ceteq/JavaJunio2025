package com.condicionales;

import java.util.Scanner;

public class Condicionales12_JJA {
    //12.Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2
    //[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingresa tu peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print(" Ingresa tu altura en metros (ej. 1.65): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println(" Tu IMC es: " + String.format("%.2f", imc));

        if (imc < 18.5) {
            System.out.println(" Clasificación: Bajo peso");
        } else if (imc < 25) {
            System.out.println(" Clasificación: Normal");
        } else if (imc < 30) {
            System.out.println(" Clasificación: Sobrepeso");
        } else if (imc < 35) {
            System.out.println(" Clasificación: Obesidad grado I");
        } else if (imc < 40) {
            System.out.println("  Clasificación: Obesidad grado II");
        } else {
            System.out.println(" Clasificación: Obesidad grado III (mórbida)");
        }

        scanner.close();
    }
}
