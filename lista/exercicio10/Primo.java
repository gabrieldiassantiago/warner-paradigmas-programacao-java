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

   public void verificar_primo() {
      int divisores = 0;
      for (int i = 1; i <= numero; i++) {
         if (numero % i  == 0) {
            divisores++;
         }
      }
      if (divisores == 2) {
         System.out.printf("O número %d é primo", numero);
      } else {
         System.out.printf("O número %d não é primo", numero);
      }
   }


}
