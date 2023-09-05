package com.mycompany.ejercicio14;

import java.util.Scanner;


public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double VD1, VD2, VD3, salario;
        double salario1 ,salario2, salario3;
        
        System.out.println("¿Cuánto vendió el primer departamento?: ");
        VD1= sc.nextDouble();
        System.out.println("¿Cuánto vendió el segundo departamento?: ");
        VD2= sc.nextDouble();
        System.out.println("¿Cuánto vendió el tercer departamento?: ");
        VD3= sc.nextDouble();
        System.out.println("¿Cuánto es el salario de los vendedores?: ");
        salario = sc.nextDouble();
        Double exced =(VD1 + VD2 + VD3) * 0.33;
        if (VD1 > exced){
            salario1 = salario + salario * 0.2;
        } else{
            salario1 = salario;
        }
        if (VD2 > exced){
            salario2 = salario + salario * 0.2;
        } else{
            salario2 = salario;
        }
        if (VD3 > exced){
            salario3 = salario + salario*0.2;
        } else{
            salario3 = salario;
        }
        System.out.println("Salario de vendedores del Dpto. 1 es: $" + salario1);
        System.out.println("Salario de vendedores del Dpto. 2 es: $" + salario2);
        System.out.println("Salario de vendedores del Dpto. 3 es: $" + salario3);
    }
}
