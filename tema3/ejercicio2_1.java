import java.util.Scanner;

public class ejercicio2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MOD = 2;
        int bandera = 2;

        do {
            int n, npar = 0, ninpar = 0, spar = 0, sinpar = 0;
            System.out.println("Ingrese un numero positivo: ");
            n = sc.nextInt();
            while (n <= 0) {
                System.out.println("El numero debe ser entero positivo y mayor que 0, intenta de nuevo");
                n = sc.nextInt();
            }

            for (int i = 1; i <= n; i++) {
                if (i % MOD == 0) {
                    npar++;
                    spar += i;
                } else {
                    ninpar++;
                    sinpar += i;
                }
            }

            System.out.println("\n\nLa cantidad de numeros pares es: " + npar);
            System.out.println("La suma de los numeros pares es: " + spar);
            System.out.println("La cantidad de numeros impares es: " + ninpar);
            System.out.println("La suma de los numeros impares es: " + sinpar);
            System.out.println("\n\nDesea realizar otra operacion: \n1)si \n2)no");
            bandera = sc.nextInt();

        } while (bandera == 1);
        sc.close();
    }

}
