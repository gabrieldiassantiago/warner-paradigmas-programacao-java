public class ContaBancaria {
    private int numero;
    private String titular;
    protected double saldo;

    public ContaBancaria(int numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito inválido. Valor deve ser > 0.");
            return;
        }
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque inválido. Valor deve ser > 0.");
            return false;
        }
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente.");
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta " + numero +
                " | Titular: " + titular +
                " | Saldo: " + String.format("%.2f", saldo);
    }
}
