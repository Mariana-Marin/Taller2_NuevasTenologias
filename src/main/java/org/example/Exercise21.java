package org.example;

// importacion de librerias
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {

        // se llaman las librerias
        DecimalFormat df = new DecimalFormat("#.##"); // Da formato a los resultados con decimales
        Scanner sc = new Scanner(System.in); //se crea una entrada de Scanner

        // titulo del codigo
        System.out.println("\uD83C\uDF38ꗥ～ꗥ\uD83C\uDF38 Cálculo de Préstamo Bancario \uD83C\uDF38ꗥ～ꗥ\uD83C\uDF38");

        // Entrada de datos
        System.out.print("Ingrese el valor del salario mensual: ");
        int salarioMensual = sc.nextInt();

        System.out.print("Ingrese los ingresos adicionales: ");
        int ingresosAdicionales = sc.nextInt();

        System.out.print("Ingrese los gastos mensuales: ");
        int gastos = sc.nextInt();

        // Salida de datos
        int dineroDisponible = salarioMensual + ingresosAdicionales - gastos;
        float montoPrestamo = dineroDisponible * 50;

        // Resultados
        System.out.println("\nSu dinero disponible es: $" + dineroDisponible);
        System.out.println("El valor máximo del préstamo es: $" + montoPrestamo);

        sc.close();
    }
}
