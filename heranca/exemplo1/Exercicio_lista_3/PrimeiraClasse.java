public class PrimeiraClasse extends PassagemAerea {
    private double valorAdicional;

    public PrimeiraClasse(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorTotal() {
        return valor + valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }
}
