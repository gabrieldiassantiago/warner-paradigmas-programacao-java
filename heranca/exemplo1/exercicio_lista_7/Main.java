public class Main {
    public static void main(String[] args) {
        Funcionario novoFuncionario = new Funcionario();

        novoFuncionario.setNome("Gabriel");
        novoFuncionario.setIdade(20);
        novoFuncionario.setSalarioB(300);
        System.out.printf("**Funcionario**\nNome: %s\nIdade: %d\nSalario Base: %.2f\nSalario Final: %.2f\n", novoFuncionario.getNome(),
                novoFuncionario.getIdade(), novoFuncionario.getSalarioB(), novoFuncionario.calcular_salario());

        //Criação e teste da classe Gerente
        Gerente novoGerente  = new Gerente();

        novoGerente.setNome("Gerente bia");
        novoGerente.setIdade(44);
        novoGerente.setSalarioB(2000);
        novoGerente.setDepartamento("Contabilidade");
        System.out.printf("\n**Gerente**\nNome: %s\nIdade: %d\nDepartamento: %s\nSalario Base: %.2f\nSalario Final: %.2f\n", novoGerente.getNome(),
                novoGerente.getIdade(), novoGerente.getDepartamento(), novoGerente.getSalarioB(), novoGerente.calcular_salario());

        Programador novoProgramador= new Programador();
        novoProgramador.setNome("Roberto");
        novoProgramador.setIdade(29);
        novoProgramador.setSalarioB(2000);
        novoProgramador.setLinguagem("Java");
        System.out.printf("\n**Programador**\nNome: %s\nIdade: %d\nLinguagem: %s\nSalario Base: %.2f\nSalario Final: %.2f\n", novoProgramador.getNome(),
                novoProgramador.getIdade(), novoProgramador.getLinguagem(), novoProgramador.getSalarioB(), novoProgramador.calcular_salario());

    }
}
