package tema2.practica_06_10_2026;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double TARIFA_MOTOCICLETA = 10;
        final double TARIFA_AUTOMOVIL = 20;
        final double TARIFA_CAMIONETA = 30;
        final double DESCUENTO_5_HORAS = 0.10;
        final double DESCUENTO_10_HORAS = 0.20;

        int tipoVehiculo;
        double horas;
        double tarifa = 0;
        double subtotal;
        double descuento = 0;
        double total;

        System.out.print("Ingresa el tipo de vehiculo (1-Motocicleta, 2-Automovil, 3-Camioneta): ");
        tipoVehiculo = entrada.nextInt();

        System.out.print("Ingresa el numero de horas: ");
        horas = entrada.nextDouble();

        if (horas <= 0) {
            System.out.println("La cantidad de horas no es valida");
        } else if (tipoVehiculo == 1) {
            tarifa = TARIFA_MOTOCICLETA;

            subtotal = tarifa * horas;

            if (horas > 10) {
                descuento = subtotal * DESCUENTO_10_HORAS;
            } else if (horas > 5) {
                descuento = subtotal * DESCUENTO_5_HORAS;
            }

            total = subtotal - descuento;

            System.out.println("Tipo de vehiculo: Motocicleta");
            System.out.println("Horas: " + horas);
            System.out.println("Tarifa por hora: $" + tarifa);
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + total);

        } else if (tipoVehiculo == 2) {
            tarifa = TARIFA_AUTOMOVIL;

            subtotal = tarifa * horas;

            if (horas > 10) {
                descuento = subtotal * DESCUENTO_10_HORAS;
            } else if (horas > 5) {
                descuento = subtotal * DESCUENTO_5_HORAS;
            }

            total = subtotal - descuento;

            System.out.println("Tipo de vehiculo: Automovil");
            System.out.println("Horas: " + horas);
            System.out.println("Tarifa por hora: $" + tarifa);
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + total);

        } else if (tipoVehiculo == 3) {
            tarifa = TARIFA_CAMIONETA;

            subtotal = tarifa * horas;

            if (horas > 10) {
                descuento = subtotal * DESCUENTO_10_HORAS;
            } else if (horas > 5) {
                descuento = subtotal * DESCUENTO_5_HORAS;
            }

            total = subtotal - descuento;

            System.out.println("Tipo de vehiculo: Camioneta");
            System.out.println("Horas: " + horas);
            System.out.println("Tarifa por hora: $" + tarifa);
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + total);

        } else {
            System.out.println("Tipo de vehiculo no valido");
        }

        entrada.close();
    }
}