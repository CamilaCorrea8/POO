
package ejercicio23;


public class Calculo {
    double a, b, c;
    String resultado;
    
    public Calculo (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void calcular(){
        double operacion = b * b - 4 * a * c;
        
        if (operacion > 0) {
            double x1 = (-b + Math.sqrt(operacion)) / (2 * a);
            double x2 = (-b - Math.sqrt(operacion)) / (2 * a);
            resultado = "Las soluciones son \n x1 = "  + x1 + "   y   x2 = " + x2;
        } else if (operacion == 0) {
            double x = -b / (2 * a);
            resultado = "La solución es x = " + x;
        } else {
            resultado = "No hay soluciones reales.";
        }
    }
}
