package tema2.practica_06_10_2026;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double DESCUENTO_NORMAL = 0.00;
        final double DESCUENTO_FRECUENTE = 0.10;
        final double DESCUENTO_VIP = 0.20;
        final double DESCUENTO_ADICIONAL = 0.05;

        String nombre;
        int tipoCliente;
        double compra;
        double descuentoCliente = 0;
        double descuentoAdicional = 0;
        double montoDescuentoCliente;
        double montoDescuentoAdicional;
        double total;

        System.out.print("Ingresa el nombre del cliente: ");
        nombre = entrada.nextLine();

        System.out.print("Ingresa el monto de la compra: ");
        compra = entrada.nextDouble();

        System.out.print("Ingresa el tipo de cliente (1-Normal, 2-Frecuente, 3-VIP): ");
        tipoCliente = entrada.nextInt();

        if (tipoCliente == 1) {
            descuentoCliente = DESCUENTO_NORMAL;
        } else if (tipoCliente == 2) {
            descuentoCliente = DESCUENTO_FRECUENTE;
        } else if (tipoCliente == 3) {
            descuentoCliente = DESCUENTO_VIP;
        } else {
            System.out.println("Tipo de cliente no valido");
        }

        if (compra > 2000) {
            descuentoAdicional = DESCUENTO_ADICIONAL;
        }

        montoDescuentoCliente = compra * descuentoCliente;
        montoDescuentoAdicional = compra * descuentoAdicional;
        total = compra - montoDescuentoCliente - montoDescuentoAdicional;

        System.out.println("\nCliente: " + nombre);
        System.out.println("Monto original: $" + compra);
        System.out.println("Descuento por tipo de cliente: $" + montoDescuentoCliente);
        System.out.println("Descuento adicional: $" + montoDescuentoAdicional);
        System.out.println("Total a pagar: $" + total);

        entrada.close();
    }
}