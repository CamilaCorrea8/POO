
package ejercicio8_3;


public class Piramide {
    double base;
    double altura;
    double apotema;
    
    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
    }
    
    public double calcularVolumen() {
        double volumen = (Math.pow(base, 2.0) * altura) / 3.0;
        return Math.round(volumen * 100.0) / 100.0;
    }
    
    public double calcularSuperficie() {
        double areaBase = Math.pow(base, 2.0);
        double areaLado = 2.0 * base * apotema;
        return Math.round((areaBase + areaLado) * 100.0) / 100.0;
    }
}
