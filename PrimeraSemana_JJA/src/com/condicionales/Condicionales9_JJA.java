package com.condicionales;

import java.util.Scanner;

public class Condicionales9_JJA {
    //9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si
    //introducimos otro número nos da un error.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("📆 Ingresa un número del 1 al 7: ");
        int dia = scanner.nextInt();

        String nombreDia;

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = " ERROR: número de día inválido.";
        }

        System.out.println(" Resultado: " + nombreDia);
        scanner.close();
    }
}
