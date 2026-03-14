import java.util.Scanner;

class Primo {
   private Scanner scanner;
   private int numero;

   public Primo() {
      numero = 0;
   }

   public void ler_numero() {
      scanner = new Scanner(System.in);
      System.out.println("Digite um valor válido:");

      numero = scanner.nextInt();

      while (numero < 1) {
         System.out.println("O número não é valido, tente novamente por favor:");
         numero = scanner.nextInt();
      }
   }

   public void verificar_P() {
    int divisores = 0;
    for (int i = 1; i <= numero; i++) {
      for (int j = 1; j <= numero; j++){
         if (i % j == 0) {
            divisores++;
         }
      }
      if (divisores == 2) {
         System.out.printf("%d ", i);
      }

      divisores = 0;
    }

   }


}
