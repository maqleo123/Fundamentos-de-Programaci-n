import java.text.DecimalFormat;
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int bandera = 0;

        do {
            int npar = 0, ntres = 0;
            double nprimo = 0, nprimos = 0;

            System.out.print("Ingrese un numero positivo: ");
            int numero = sc.nextInt();

            while (numero <= 0) {
                System.out.println("El numero debe ser entero positivo y mayor que 0, intenta de nuevo");
                numero = sc.nextInt();
            }

            System.out.println("Los numeros primos hasta " + numero + " son: ");

            for (int i = 1; i <= numero; i++) {

                if (i % 2 == 0) {
                    npar += i;
                }

                if (i % 3 == 0) {
                    ntres++;
                }

                boolean esPrimo = true;

                if (i < 2) {
                    esPrimo = false;
                } else {
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                }

                if (esPrimo) {
                    System.out.print(i + ", ");
                    nprimo++;
                    nprimos += i;
                }
            }

            System.out.println("\nLa suma de los numeros pares es: " + npar);
            System.out.println("La cantidad de numeros divisibles por 3 es: " + ntres);
            System.out.println("La cantidad de numeros primos es: " + nprimo);

            if (nprimo > 0) {
                System.out.println("el promedio de los numeros primos es: "
                        + df.format(nprimos / nprimo));
            } else {
                System.out.println("no hay numeros primos.");
            }

            System.out.println("Desea realizar otra operacion: \n1)si \n2)no");
            bandera = sc.nextInt();
        } while (bandera == 1);

        sc.close();
    }
}