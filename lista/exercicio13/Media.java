import java.util.Scanner;

class Media {
    private int numero;
    private double media_impares;
    private double media_pares;
    private double soma_impares;
    private double soma_pares;
    private int qtd_impares;
    private int qtd_pares;

    private Scanner ler = new Scanner(System.in);

    public Media () {
        numero = 0;
        media_impares = 0;
        media_pares = 0;
        soma_impares = 0;
        soma_pares = 0;
        qtd_impares = 0;
        qtd_pares = 0;
    }

    public void ler_valores() {
        System.out.print("Digite o valor limite: ");
        numero = ler.nextInt();
    }

    public double calcular_media_impares() {
        for (int i = 0; i <= numero; i++) {
            if (i % 2 != 0) {
                soma_impares += i;
                qtd_impares++;
            }
        }

        if (qtd_impares != 0)
            media_impares = soma_impares / qtd_impares;

        return media_impares;
    }

    public double calcular_media_pares() {
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                soma_pares += i;
                qtd_pares++;
            }
        }

        if (qtd_pares != 0)
            media_pares = soma_pares / qtd_pares;

        return media_pares;
    }
}
