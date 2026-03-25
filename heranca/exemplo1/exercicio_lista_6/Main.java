public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1, "Gabriel", 100.0, 200.0);
        ContaPoupanca cp = new ContaPoupanca(2, "Ana", 100.0, 0.01);

        System.out.println("=== Inicial ===");
        System.out.println(cc);
        System.out.println(cp);

        System.out.println("\n=== Depósitos ===");
        cc.depositar(50);
        cp.depositar(50);

        System.out.println(cc);
        System.out.println(cp);

        System.out.println("\n=== Saques ===");
        System.out.println("CC sacar 250 (usa limite): " + cc.sacar(250));
        System.out.println("CP sacar 250 (não pode): " + cp.sacar(250));

        System.out.println("\n=== Final ===");
        System.out.println(cc);
        System.out.println(cp);
    }
}
