/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author mcami
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Edad de Juan: ");
        int edadmama, edadalbert, edadana, edadjuan = entrada.nextInt();
        edadalbert = 2*(edadjuan/3);
        edadana = 4 * (edadjuan/3);
        edadmama = edadjuan+edadalbert+edadana;
        System.out.println("Juan tiene " + edadjuan + " años");
        System.out.println("Alberto tiene " + edadalbert + " años");
        System.out.println("Ana tiene " + edadana + " años");
        System.out.println("Mama tiene " + edadmama + " años");
    }
}
