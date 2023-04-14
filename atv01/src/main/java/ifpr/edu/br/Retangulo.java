package ifpr.edu.br;

public class Retangulo {
    
    int lado1, lado2;

    public Retangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    int calcularArea() {
        if(verificaEntradaValida()) {
            return lado1 * lado2;
        } else {
            return -1;    
        }
    }

    int calcularPerimetro() {
        if(verificaEntradaValida()) {
            return 2 * (lado1 + lado2);
        } else {
            return -1;
        }
    }

    boolean verificaEntradaValida() {
        if(lado1 >= 1 && lado2 >= 1) {
            return true;
        } else {
            return false;
        }
    }
}
