
package practica4;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final int RONDAS = 5;
        final double DISTANCIA_BAJA = 2.0;
        final double DISTANCIA_ALTA = 4.0;

        int participantes;
        int opcion, repetir;

        double distancia;
        double distanciaTotal;
        double promedio;
        double mayorDistancia;
        double distanciaParticipante;

        int contadorBajo;
        int contadorMedio;
        int contadorAlto;

        int mejorParticipante;

        do {
            System.out.print("Ingresa la cantidad de participantes: ");
            participantes = entrada.nextInt();

            while (participantes <= 0) {

                System.out.println("Error: la cantidad debe ser positiva.");
                System.out.print("Ingresa nuevamente la cantidad: ");
                participantes = entrada.nextInt();
            }

            mayorDistancia = 0;
            mejorParticipante = 0;

            contadorBajo = 0;
            contadorMedio = 0;
            contadorAlto = 0;

            distanciaTotal = 0;

            for (int i = 1; i <= participantes; i++) {

                System.out.println("\n===== PARTICIPANTE " + i + " =====");

                distanciaParticipante = 0;

                for (int j = 1; j <= RONDAS; j++) {

                    System.out.print("Ingresa la distancia de la ronda " + j + " (km): ");
                    distancia = entrada.nextDouble();

                    while (distancia < 0) {

                        System.out.println("Error: la distancia no puede ser negativa.");
                        System.out.print("Ingresa nuevamente la distancia: ");
                        distancia = entrada.nextDouble();
                    }

                    distanciaParticipante += distancia;

                    if (distancia < DISTANCIA_BAJA) {

                        System.out.println("Rendimiento: Bajo");
                        contadorBajo++;

                    } else if (distancia <= DISTANCIA_ALTA) {

                        System.out.println("Rendimiento: Medio");
                        contadorMedio++;

                    } else {

                        System.out.println("Rendimiento: Alto");
                        contadorAlto++;
                    }
                }

                promedio = distanciaParticipante / RONDAS;

                System.out.println("\nDistancia total del participante " + i +
                        ": " + String.format("%.2f", distanciaParticipante) + " km");

                System.out.println("Promedio por ronda: " +
                        String.format("%.2f", promedio) + " km");

                distanciaTotal += distanciaParticipante;

                if (distanciaParticipante > mayorDistancia) {

                    mayorDistancia = distanciaParticipante;
                    mejorParticipante = i;

                } else {
                }
            }

            promedio = distanciaTotal / participantes;

            System.out.println("\n===== MENU DE ESTADISTICAS =====");
            System.out.println("1. Mostrar distancia total y promedio general");
            System.out.println("2. Mostrar cantidad de rondas por rendimiento");
            System.out.println("3. Mostrar participante con mayor distancia");
            System.out.print("Selecciona una opcion: ");

            opcion = entrada.nextInt();

            while (opcion < 1 || opcion > 3) {

                System.out.println("Opcion no valida. Intenta nuevamente.");

                System.out.println("\n===== MENU DE ESTADISTICAS =====");
                System.out.println("1. Mostrar distancia total y promedio general");
                System.out.println("2. Mostrar cantidad de rondas por rendimiento");
                System.out.println("3. Mostrar participante con mayor distancia");
                System.out.print("Selecciona una opcion: ");

                opcion = entrada.nextInt();
            }

            switch (opcion) {

                case 1:

                    System.out.println("\n===== DISTANCIA GENERAL =====");

                    System.out.println("Distancia total: " +
                            String.format("%.2f", distanciaTotal) + " km");

                    System.out.println("Promedio general por participante: " +
                            String.format("%.2f", promedio) + " km");

                    break;

                case 2:

                    System.out.println("\n===== RENDIMIENTO GENERAL =====");

                    System.out.println("Rondas con rendimiento bajo: " + contadorBajo);
                    System.out.println("Rondas con rendimiento medio: " + contadorMedio);
                    System.out.println("Rondas con rendimiento alto: " + contadorAlto);

                    break;

                case 3:

                    System.out.println("\n===== MEJOR PARTICIPANTE =====");

                    System.out.println("Participante con mayor distancia: " +
                            mejorParticipante);

                    System.out.println("Distancia acumulada: " +
                            String.format("%.2f", mayorDistancia) + " km");

                    break;
            }

            System.out.print("\nDeseas registrar otra competencia? \n1) si \n2) no \nelige una opcion: ");

            repetir = entrada.nextInt();

        } while (repetir == 1);

        System.out.println("\nPrograma finalizado.");

        entrada.close();
    }
}
