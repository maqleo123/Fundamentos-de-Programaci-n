package Practica16_10_2026;

import java.util.Scanner;

public class gasolineria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion, cargas = 0, cargasDescuento = 0;
        double litros, precio, importe, descuento, total, litrosVendidos = 0, importeAntes = 0, totalCobrado = 0,
                promedio;

        do {
            System.out.println("===== GASOLINERA =====");

            System.out.print("litros cargados: ");
            litros = entrada.nextDouble();

            System.out.print("precio por litro: ");
            precio = entrada.nextDouble();

            if (litros <= 0 || precio <= 0) {
                System.out.println("error: los litros y el precio deben ser mayores que cero.");
            } else {
                importe = litros * precio;
                descuento = 0;
                total = importe;

                if (litros >= 40) {
                    descuento = importe * 0.05;
                    total = importe - descuento;
                    cargasDescuento++;
                }

                cargas++;
                litrosVendidos += litros;
                importeAntes += importe;
                totalCobrado += total;
                System.out.println("=========================================");
                System.out.println("importe antes del descuento: $" + importe);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Total a cobrar: $" + total);
                System.out.println("=========================================");
            }

            System.out.println("\nDesea registrar otra carga?");
            System.out.println("1)Si");
            System.out.println("2)No");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Registrando siguiente carga");
                    break;
                case 2:
                    System.out.println("Finalizando registro");
                    break;
                default:
                    System.out.println("Opcion no valida finalizando registro");
                    opcion = 2;
                    break;
            }

        } while (opcion == 1);

        if (cargas > 0) {
            promedio = totalCobrado / cargas;
        } else {
            promedio = 0;
        }

        System.out.println("\n======= REPORTE DEL DIA =======");
        System.out.println("Cargas registradas: " + cargas);
        System.out.println("Cargas con descuento: " + cargasDescuento);
        System.out.println("Litros vendidos: " + litrosVendidos);
        System.out.println("Importe antes de descuentos: $" + importeAntes);
        System.out.println("Total cobrado: $" + totalCobrado);
        System.out.println("Promedio cobrado por carga: $" + promedio);
        entrada.close();
    }
}