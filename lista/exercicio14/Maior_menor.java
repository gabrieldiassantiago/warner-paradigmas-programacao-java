import java.util.Scanner;
public class Numero {
    private Scanner s;
    private int[] numeros;
    private int maior;
    private int menor;
    
    public Numero(){
        //inicializacao de array
        numeros= new int[5];
        
        maior= Integer.MIN_VALUE;
        menor= Integer.MAX_VALUE;
    }
    
    
    public void entrada(){
        s = new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            System.out.println("Informe um numero");
            numeros[i]= s.nextInt();
        }
    }
    
    
    public void calculo(){
        for(int i=0; i<5; i++){
            if (numeros[i]>maior){
                maior= numeros[i];
            }
        }
        
        for(int i=0; i<5; i++){
            if (numeros[i]<menor){
                menor= numeros[i];
            }
        }
    }
    
    
    public void imprimir(){
        System.out.printf("\nO menor valor eh: %d", menor); 
        System.out.printf("\nO maior valor eh: %d", maior);
    }
    
    
}
