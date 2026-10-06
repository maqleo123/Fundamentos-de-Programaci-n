package practica_06_10_2026;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double COMISION = 10;
        final double LIMITE_RETIRO = 5000;

        double saldo;
        double retiro;

        System.out.print("Ingresa el saldo disponible: ");
        saldo = entrada.nextDouble();

        System.out.print("Ingresa la cantidad a retirar: ");
        retiro = entrada.nextDouble();

        if (retiro <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor a cero");
        } else if (retiro > LIMITE_RETIRO) {
            System.out.println("El retiro supera el limite de $5000");
        } else if (retiro + COMISION > saldo) {
            System.out.println("Saldo insuficiente para cubrir el retiro y la comision");
        } else {
            double saldoFinal = saldo - retiro - COMISION;

            System.out.println("Retiro autorizado.");
            System.out.println("Monto retirado: $" + retiro);
            System.out.println("Comision: $" + COMISION);
            System.out.println("Saldo final: $" + saldoFinal);
        }

        entrada.close();
    }
}