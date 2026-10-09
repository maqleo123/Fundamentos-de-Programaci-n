import java.util.Scanner;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu \n1. Suma \n2. Resta \n3. Multiplicacion \n4. Division");
        System.out.print("Ingrese la opcion deseada: ");
        int opcion = sc.nextInt();
        System.out.println("ingresa el valor para A: ");
        double a = sc.nextDouble();
        System.out.println("ingresa el valor para B: ");
        double b = sc.nextDouble();

        switch (opcion) {
            case 1:

                double suma = a + b;
                System.out.println("El resultado de la suma es: " + suma);
                break;
            case 2:

                double resta = a - b;
                System.out.println("El resultado de la resta es: " + resta);
                break;
            case 3:

                double multiplicacion = a * b;
                System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Error: Division por cero no esta permitida");
                } else {
                    double division = a / b;
                    System.out.println("El resultado de la division es: " + division);
                }
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}
