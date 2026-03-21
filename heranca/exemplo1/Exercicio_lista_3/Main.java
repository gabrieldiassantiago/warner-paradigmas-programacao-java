import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("       BEM-VINDO À COMPRA DE PASSAGEM     ");
        System.out.println("===========================================");
        System.out.println("Escolha o tipo de passagem:");
        System.out.println("  1 - Primeira Classe");
        System.out.println("  2 - Classe Econômica");
        System.out.println("  3 - Classe Executiva");
        System.out.print("Sua escolha: ");

        int escolha = scanner.nextInt();

        System.out.println("-------------------------------------------");

        switch (escolha) {
            case 1:
                PrimeiraClasse primeira = new PrimeiraClasse(1500.00, 800.00);
                System.out.println("Tipo: PRIMEIRA CLASSE");
                primeira.imprimeValor();
                System.out.printf("Adicional de conforto: R$ %.2f%n", primeira.getValorAdicional());
                System.out.printf("Valor TOTAL (com adicional): R$ %.2f%n", primeira.getValorTotal());
                System.out.println("Poltrona: Leito reclinável 180° — fileira 1");
                break;

            case 2:
                ClasseEconomica economica = new ClasseEconomica(450.00);
                economica.imprimeClasse();
                economica.imprimeValor();
                System.out.println("Poltrona: Assento padrão — fileiras 20 a 35");
                break;

            case 3:
                ClasseExecutiva executiva = new ClasseExecutiva(950.00, "12A");
                System.out.println("Tipo: CLASSE EXECUTIVA");
                System.out.println(executiva.getValorComPoltrona());
                break;

            default:
                System.out.println("Opção inválida! Por favor, escolha 1, 2 ou 3.");
        }

        System.out.println("===========================================");
        System.out.println("         Obrigado pela sua compra!        ");
        System.out.println("===========================================");

        scanner.close();
    }
}
