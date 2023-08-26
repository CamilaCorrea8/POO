

package com.mycompany.prueba02;

import java.util.Scanner;

public class Prueba02 {

    public static void main(String[] args) {
        double num1, cuad, cubo;
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num1 = num.nextInt();
        cuad = Math.pow(num1, 2);
        cubo = Math.pow(num1, 3);
        System.out.println("El cuadrado de " + (int)num1 + " es " + (int)cuad);
        System.out.println("El cubo de " + (int)num1 + " es " + (int)cubo);
    }
}
