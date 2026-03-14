import java.util.Scanner;

class Produto {
   private Scanner scanner;
   private int numero;
   private int produto;

   public Produto() {
      numero = 0;
      produto = 1;
      scanner = new Scanner(System.in);

   }

    public void ler_numero() {

        while(numero<1 || numero>10){

            System.out.println("\nInsira o numero");
            numero= scanner.nextInt();
            if(numero<1 || numero>10){

                System.out.println("\nNumero invalido querida, o intervalo e entre 1 e 10");
            }
        }
    }

    public void exibirProdutoPares() {
       for (int i = 1; i <= numero; i++) {
           if (i % 2 == 0) {
               produto*= i;
           }
       }
        System.out.printf("O produto dos pares eh igual a: %d", produto);

}



}
