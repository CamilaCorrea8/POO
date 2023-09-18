
package figuras;


public class TrianguloRectangulo {
    double base; 
    double altura; 
    String resultado;

    public TrianguloRectangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
}

    double calcularArea() {
    return (base * altura / 2);
}

    double calcularPerímetro() {
    return (base + altura + calcularHipotenusa()); 
}
    double calcularHipotenusa() {
    return Math.pow(base*base + altura*altura, 0.5);
}

    void determinarTipoTriangulo() {
    if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
        resultado = "Es un triángulo equilátero"; 
    else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
        resultado = "Es un triángulo escaleno"; 
    else
        resultado = "Es un triángulo isósceles";
}
    
}
