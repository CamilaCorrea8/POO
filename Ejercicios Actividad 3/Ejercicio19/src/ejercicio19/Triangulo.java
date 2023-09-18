
package ejercicio19;


public class Triangulo {
    double lado, altura, area, perimetro;
    
    public Triangulo(double lado) {
        this.lado = lado;
    }
   
    public void calcularAltura(){
        this.altura = (lado * Math.sqrt(3))/2;
    }
    
    public void calcularArea(){
        this.area = (Math.pow(lado, 2) * Math.sqrt(3))/4;
    }
    
    public void calcularPerimetro(){
        this.perimetro = 3 * lado;
    }
    
    
}
