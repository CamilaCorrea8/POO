/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio17;

import java.util.Scanner;

/**
 *
 * @author mcami
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        double radio, longitud, area;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        radio = entrada.nextInt();
        area = Math.PI * Math.pow(radio, 2);
        longitud = 2 * Math.PI * radio;
        System.out.println("Área del círculo: " + (int)area );
        System.out.println("Longitud de la circunferencia: " + (int)longitud);
    }
}
