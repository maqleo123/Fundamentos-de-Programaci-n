package tema2.practica_06_10_2026;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double LIMITE_RETIRO = 5000;

        double saldo;
        double retiro;
        double saldoFinal;

        System.out.print("Ingresa el saldo disponible: ");
        saldo = entrada.nextDouble();

        System.out.print("Ingresa la cantidad a retirar: ");
        retiro = entrada.nextDouble();

        if (retiro <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor a cero");
        } else if (retiro > LIMITE_RETIRO) {
            System.out.println("El retiro supera el limite de $5000");
        } else if (retiro > saldo) {
            System.out.println("Fondos insuficientes");
        } else {
            saldoFinal = saldo - retiro;

            System.out.println("Retiro autorizado");
            System.out.println("Efectivo entregado: $" + retiro);
            System.out.println("Saldo restante: $" + saldoFinal);

            if (saldoFinal < 500) {
                System.out.println("Error: su saldo restante es menor a $500");
            }
        }

        entrada.close();
    }
}