package com.mycompany.ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el código del empleado: ");
        int codigo = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.print("Ingrese los nombres del empleado: ");
        String nombres = entrada.nextLine();
        
        System.out.print("Ingrese el número de horas trabajadas al mes: ");
        double horasTrabajadas = entrada.nextDouble();
        
        System.out.print("Ingrese el valor de la hora trabajada: ");
        double valorHora = entrada.nextDouble();
        
        System.out.print("Ingrese el porcentaje de retención en la fuente: ");
        double retencion = entrada.nextDouble();
        
        double salarioB = horasTrabajadas * valorHora;
        double salarioN = salarioB * (1 - retencion / 100);
        
        System.out.println("Código del empleado: " + codigo);
        System.out.println("Nombres del empleado: " + nombres);
        System.out.println("Salario bruto: $" + salarioB);
        System.out.println("Salario neto: $" + salarioN);
    }
}
