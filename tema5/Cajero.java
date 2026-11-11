package tema5;

import java.util.Scanner;

public class Cajero {

    public static boolean Vretiro(double saldo, double retiro) {
        if (retiro > 0 && saldo >= retiro && retiro % 50 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double ActualizarS(double saldo, double retiro) {
        saldo = saldo - retiro;
        return saldo;
    }

    public static void Comprobante(String nombre, double saldo, double retiro) {
        System.out.println("======= Comprobante =======");
        System.out.println("Nombre: " + nombre);
        System.out.println("Retiro: " + retiro);
        System.out.println("Saldo Actual: " + saldo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======= Cajero Automatico =======");
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su Saldo en cuenta: ");
        double saldo = sc.nextDouble();
        System.out.println("Que cantidad desea retirar? ");
        double retiro = sc.nextDouble();
        if (Vretiro(saldo, retiro)) {
            saldo = ActualizarS(saldo, retiro);
            Comprobante(nombre, saldo, retiro);
        } else {
            System.out.println("!Retiro Rechazado");
            System.out.println("Saldo insuficiente");
        }
        sc.close();

    }

}
