package org.example;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Exercise25 {
    public static void main(String[] args) {
    /*
    Escriba un algoritmo que le permita al propietario de un bus ingresar el número de
    pasajeros transportados en un día, el valor del pasaje y el valor pagado por costoCombustible.
    El programa le debe mostrar el total producido por el bus, el valor pagado al conductor
    (que es el 10% del total producido) y la ganancia neta (producido menos los gastos).
    */

        // Título
        System.out.println("=======================================");
        System.out.println("     🚍 Finanzas Diarias del Bus 🚍     ");
        System.out.println("=======================================\n");

        // Scanner para entrada de datos
        Scanner sc = new Scanner(System.in);

        // Formato para mostrar los resultados (español de Colombia)
        NumberFormat formatoPesos = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));

        // Entradas
        System.out.print("Ingrese la cantidad de pasajeros transportados: ");
        int cantidadPasajeros = sc.nextInt();

        System.out.print("Ingrese el valor del pasaje (COP): $ ");
        int precioPasaje = sc.nextInt();

        System.out.print("Ingrese el valor pagado por combustible (COP): $ ");
        int costoCombustible = sc.nextInt();

        // Cálculo de ingresos
        double ingresoTotal = cantidadPasajeros * precioPasaje;
        double pagoConductor = ingresoTotal * 0.1;
        double gananciaNeta = ingresoTotal - (costoCombustible + pagoConductor);

        // Resultados
        System.out.println("\n-------- 💰 Resumen Financiero 💰 --------");
        System.out.println("Ingresos totales:       " + formatoPesos.format(ingresoTotal));
        System.out.println("Pago al conductor (10%): " + formatoPesos.format(pagoConductor));
        System.out.println("Costo de costoCombustible:   " + formatoPesos.format(costoCombustible));
        System.out.println("----------------------------------------");
        System.out.println("Ganancia neta del día:  " + formatoPesos.format(gananciaNeta));
        System.out.println("----------------------------------------");

        sc.close();

    }
}
