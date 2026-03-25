public class Retangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        area = base * altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = 2 * (base + altura);
        return perimetro;
    }
}
