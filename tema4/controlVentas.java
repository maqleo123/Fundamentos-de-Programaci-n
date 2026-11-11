package tema4;

import java.util.Scanner;

public class controlVentas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] ventas = new double[3][5];
        double[] suma = new double[3];

        double tEmpresa = 0, pDia;
        int mSucursal = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("\nsucursal " + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.print("ventas del dia " + (j + 1) + ": ");
                ventas[i][j] = sc.nextDouble();
                suma[i] += ventas[i][j];
            }
            tEmpresa += suma[i];
        }

        System.out.println("\n======ventas======");
        System.out.println("sucursal\tdia 1\tdia 2\tdia 3\tdia 4\tdia 5");

        for (int i = 0; i < 3; i++) {
            System.out.print("sucursal " + (i + 1) + "\t");
            for (int j = 0; j < 5; j++) {
                System.out.print(ventas[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 1; i < 3; i++) {
            if (suma[i] > suma[mSucursal]) {
                mSucursal = i;
            }
        }

        pDia = tEmpresa / 5;

        System.out.println("\n====================================");

        for (int i = 0; i < 3; i++) {
            System.out.println("tootal sucursal " + (i + 1) + ": "
                    + suma[i]);
        }

        System.out.println("total de la empresa: " + tEmpresa);

        System.out.println("sucursal con mayores ventas: "
                + (mSucursal + 1));

        System.out.println("promedio de ventas por dia: "
                + pDia);
        System.out.println("====================================\n");

        sc.close();
    }
}