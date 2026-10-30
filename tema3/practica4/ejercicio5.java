
package practica4;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Variables
        int opcion;
        int numero;
        int suma;

        do {

            System.out.println("\n===== MENU DE OPERACIONES =====");
            System.out.println("1. Calcular el cuadrado de un numero");
            System.out.println("2. Calcular el cubo de un numero");
            System.out.println("3. Determinar si un numero es par o impar");
            System.out.println("4. Calcular la suma desde 1 hasta un numero");
            System.out.println("5. Salir del programa");
            System.out.print("Selecciona una opcion: ");

            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("Ingresa un numero: ");
                    numero = entrada.nextInt();

                    if (numero > 0) {

                        System.out.println("El cuadrado de " + numero +
                                " es: " + (numero * numero));

                    } else {

                        System.out.println("Error: el numero debe ser positivo.");
                    }

                    break;

                case 2:

                    System.out.print("Ingresa un numero: ");
                    numero = entrada.nextInt();

                    if (numero > 0) {

                        System.out.println("El cubo de " + numero +
                                " es: " + (numero * numero * numero));

                    } else {

                        System.out.println("Error: el numero debe ser positivo.");
                    }

                    break;

                case 3:

                    System.out.print("Ingresa un numero entero: ");
                    numero = entrada.nextInt();

                    if (numero >= 0) {

                        if (numero % 2 == 0) {

                            System.out.println("El numero " + numero + " es par.");

                        } else {

                            System.out.println("El numero " + numero + " es impar.");
                        }

                    } else {

                        System.out.println("Error: el numero debe ser positivo.");
                    }

                    break;

                case 4:

                    System.out.print("Ingresa un numero entero positivo: ");
                    numero = entrada.nextInt();

                    if (numero > 0) {

                        suma = 0;

                        for (int i = 1; i <= numero; i++) {

                            suma += i;
                        }

                        System.out.println("La suma de los numeros desde 1 hasta " +
                                numero + " es: " + suma);

                    } else {

                        System.out.println("Error: el numero debe ser positivo.");
                    }

                    break;

                case 5:

                    System.out.println("\nGracias por utilizar el programa.");
                    System.out.println("Hasta pronto.");

                    break;

                default:

                    System.out.println("Error: opcion no valida. Intenta nuevamente.");

                    break;
            }

        } while (opcion != 5);

        entrada.close();
    }
}
