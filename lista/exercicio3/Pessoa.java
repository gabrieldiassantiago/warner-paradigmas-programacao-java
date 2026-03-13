import java.util.Scanner;

public class Pessoa {

    private String nome;
    private char sexo;
    private double altura;
    private double peso;
    private Scanner s;

    public Pessoa() {
        this.sexo = ' ';
        this.altura = 0;
        this.peso = 0;
        this.nome = "";
    }

    public void entradaDados() {
        s = new Scanner(System.in);

        System.out.println("\nInforme o nome da pessoa: ");
        nome = s.nextLine();


        while (sexo != 'M' && sexo != 'F') {
            System.out.print("Informe o sexo (M/F): ");
            sexo = s.next().toUpperCase().charAt(0);

            if (sexo != 'M' && sexo != 'F') {
                System.out.println("Opção inválida!");
            }
        }
        System.out.print("Digite a altura em metros: ");
        altura = s.nextDouble();
    }

    public void calcular() {
        if (sexo == 'M') {
            peso = (72.7 * altura) - 58;
        } else {
            peso = (62.1 * altura) - 44.7;
        }
    }

    public void impressao() {
        String pegaSexo = (sexo == 'M' ? "Homem": "Mulher");

        System.out.printf("\nNome: %s", nome);
        System.out.printf("\nSexo: %s", pegaSexo);
        System.out.printf("\nAltura: %.2f m", altura);
        System.out.printf("\nPeso ideal: %.2f kg\n", peso);
    }


}
