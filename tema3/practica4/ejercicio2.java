package practica4;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final double INTERES_MENSUAL = 0.01;
        final int PLAZO_MAXIMO = 24;

        double dineroInicial, metaAhorro, ahorroMensual, saldo, intereses, interesMes;

        int opcion = 0, plazo, mesesNecesarios, repetir;

        do {

            System.out.print("ingresa la cantidad inicial de dinero: ");
            dineroInicial = entrada.nextDouble();

            System.out.print("ingresa tu meta de ahorro: ");
            metaAhorro = entrada.nextDouble();

            System.out.print("ingresa el ahorro mensual fijo: ");
            ahorroMensual = entrada.nextDouble();

            while (dineroInicial <= 0 || metaAhorro <= 0 ||
                    ahorroMensual <= 0) {

                System.out.println("\nError: todos los valores deben ser positivos.");

                System.out.print("Cantidad inicial: ");
                dineroInicial = entrada.nextDouble();

                System.out.print("Meta de ahorro: ");
                metaAhorro = entrada.nextDouble();

                System.out.print("Ahorro mensual: ");
                ahorroMensual = entrada.nextDouble();
            }

            while (opcion < 1 || opcion > 3) {

                System.out.println("Opcion no valida. Intenta nuevamente.");

                System.out.println("\n===== PLAZO DE SIMULACION =====");
                System.out.println("1. 6 meses");
                System.out.println("2. 12 meses");
                System.out.println("3. 24 meses");
                System.out.print("Selecciona una opcion: ");

                opcion = entrada.nextInt();
            }

            switch (opcion) {

                case 1:
                    plazo = 6;
                    break;

                case 2:
                    plazo = 12;
                    break;

                case 3:
                    plazo = 24;
                    break;

                default:
                    plazo = PLAZO_MAXIMO;
                    break;
            }

            saldo = dineroInicial;
            intereses = 0;
            mesesNecesarios = 0;

            boolean metaAlcanzada = false;

            for (int mes = 1; mes <= plazo; mes++) {

                saldo += ahorroMensual;

                interesMes = saldo * INTERES_MENSUAL;

                intereses += interesMes;

                saldo += interesMes;

                if (!metaAlcanzada && saldo >= metaAhorro) {

                    metaAlcanzada = true;
                    mesesNecesarios = mes;

                } else {
                }

                System.out.println("Mes " + mes +
                        " | Saldo: $" + String.format("%.2f", saldo));
            }

            System.out.println("\n===== RESULTADOS DE LA SIMULACION =====");

            System.out.println("Dinero inicial: $" +
                    String.format("%.2f", dineroInicial));

            System.out.println("Ahorro mensual: $" +
                    String.format("%.2f", ahorroMensual));

            System.out.println("Plazo seleccionado: " + plazo + " meses");

            System.out.println("Saldo final: $" +
                    String.format("%.2f", saldo));

            System.out.println("Intereses generados: $" +
                    String.format("%.2f", intereses));

            if (metaAlcanzada) {

                System.out.println("Meta alcanzada.");
                System.out.println("Meses necesarios: " + mesesNecesarios);

            } else {

                System.out.println("No se alcanzo la meta de ahorro.");
            }
            System.out.print("\nDeseas realizar otra simulacion? \n1)si \n2)no \nelige una opcion: ");
            repetir = entrada.nextInt();

        } while (repetir == 1);

        System.out.println("\nPrograma finalizado.");

        entrada.close();
    }
}
