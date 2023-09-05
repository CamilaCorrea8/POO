package com.mycompany.ejercicio11;

import java.util.Scanner;


public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int uno = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int dos = sc.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int tres = sc.nextInt();
        

        if (uno > dos & uno > tres) {
            System.out.println("El mayor entre " + uno + ", " + dos +" y "+ tres +" es " + uno);
        } else if (dos > tres) {
            System.out.println("El mayor entre " + uno + ", " + dos +" y "+ tres +" es " + dos);
        } else {
            System.out.println("El mayor entre " + uno + ", " + dos +" y "+ tres +" es " + tres);
        }
    }
}
