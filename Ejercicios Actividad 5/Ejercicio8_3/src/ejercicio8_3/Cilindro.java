
package ejercicio8_3;


public class Cilindro {
    double radio;
    double altura;
    
    public Cilindro (double radio, double altura){
        this.radio = radio;
        this.altura = altura;
    }
        
        public double calcularVolumen() {
            double volumen = Math.PI * altura * Math.pow(radio, 2.0);
            return Math.round(volumen*100.0) / 100.0;
    }
        
        public double calcularSuperficie() {
            double áreaLadoA = 2.0 * Math.PI * radio * altura;
            double áreaLadoB = 2.0 * Math.PI * Math.pow(radio, 2.0);
            return Math.round((áreaLadoA + áreaLadoB) * 100.0) / 100.0;
        }
}
