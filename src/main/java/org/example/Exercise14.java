package org.example;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Exercise14 {
    public static void main(String[] args) {

        /* En un lavadero de vehículos se relacionan al final del día la cantidad de taxis que se lavaron,
        la cantidad de buses, la cantidad de particulares y la cantidad de motos. Se desea un programa
        que muestre el dinero obtenido por lavar cada tipo de vehículo (taxis, buses, particulares y motos)
        y el total realizado en el lavadero. El precio de lavar un taxi es de $30.000, el de un bus
        es $100.000, por los particulares $50.000 y por las motos $20.000.  */


        // Título
        System.out.println("🚗✨ Lavadero de Vehículos ✨🏍️");

        // Scanner para entrada de datos
        Scanner sc = new Scanner(System.in);

        // Formato para mostrar los resultados (español de Colombia)
        NumberFormat formatoPesos = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));

        // Precios por tipo de vehículo (como constantes)
        final double PRECIO_TAXI = 30_000;
        final double PRECIO_BUS = 100_000;
        final double PRECIO_PARTICULAR = 50_000;
        final double PRECIO_MOTO = 20_000;

        // Entradas
        System.out.print("Cantidad de taxis lavados: ");
        int cantidadTaxis = sc.nextInt();

        System.out.print("Cantidad de buses lavados: ");
        int cantidadBuses = sc.nextInt();

        System.out.print("Cantidad de particulares lavados: ");
        int cantidadParticulares = sc.nextInt();

        System.out.print("Cantidad de motos lavadas: ");
        int cantidadMotos = sc.nextInt();

        // Cálculo de ingresos
        double totalTaxis = cantidadTaxis * PRECIO_TAXI;
        double totalBuses = cantidadBuses * PRECIO_BUS;
        double totalParticulares = cantidadParticulares * PRECIO_PARTICULAR;
        double totalMotos = cantidadMotos * PRECIO_MOTO;
        double totalLavadero = totalTaxis + totalBuses + totalParticulares + totalMotos;

        // Resultados formateados
        System.out.println("\n--- Detalle de Ingresos ---");
        System.out.println("Total por lavado de taxis: " + formatoPesos.format(totalTaxis));
        System.out.println("Total por lavado de buses: " + formatoPesos.format(totalBuses));
        System.out.println("Total por lavado de particulares: " + formatoPesos.format(totalParticulares));
        System.out.println("Total por lavado de motos: " + formatoPesos.format(totalMotos));
        System.out.println("\n🔹 Total general del día: " + formatoPesos.format(totalLavadero));

        sc.close();
    }
}
