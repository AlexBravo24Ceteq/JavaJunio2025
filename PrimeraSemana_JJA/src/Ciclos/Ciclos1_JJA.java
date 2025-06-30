package Ciclos;

public class Ciclos1_JJA {
    //1.- Programa un algoritmo que realice la tabla de multiplicar del 12

    public static void main(String[] args) {
            int numero = 12;

            System.out.println(" Tabla del " + numero);

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }
    }