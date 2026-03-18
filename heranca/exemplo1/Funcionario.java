/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio12;

/**
 *
 * @author aluno9
 */
public class Funcionario {
     private String nome;
    private double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSalario(double entraSalario) {
        this.salario = entraSalario;
    }
    
    public double getSalario() {
        return this.salario;
    }

    public double calcularBeneficios() {
        return this.salario * 0.1; // Exemplo de cálculo de benefícios
    }
}
