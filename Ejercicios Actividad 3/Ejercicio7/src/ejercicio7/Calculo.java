
package ejercicio7;


public class Calculo {
    double a, b; 
    String resultado;
    
    public Calculo(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public void calcular(){
        if (a > b) {
          resultado = "A es mayor que B";
        } 
        else if (a == b) {
            resultado = "A es igual a B";
        }
        else{
            resultado = "A es menor que B";
        }
    }
    
}
