public class Calcular {
    private double base;
    private double altura;

    public Calcular(double base, double altura) {
        this.base = base;
        this.altura = altura;

    }

    public double calcularArea() {
        return (base * altura) / 2;
    }
}
