import java.util.Scanner;

public class ParInparWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c = 1;
        System.out.println("ingrese n numero:");
        n = sc.nextInt();
        while (c <= n) {
            if (c % 2 == 0) {
                System.out.println("El numero: " + c + " es par.");
            } else {
                System.out.println("El numero: " + c + " es inpar.");
            }
            c++;
        }
    }

}
