import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int AGUA = 15;
        final int JUGO = 22;
        final int GALLETAS = 18;
        final int SANDWICH = 45;
        int bandera = 0, opc;
        int pglobal = 0, Cglobal = 0, Cgalleta = 0, galleta, tgalleta, Cjugo = 0, jugo, tjugo, Csandwich = 0, sandwich,
                tsandwich, Cagua = 0, agua, tagua;
        do {
            System.out.println("====== MEnu ======");
            System.out.println("1.AGUA_____________$15");
            System.out.println("2.JUGO_____________$22");
            System.out.println("3.GALLETAS_________$18");
            System.out.println("4.SANDWICH_________$45");
            System.out.println("5.Consutar total");
            System.out.println("6. finalizar programa");
            System.out.println("====================");
            System.out.println("ingrese una opcion:");
            opc = sc.nextInt();
            while (opc < 1 && opc > 7) {
                System.out.println("opcion no valida intente de nuevo");
                opc = sc.nextInt();
            }
            switch (opc) {
                case 1:
                    System.out.println("Cuantas unidades de refresco desea comprar?");
                    agua = sc.nextInt();
                    while (agua < 0) {
                        System.out.println("cantidad no valida intente de nuevo");
                        agua = sc.nextInt();
                    }
                    System.out.println("Se agrego $" + agua * AGUA + " a su cuenta");
                    tagua = agua * AGUA;
                    if (tagua < 50) {
                        System.out.println("la compra se considera pegueña");
                    } else if (tagua > 100) {
                        System.out.println("la compra se considera grande");
                    } else {
                        System.out.println("la compra se considera mediana");
                    }
                    pglobal += tagua;
                    Cagua += agua;
                    Cglobal += agua;
                    break;
                case 2:
                    System.out.println("Cuantas unidades de jugo desea comprar?");
                    jugo = sc.nextInt();
                    while (jugo < 0) {
                        System.out.println("cantidad no valida intente de nuevo");
                        jugo = sc.nextInt();
                    }
                    System.out.println("Se agrego $" + jugo * JUGO + " a su cuenta");
                    tjugo = jugo * JUGO;
                    if (tjugo < 50) {
                        System.out.println("la compra se considera pegueña");
                    } else if (tjugo > 100) {
                        System.out.println("la compra se considera grande");
                    } else {
                        System.out.println("la compra se considera mediana");
                    }
                    pglobal += tjugo;
                    Cjugo += jugo;
                    Cglobal += jugo;
                    break;
                case 3:
                    System.out.println("Cuantas unidades de galletas desea comprar?");
                    galleta = sc.nextInt();
                    while (galleta < 0) {
                        System.out.println("cantidad no valida intente de nuevo");
                        galleta = sc.nextInt();
                    }
                    System.out.println("Se agrego $" + galleta * GALLETAS + " a su cuenta");
                    tgalleta = galleta * GALLETAS;
                    if (tgalleta < 50) {
                        System.out.println("la compra se considera pegueña");
                    } else if (tgalleta > 100) {
                        System.out.println("la compra se considera grande");
                    } else {
                        System.out.println("la compra se considera mediana");
                    }
                    pglobal += tgalleta;
                    Cgalleta += galleta;
                    Cglobal += galleta;
                    break;

                case 4:
                    System.out.println("Cuantas unidades de sandwich desea comprar?");
                    sandwich = sc.nextInt();
                    while (sandwich < 0) {
                        System.out.println("cantidad no valida intente de nuevo");
                        sandwich = sc.nextInt();
                    }
                    System.out.println("Se agrego $" + sandwich * SANDWICH + " a su cuenta");
                    tsandwich = sandwich * SANDWICH;
                    if (tsandwich < 50) {
                        System.out.println("la compra se considera pegueña");
                    } else if (tsandwich > 100) {
                        System.out.println("la compra se considera grande");
                    } else {
                        System.out.println("la compra se considera mediana");
                    }
                    pglobal += tsandwich;
                    Csandwich += sandwich;
                    Cglobal += sandwich;

                    break;
                case 5:
                    System.out.println("El total en la cuenta hasta ahora es de: $" + pglobal);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    bandera = 6;
                    break;

                default:
                    System.out.println("opcion no valida...");
                    break;
            }
        } while (bandera != 6);
        System.out.println("======= Reporte final ======");
        System.out.println(Cagua + " aguas");
        System.out.println(Cjugo + " jugos");
        System.out.println(Cgalleta + " galletas");
        System.out.println(Csandwich + " sandwich");
        System.out.println("Total de unidades vendidas: " + Cglobal);
        System.out.println("Monto Recaudado: " + pglobal);

    }
}
