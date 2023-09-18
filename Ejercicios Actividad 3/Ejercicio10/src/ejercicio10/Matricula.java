
package ejercicio10;


public class Matricula {
    double patrimonio, estrato, valor = 50000;
    
    public Matricula(double patrimonio, double estrato){
        this.patrimonio = patrimonio;
        this.estrato = estrato;
    }
    
    public void calMatricula(){
        if (patrimonio > 2000000 && estrato > 3){
            valor = valor + patrimonio * 0.03;       
        }
    }
    
}
