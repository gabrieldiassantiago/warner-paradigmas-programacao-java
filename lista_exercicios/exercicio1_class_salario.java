/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciolista_1;
import java.util.Scanner;

/**
 *
 * @author aluno9
 */
public class Salario {
    
    private double salario_antigo;
    private double salario_novo;
    private Scanner s;
    private double aumento;
    
    public Salario() {
        s = new Scanner(System.in);
        salario_antigo = 0;
        salario_novo = 0;
        aumento = 1.25;
    }
    
    public void entrada_salario() {
      System.out.println("Informa o seu salario antigo: \n");
      salario_antigo = s.nextDouble();
    }
    
    public void atualizar_Salario() {
        salario_novo = salario_antigo * aumento;
    }
    
    public void impressao() {
        System.out.println("O salário antigo era: \n" + salario_antigo);
        System.out.println("O novo salário é: " + salario_novo);
    }
}
