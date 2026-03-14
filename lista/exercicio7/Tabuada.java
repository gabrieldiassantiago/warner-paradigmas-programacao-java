import java.util.Scanner;

class Tabuada {
    private Scanner s;
    private int valor_tabuada;

    public Tabuada() {
        s = new Scanner(System.in);
        valor_tabuada = 0;
    }

    public void ler_valores(){
        System.out.println("Informa um valor N:");

        valor_tabuada = s.nextInt();

    }

    public void imprimir_tabuada() {
        for (int i = 1; i < valor_tabuada; i++) {
            System.out.println("\nTabuada do " + i);

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }


}
