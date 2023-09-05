
package com.mycompany.ejercicio21;

import java.util.Scanner;


public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float lado1, lado2, lado3;
        double perimetro, semiperimetro, area;
        System.out.println("Ingrese el primer lado del triangulo");
        lado1= entrada.nextFloat();
        System.out.println("Ingrese el segundo lado del triangulo");
        lado2= entrada.nextFloat();
        System.out.println("Ingrese el tercer lado del triangulo");
        lado3= entrada.nextFloat();
        
        perimetro =(lado1 + lado2 + lado3);
        semiperimetro = perimetro/2;
        
        area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * 
                (semiperimetro - lado3));
        System.out.println("El perimetro del triangulo es: " + perimetro);
        System.out.println("El semiperimetro del triagnulos es: " + semiperimetro);
        System.out.println("El area del triangulo es: " + (float)area);
    }
}
