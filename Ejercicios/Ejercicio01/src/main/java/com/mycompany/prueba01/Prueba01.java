package com.mycompany.prueba01;

import javax.swing.JOptionPane;

public class Prueba01 {

    public static void main(String[] args) {
        System.out.println("Cual es la edad de Juan?");
        int edadmama, edadalbert, edadana, edadjuan;
        edadjuan = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad de Juan"));
        edadalbert = 2*(edadjuan/3);
        edadana = 4 * (edadjuan/3);
        edadmama = edadjuan+edadalbert+edadana;
        JOptionPane.showMessageDialog(null, "Juan tiene " + edadjuan + " Años");
        JOptionPane.showMessageDialog(null, "Alberto tiene " + edadalbert + " Años");
        JOptionPane.showMessageDialog(null, "Ana tiene " + edadana + " Años");
        JOptionPane.showMessageDialog(null, "La madre de ellos tiene " + edadmama + " Años");
    }
}