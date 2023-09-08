
package figuras_geometricas;


public class triangulo_rectangulo {
    int base; 
int altura; 

public triangulo_rectangulo(int base, int altura) {
this.base = base;
this.altura = altura;
}
//definimos los metodos
double calcularArea() {
return (base * altura / 2);
}
double calcularPerímetro() {
return (base + altura + calcularHipotenusa()); 
}
double calcularHipotenusa() {
return Math.pow(base*base + altura*altura, 0.5);
}
void determinarTipoTriángulo() {
if ((base == altura) && (base == calcularHipotenusa()) && 
        (altura== calcularHipotenusa()))
    System.out.println("Es un triángulo equilátero");
else if ((base != altura) && (base != calcularHipotenusa()) &&
        (altura != calcularHipotenusa()))
    System.out.println("Es un triángulo escaleno"); 
else
    System.out.println("Es un triángulo isósceles"); 
}
    
}
