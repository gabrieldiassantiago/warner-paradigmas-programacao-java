import java.util.Scanner;
public class Fatorial {
		private int num;
		private Scanner s;
		private int fatorial;
		
		public Fatorial(){
			num=-1;
			fatorial=1;			
		}
		public void entrada(){
				System.out.println("\nInforme o numero: ");
				s = new Scanner(System.in);
				while(num<0){
					num = s.nextInt();
					if(num<0){
						System.out.println("\nNumero invalido, precisa ser um valor positivo. Informe outro: ");
					}
				}			
		}
				
		public void calcular(){
				for(int i=1; i<=num; i++){
					fatorial*=i;
				}			
		}
				
				
		public void imprimir(){
			System.out.printf("\nO fatorial de %d eh igual a: %d", num, fatorial);
		}
}
