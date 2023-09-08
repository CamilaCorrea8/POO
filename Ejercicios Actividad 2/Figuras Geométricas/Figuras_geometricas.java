
package figuras_geometricas;


public class Figuras_geometricas {

    public static void main(String[] args) {
        circulo figura1 = new circulo(2);
        rectangulo figura2 = new rectangulo(1,2);
        cuadrado figura3 = new cuadrado(3);
        triangulo_rectangulo figura4 = new triangulo_rectangulo(3,5);
        System.out.println("El área del círculo es = " + figura1.
        calcularArea());
        System.out.println("El perímetro del círculo es = "+ figura1.
        calcularPerímetro());
        System.out.println();
        System.out.println("El área del rectangulo es = " + figura2.
        calcularArea());
        System.out.println("El perímetro del rectangulo es = " + figura2.
        calcularPerímetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.
        calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.
        calcularPerímetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.
        calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.
        calcularPerímetro());
        figura4.determinarTipoTriángulo();
    }
    
}
