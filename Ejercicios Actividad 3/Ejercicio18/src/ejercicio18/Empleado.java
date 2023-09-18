package ejercicio18;

public class Empleado {
    int codigo;
    String nombre;
    double horasTrabajadas;
    double valorHora;
    double retencion;
    double salarioB;
    double salarioN;
    
    public void salarioBruto (){
        salarioB = horasTrabajadas * valorHora;
    } 
    
    public void salarioNeto (){
        salarioN = salarioB * (1 - retencion / 100);
    }
    
}