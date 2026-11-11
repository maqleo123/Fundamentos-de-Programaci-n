package tema5;

import java.util.Scanner;

public class MetodosParametros {

    public static void suma(double a, double b) {
        System.out.println("Suma = " + (a + b));
    }

    public static void resta(double a, double b) {
        System.out.println("Resta = " + (a - b));
    }

    public static void multiplicacion(double a, double b) {
        System.out.println("Multiplicacion = " + (a * b));
    }

    public static void division(double a, double b) {
        System.out.println("Division = " + (a / b));
    }

    public static void main(String[] args) {
        int bandera = 2;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingresa una opcion:\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division");
            int opc = sc.nextInt();
            Double a, b;
            System.out.println("\nIngresa el valor para A");
            a = sc.nextDouble();
            System.out.println("\nIngresa el valor para B");
            b = sc.nextDouble();
            switch (opc) {
                case 1:
                    suma(a, b);
                    break;
                case 2:
                    resta(a, b);
                    break;
                case 3:
                    multiplicacion(a, b);
                    break;
                case 4:
                    division(a, b);
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("\ndesea continuar con otra operacion? \n1. Si \n2. No");
            bandera = sc.nextInt();

        } while (bandera != 2);
        sc.close();

    }
}
