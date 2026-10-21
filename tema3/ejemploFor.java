import java.util.Scanner;

public class ejemploFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("cuantas interaciones quieres hacer?");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println("Número: " + i);
        }
        sc.close();
    }
}
