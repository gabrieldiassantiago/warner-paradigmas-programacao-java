/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio12;

public class Exercicio12 {

    public static void main(String[] args) {

        Funcionario objFuncionario = new Funcionario();
        objFuncionario.setNome("Ygona Silva");
        objFuncionario.setSalario(200);

        System.out.println("FUNCIONARIO:");
        System.out.println("Nome.......: " + objFuncionario.getNome());
        System.out.println("Salario....: " + objFuncionario.getSalario());
        System.out.println();

        Secretaria objSecretaria = new Secretaria();
        objSecretaria.setNome("Valeria Almeida");
        objSecretaria.setSalario(200);
        objSecretaria.setRamal(250);

        System.out.println("SECRETARIA:");
        System.out.println("Nome.......: " + objSecretaria.getNome());
        System.out.println("Salario....: " + objSecretaria.getSalario());
        System.out.println("Ramal......: " + objSecretaria.getRamal());
        
        Telefonista tel = new Telefonista();
        tel.setNome("Valeria Almeida");
        
        tel.setRamal(20);
        tel.setSalario(200);
        tel.setEstacao(10);
        
         System.out.println("TELEFONISTA:");
        System.out.println("Nome.......: " + tel.getNome());
        System.out.println("Salario....: " + tel.getSalario());
        System.out.println("Ramal......: " + tel.getRamal());
        System.out.println("Estação......: " + tel.getEstacaoTrabalho());
        
        Gerente objGerente = new Gerente();
        
        objGerente.setNome("Luana Coutto");
        objGerente.setUsuario("vai.luana.amiga");
        objGerente.setSenha("cuzcuz");
        objGerente.setSalario(20000);
        
         System.out.println("GERENTE:");
        System.out.println("Nome.......: " + objGerente.getNome());
        System.out.println("Salario....: " + objGerente.getSalario());
        System.out.println("Usuario......: " + objGerente.getUsuario());
        
        
        
        
    }
}
