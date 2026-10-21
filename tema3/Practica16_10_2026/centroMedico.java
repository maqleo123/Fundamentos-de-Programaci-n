package Practica16_10_2026;

import java.util.Scanner;

public class centroMedico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int edad, ninos = 0, adolescentes = 0, adultos = 0, adultosMayores = 0, pacientes = 0, opcion;
        double costo, descuento, totalPagado, dineroRecaudado = 0, descuentosAplicados = 0, promedio;

        do {
            System.out.println("====== CENTRO MEDICO =====");

            System.out.print("Ingrese la edad del paciente: ");
            edad = entrada.nextInt();

            System.out.print("Ingrese el costo de la consulta: ");
            costo = entrada.nextDouble();

            descuento = 0;
            totalPagado = costo;
            System.out.println("=========================================");

            if (edad < 12) {
                ninos++;
                System.out.println("categoria: Niño");
            } else if (edad <= 17) {
                adolescentes++;
                System.out.println("categoria: Adolescente");
            } else if (edad <= 59) {
                adultos++;
                System.out.println("categoria: Adulto");
            } else {
                adultosMayores++;
                descuento = costo * 0.15;
                totalPagado = costo - descuento;
                System.out.println("categoria: Adulto mayor");
            }

            dineroRecaudado += totalPagado;
            descuentosAplicados += descuento;
            pacientes++;

            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + totalPagado);
            System.out.println("=========================================");

            System.out.println("\nDesea registrar otro paciente?");
            System.out.println("1)Si");
            System.out.println("2)No");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Registrando siguiente paciente");
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

        if (pacientes > 0) {
            promedio = dineroRecaudado / pacientes;
        } else {
            promedio = 0;
        }

        System.out.println("\n===== REPORTE DEL DIA =====");
        System.out.println("Total de pacientes: " + pacientes);
        System.out.println("Niños: " + ninos);
        System.out.println("Adolescentes: " + adolescentes);
        System.out.println("Adultos: " + adultos);
        System.out.println("Adultos mayores: " + adultosMayores);
        System.out.println("Dinero recaudado: $" + dineroRecaudado);
        System.out.println("Descuentos aplicados: $" + descuentosAplicados);
        System.out.println("Promedio pagado por paciente: $" + promedio);
        entrada.close();
    }
}