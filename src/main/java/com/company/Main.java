package main.java.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, y, mcd;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Máximo comun divisor entre dos números");
        System.out.println("Valor de X: ");
        x = scanner.nextInt();
        System.out.println("Valor de Y");
        y = scanner.nextInt();

        //Encontramos el menor de los números
        if (x < y) {
            mcd = x;
        } else {
            mcd = y;
        }

        //Probamos con todos los numeros desde el menor entre X y Y hasta 0
        while (mcd > 0) {
            System.out.println("Probamos con " + mcd);
            if (x%mcd == 0 && y%mcd==0) {
                System.out.println("Encontrado!");
                break;
            } else {
                System.out.println("No es, seguimos buscando");
            }

            mcd--;
        }

        System.out.println("El Máximo Común Divisor entre " + x + " y " + y + " es: " + mcd);
    }
}
