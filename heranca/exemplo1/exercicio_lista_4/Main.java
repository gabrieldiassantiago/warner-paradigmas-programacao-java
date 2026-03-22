import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a opção de carro desejada: \n - Novo\n 2- Seminovo\n");
        int opcao = 0;

        while (true) {
            opcao = input.nextInt();
            if (opcao == 1) {
                Novo carro1 = new Novo(200, 100, 500);
                carro1.imprimirAdicional();
                break;
            } else if (opcao == 2) {
                SemiNovo carro2 = new SemiNovo(200, 100);
                carro2.setDesconto(100);
                carro2.impressao();
                break;
            } else {
                System.out.println("\nEntrada, invalida\n");
            }
        }
    }
}
