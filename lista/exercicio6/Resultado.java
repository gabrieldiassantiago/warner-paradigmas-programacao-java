import java.util.Scanner;

class Resultado {
    private Scanner s;
    private int[] numeros;
    private int soma;

    public Resultado() {
        s = new Scanner(System.in);
        numeros = new int[10];
        soma = 0;
    }

    public void entrada_valores() {
        System.out.println("\nInsira 10 numeros");
        for (int i = 0; i < 10; i++) {
            numeros[i] = s.nextInt();
        }
    }

    public void calcular_pares() {
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                soma+=numeros[i];
            }
        }
    }

    public void imprimir_soma() {
        System.out.printf("A soma dos pares eh: %d", soma);
    }
}
