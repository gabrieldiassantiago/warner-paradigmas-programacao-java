public class ContaCorrente extends ContaBancaria {
    private double limite; // limite do cheque especial

    public ContaCorrente(int numero, String titular, double saldoInicial, double limite) {
        super(numero, titular, saldoInicial);
        this.limite = limite;
    }

    @Override
    public void depositar(double valor) {
        double taxa = 0.50;
        if (valor <= taxa) {
            System.out.println("Depósito inválido: valor deve ser maior que a taxa (" + taxa + ").");
            return;
        }
        super.depositar(valor - taxa);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque inválido. Valor deve ser > 0.");
            return false;
        }

        double disponivel = this.saldo + this.limite;
        if (valor > disponivel) {
            System.out.println("Saque negado. Excede saldo + limite.");
            return false;
        }

        this.saldo -= valor;
        return true;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Tipo: Corrente" +
                " | Limite: " + String.format("%.2f", limite);
    }
}
