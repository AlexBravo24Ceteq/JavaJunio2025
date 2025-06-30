package com.condicionales;

import java.util.Scanner;

public class Condicionales7_JJA {
    //7. El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto
    //debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("👥 Ingresa el número de alumnos: ");
        int alumnos = scanner.nextInt();

        double costoPorAlumno;
        double totalPagar;

        if (alumnos >= 100) {
            costoPorAlumno = 65;
        } else if (alumnos >= 50) {
            costoPorAlumno = 70;
        } else if (alumnos >= 30) {
            costoPorAlumno = 95;
        } else {
            totalPagar = 4000;
            costoPorAlumno = totalPagar / alumnos;
            System.out.println(" Costo total del autobús: " + totalPagar + " €");
            System.out.println(" Cada alumno debe pagar: " + costoPorAlumno + " €");
            scanner.close();
            return;
        }

        totalPagar = alumnos * costoPorAlumno;

        System.out.println(" Costo total del autobús: " + totalPagar + " €");
        System.out.println(" Cada alumno debe pagar: " + costoPorAlumno + " €");

        scanner.close();
    }
}

