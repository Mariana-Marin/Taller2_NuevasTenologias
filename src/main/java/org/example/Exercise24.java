package org.example;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Exercise24 {
    public static void main(String[] args) {

        /* Elabore un algoritmo que le muestre al usuario el total de dinero que tiene
        sabiendo que el algoritmo le pide que digite: el número de billetes de $1000,
        de $2000, de $5000, de $10.000, de 20.000 y de 50.000 que posee. */

        // Título
        System.out.println("=======================================");
        System.out.println("         💵 Contador de Dinero 💵       ");
        System.out.println("=======================================\n");

        Scanner scanner = new Scanner(System.in);
        NumberFormat formatoPesos = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));

        // Entradas
        System.out.print("Ingrese la cantidad de billetes de $1.000: ");
        int b1000 = scanner.nextInt();

        System.out.print("Ingrese la cantidad de billetes de $2.000: ");
        int b2000 = scanner.nextInt();

        System.out.print("Ingrese la cantidad de billetes de $5.000: ");
        int b5000 = scanner.nextInt();

        System.out.print("Ingrese la cantidad de billetes de $10.000: ");
        int b10000 = scanner.nextInt();

        System.out.print("Ingrese la cantidad de billetes de $20.000: ");
        int b20000 = scanner.nextInt();

        System.out.print("Ingrese la cantidad de billetes de $50.000: ");
        int b50000 = scanner.nextInt();

        // Validación básica
        if (b1000 < 0 || b2000 < 0 || b5000 < 0 || b10000 < 0 || b20000 < 0 || b50000 < 0) {
            System.out.println("\n⚠️  Error: No se permiten cantidades negativas.");
            scanner.close();
            return;
        }

        // Cálculo del total
        int totalPesos = b1000 * 1000 +
                b2000 * 2000 +
                b5000 * 5000 +
                b10000 * 10000 +
                b20000 * 20000 +
                b50000 * 50000;

        // Resultado
        System.out.println("\n------------ 🧾 Resumen 🧾 ------------");
        System.out.println("Total de dinero contado: " + formatoPesos.format(totalPesos));
        System.out.println("---------------------------------------");
    }
}
