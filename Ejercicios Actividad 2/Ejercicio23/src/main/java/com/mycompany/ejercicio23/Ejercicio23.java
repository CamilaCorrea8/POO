package com.mycompany.ejercicio23;

import java.util.Scanner;


public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor de A: ");
        double A = entrada.nextDouble();
        System.out.print("Valor de B: ");
        double B = entrada.nextDouble();
        System.out.print("Valor de C: ");
        double C = entrada.nextDouble();

        double ecu = B * B - 4 * A * C;

        // Es por si tiene solucion en los reales
        if (ecu < 0) {
            System.out.println("La ecuación no tiene solución real");
        } else {
            double resul1 = (-B + Math.sqrt(ecu)) / (2 * A);
            double resul2 = (-B - Math.sqrt(ecu)) / (2 * A);
            
            // Mostrar las soluciones
            System.out.println("Las soluciones de la ecuación son: x1 = " + resul1 + " y x2 = " + resul2);
        }
    }
}
