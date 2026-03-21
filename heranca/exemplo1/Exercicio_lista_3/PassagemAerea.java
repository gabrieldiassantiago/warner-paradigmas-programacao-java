public class PassagemAerea {
    protected double valor;

    public PassagemAerea(double valor) {
        this.valor = valor;
    }

    public void imprimeValor() {
        System.out.printf("Valor da passagem: R$ %.2f%n", valor);
    }

    public double getValor() {
        return valor;
    }
}
