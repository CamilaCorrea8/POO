
package com.mycompany.prueba03;

import java.util.Scanner;

public class Prueba03 {

    public static void main(String[] args) {
        double radio, longitud, area;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        radio = entrada.nextInt();
        area = Math.PI * Math.pow(radio, 2);
        longitud = 2 * Math.PI * radio;
        System.out.println("Area: " + (int)area );
        System.out.println("Longitud: " + (int)longitud);
    }
}
