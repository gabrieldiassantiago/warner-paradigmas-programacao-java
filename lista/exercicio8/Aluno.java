import java.util.Scanner;

class Aluno {
    private double notas[];
    private Scanner scanner;
    private double media;
    private double soma;

    public Aluno() {
        notas = new double[2];
        scanner = new Scanner(System.in);
        media = 0;
        soma = 0;
    }

    public void ler_notas() {
        for (int i = 0; i < 2; i++) {
            notas[i] = scanner.nextDouble();
        }
    }

    public void calcular() {
       media = (notas[0] * 2 + notas[1] * 3) / 5;
    }

    public void imprimir() {
        if (media >= 5) {
            System.out.println("Você está aprovado");
        } else {
            System.out.println("Você está reprovado");
        }
    }
}
