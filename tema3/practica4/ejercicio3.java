package practica4;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final int INICIAL = 1;

        int numero1, numero2;
        int suma1, suma2;
        int contador1, contador2;
        int opcion, repetir;

        do {

            System.out.print("ingresa el primer numero entero positivo: ");
            numero1 = entrada.nextInt();

            System.out.print("ingresa el segundo numero entero positivo: ");
            numero2 = entrada.nextInt();

            while (numero1 <= 0 || numero2 <= 0) {

                System.out.println("\nerror los numeros deben ser positivos.");

                System.out.print("Ingresa el primer numero: ");
                numero1 = entrada.nextInt();

                System.out.print("Ingresa el segundo numero: ");
                numero2 = entrada.nextInt();
            }

            suma1 = 0;
            suma2 = 0;
            contador1 = 0;
            contador2 = 0;

            for (int i = INICIAL; i < numero1; i++) {

                if (numero1 % i == 0) {

                    suma1 += i;
                    contador1++;

                } else {
                }
            }

            for (int i = INICIAL; i < numero2; i++) {

                if (numero2 % i == 0) {

                    suma2 += i;
                    contador2++;

                } else {
                }
            }

            System.out.println("\n===== RESULTADO DE LA COMPARACION =====");

            if (suma1 == numero2 && suma2 == numero1) {

                System.out.println(numero1 + " y " + numero2 +
                        " son numeros amigos.");

            } else {

                System.out.println(numero1 + " y " + numero2 +
                        " no son numeros amigos.");
            }

            System.out.println("\n===== MENU DE OPCIONES =====");
            System.out.println("1. Mostrar las sumas de los divisores");
            System.out.println("2. Mostrar unicamente el resultado");
            System.out.print("Selecciona una opcion: ");

            opcion = entrada.nextInt();

            while (opcion < 1 || opcion > 2) {

                System.out.println("Opcion no valida. Intenta nuevamente.");

                System.out.println("\n===== MENU DE OPCIONES =====");
                System.out.println("1. Mostrar las sumas de los divisores");
                System.out.println("2. Mostrar unicamente el resultado");
                System.out.print("Selecciona una opcion: ");

                opcion = entrada.nextInt();
            }

            switch (opcion) {

                case 1:

                    System.out.println("\n===== SUMA DE DIVISORES =====");

                    System.out.println("Numero: " + numero1);
                    System.out.println("Suma de divisores propios: " + suma1);
                    System.out.println("Cantidad de divisores: " + contador1);

                    System.out.println("\nNumero: " + numero2);
                    System.out.println("Suma de divisores propios: " + suma2);
                    System.out.println("Cantidad de divisores: " + contador2);

                    break;

                case 2:

                    System.out.println("\nComparacion realizada.");

                    if (suma1 == numero2 && suma2 == numero1) {

                        System.out.println("Resultado: Son numeros amigos.");

                    } else {

                        System.out.println("Resultado: No son numeros amigos.");
                    }

                    break;
            }

            System.out.print("\nDeseas analizar otra pareja? \n1) si \n2) no \nelige una opcion: ");

            repetir = entrada.nextInt();

        } while (repetir == 1);

        System.out.println("\nprograma finalizado.");

        entrada.close();
    }
}
