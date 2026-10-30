package practica4;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        final int CUATRO = 4;
        final int TRES = 3;
        final int CINCO = 5;

        int N;
        int opcion, repetir;
        do {
            System.out.print("ingresa un numero entero positivo: ");
            N = entrada.nextInt();

            while (N <= 0) {
                System.out.println("Error. El numero debe ser positivo.");
                System.out.print("Ingresa nuevamente el numero: ");
                N = entrada.nextInt();
            }

            int sumaCuatro = 0;
            int contadorTres = 0;
            int contadorAmbos = 0;

            int pares = 0;
            int impares = 0;
            int multiplosCinco = 0;

            for (int i = 1; i <= N; i++) {

                if (i % CUATRO == 0) {
                    sumaCuatro += i;
                } else {
                }

                if (i % TRES == 0) {
                    contadorTres++;
                } else {
                }

                if (i % CUATRO == 0 &&
                        i % TRES == 0) {
                    contadorAmbos++;
                }

                if (i % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
                if (i % CINCO == 0) {
                    multiplosCinco++;
                }
            }

            System.out.println("\n===== RESULTADOS DEL ANALISIS =====");
            System.out.println("numero analizado: " + N);
            System.out.println("suma de divisibles entre 4: " + sumaCuatro);
            System.out.println("cantidad de multiplos de 3: " + contadorTres);
            System.out.println("cantidad divisibles entre 3 y 4: " + contadorAmbos);

            System.out.println("\n===== MENU DE ESTADISTICAS =====");
            System.out.println("1. numeros pares");
            System.out.println("2. numeros impares");
            System.out.println("3. nultiplos de 5");
            System.out.print("elige una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Cantidad de numeros pares: " + pares);
                    break;

                case 2:
                    System.out.println("Cantidad de numeros impares: " + impares);
                    break;

                case 3:
                    System.out.println("Cantidad de multiplos de 5: " + multiplosCinco);
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

            System.out.print("\nDeseas realizar otro analisis? \n1)si \n2)no \nelige una opcion: ");
            repetir = entrada.nextInt();

        } while (repetir == 1);

        entrada.close();
    }
}
