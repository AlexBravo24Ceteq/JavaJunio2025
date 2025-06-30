package Ciclos;

public class Ciclos6_JJA {
    //6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés
    //mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año

    public static void main(String[] args) {
        double capital = 1000.0;
        double interesMensual = 0.02;

        for (int mes = 1; mes <= 12; mes++) {
            capital = capital + (capital * interesMensual);
        }

        System.out.printf(" El monto al cabo de un año será: $%.2f\n", capital);
    }
}