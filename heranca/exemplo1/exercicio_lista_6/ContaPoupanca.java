public class ContaPoupanca extends ContaBancaria {
    private double rendimento;

    public ContaPoupanca(int numero, String titular, double saldoInicial, double rendimento) {
        super(numero, titular, saldoInicial);
        this.rendimento = rendimento;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito inválido. Valor deve ser > 0.");
            return;
        }

        double bonus = valor * rendimento;
        this.saldo += (valor + bonus);
    }

    @Override
    public boolean sacar(double valor) {
        return super.sacar(valor);
    }

    public double getRendimento() {
        return rendimento;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Tipo: Poupança" +
                " | Rendimento: " + (rendimento * 100) + "%";
    }
}
