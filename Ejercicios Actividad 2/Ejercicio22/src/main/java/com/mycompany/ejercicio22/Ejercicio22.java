package com.mycompany.ejercicio22;

import java.util.Scanner;


public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese el salario básico por hora: ");
        double salarioxhora = entrada.nextDouble();
        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        int horas = entrada.nextInt();

        double salario = salarioxhora * horas;

        if (salario > 450000) {
            System.out.println("El salario mensual de " + nombre + " es de: $" + salario);
        } else {
            System.out.println(nombre);
        }
    }
}
