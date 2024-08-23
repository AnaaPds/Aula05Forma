package Entidade;

public class Triangulo extends Forma {
    public Triangulo(double base, double altura) {
        super(base, base, altura);
    }

    public double calcularArea(double base, double altura) {
        return base * altura;
    }
}
