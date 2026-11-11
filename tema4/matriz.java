package tema4;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] numeros = new int[2][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Ingresa el valor de la fila " + i + " y columna " + j);
                numeros[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
