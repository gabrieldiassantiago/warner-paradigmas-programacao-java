/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo1;

/**
 *
 * @author aluno9
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* var teste = "lorena";
       
        System.out.println(teste);
        
        System.out.println("Cidade: " + teste);
        System.out.printf("Cidade2: %s", teste); //só pode ser usado desta forma este recurso, usando printf
        
       final float PI = 3.14159265f; //precisa colocar um "f" no final, quando é float (final = forço a variavel ser uma constante);

        System.out.println(PI);
        */
       int x = 10;
       if (x > 11){
           System.out.println("é maior que 11");
       } else {
           System.out.println("é menor que 11");
       }
       
        System.out.println(x > 6 ? "Aprovado": "Reprovado"); //condicional ternario
        
    }
    
}
