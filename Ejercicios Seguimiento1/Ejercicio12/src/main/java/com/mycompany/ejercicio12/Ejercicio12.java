/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12;

import javax.swing.JOptionPane;

/**
 *
 * @author mcami
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        double salarioBruto, retencion, salarioNeto;
        
        salarioBruto = 48 * 5000;
        retencion = (salarioBruto * 12.5)/100 ;
        salarioNeto = salarioBruto - retencion;
        
        System.out.println("El salario bruto es igual a: " + (int)salarioBruto);
        System.out.println("El salario neto es igual a: " + (int)salarioNeto);
        System.out.println("La retencion en la fuente es igual a: " + (int)retencion);
    }
}
