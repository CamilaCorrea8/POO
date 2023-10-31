
package ejercicio8_3;


public class Esfera {
    double radio;
    
    public Esfera(double radio) {
        this.radio = radio; 
    }
    
    public double calcularVolumen() {
        double volumen = 1.333 * Math.PI * Math.pow(this.radio, 3.0);
        return Math.round(volumen * 100.0) / 100.0;
    }
    
    public double calcularSuperficie() {
        double superficie = 4.0 * Math.PI * Math.pow(this.radio, 2.0);
        return Math.round(superficie * 100.0) / 100.0;
    }
}
