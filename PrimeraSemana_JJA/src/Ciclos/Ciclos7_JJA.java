package Ciclos;

public class Ciclos7_JJA {
    //7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
    //mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
    //dinero?
    public static void main(String[] args) {
        double capital = 700.0;
        double interesMensual = 0.02;
        int meses = 0;

        while (capital <= 1500.0) {
            capital = capital + (capital * interesMensual);
            meses++;
        }

        System.out.println(" Se necesitaron " + meses + " meses para superar los $1500.");
        System.out.printf(" Capital final: $%.2f\n", capital);
    }
}
