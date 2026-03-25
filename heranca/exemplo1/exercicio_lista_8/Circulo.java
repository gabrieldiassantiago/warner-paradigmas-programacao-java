public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        area = Math.PI * raio * raio;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = 2 * Math.PI * raio;
        return perimetro;
    }
}
