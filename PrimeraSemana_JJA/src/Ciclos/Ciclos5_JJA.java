package Ciclos;

public class Ciclos5_JJA {
    //5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
    //de un día desde las 00:00:00 horas hasta las 23:59:59 horas

    public static void main(String[] args) {
        for (int hora = 0; hora < 24; hora++) {
            for (int minuto = 0; minuto < 60; minuto++) {
                for (int segundo = 0; segundo < 60; segundo++) {
                    System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
                }
            }
        }
    }
}
