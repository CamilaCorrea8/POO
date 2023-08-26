

package com.mycompany.prueba04;

import javax.swing.JOptionPane;

public class Prueba04 {

    public static void main(String[] args) {
        int horas, valor;
        double percentRetention;
        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas: "));
        valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de las horas: "));
        percentRetention = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje de retencion en la fuente: "));
           
        
        double salarioBruto = horas*valor*4;
        double retencion = salarioBruto - (salarioBruto * (percentRetention/100));
        double salarioNeto = salarioBruto - retencion;
        
        System.out.println("El salario Bruto es Igual a: " + (int)salarioBruto);
        System.out.println("El salario Neto es Igual a: " + (int)salarioNeto);
        System.out.println("La retencion en la fuente es Igual a: " + (int)retencion);
        
    }
}
