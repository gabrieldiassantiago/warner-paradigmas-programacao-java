/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcao;
import java.util.Scanner;

/**
 *
 * @author aluno9
 */
public class Salario {
    private double bSalario;
    private double nSalario; //private -> variaveis são acessiveis apenas nesta classe
    private Scanner s;
    private double carteira;
    
    public Salario() {
        s = new Scanner(System.in);
        bSalario = 0;
        nSalario = 0;
        carteira = 0;
    } //inicializa os objetos = construtor
    
    
    public void entrada() {
        System.out.println("Informa o seu salário:");
        bSalario = s.nextDouble();
    }
    
    public void atualiza() {
        nSalario = (bSalario * 0.25) + bSalario;
    }
    
    public void imprimir() {
        System.out.printf("Novo salário: %.2f", nSalario);
    }
    
    public void adicionarValor() {
        System.out.println("Digite um valor para adicionar na carteira:");
        double Valor = s.nextDouble();
        carteira = carteira + Valor;
    }
    
    public void imprimeCarteira() {
        System.out.printf("Seu saldo é: %.2f", carteira);
    }
    
    
}
