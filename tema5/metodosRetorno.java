package tema5;

import java.util.Scanner;

public class metodosRetorno {

    static Scanner sc = new Scanner(System.in);

    public static double AreaCuadrado() {
        System.out.println("Ingresa la medida de un lado:");
        double l = sc.nextDouble();
        return l * l;
    }

    public static double AreaTriangulo() {
        System.out.println("Ingresa la base:");
        double b = sc.nextDouble();
        System.out.println("Ingresa la altura:");
        double h = sc.nextDouble();
        return (b * h) / 2;
    }

    public static double AreaCirculo() {
        System.out.println("Ingresa el radio:");
        double r = sc.nextDouble();
        return Math.PI * r * r;
    }

    public static double AreaRectangulo() {
        System.out.println("Ingresa la base:");
        double b = sc.nextDouble();
        System.out.println("Ingresa la altura:");
        double h = sc.nextDouble();
        return b * h;
    }

    public static void main(String[] args) {
        int opc = 0;

        do {
            System.out.println("Ingresa una opcion:\n1. Cuadrado\n2. Triangulo\n3. Circulo\n4. Rectangulo\n5. Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Area del cuadrado: " + AreaCuadrado());
                    break;

                case 2:
                    System.out.println("Area del triangulo: " + AreaTriangulo());
                    break;

                case 3:
                    System.out.println("Area del circulo: " + AreaCirculo());
                    break;

                case 4:
                    System.out.println("Area del rectangulo: " + AreaRectangulo());
                    break;

                case 5:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opc != 5);

        sc.close();
    }
}