import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa novaPessoa = new Pessoa();

        novaPessoa.setNome("Gabriel");
        novaPessoa.setIdade(20);

        Professor novoProfessor = new Professor();
        novoProfessor.setNome("Oswaldo");
        novoProfessor.setIdade(42);
        novoProfessor.setDisciplina("Calculo 1");

        Aluno novoAluno= new Aluno();
        novoAluno.setNome("Jonas");
        novoAluno.setIdade(18);
        novoAluno.setCurso("Engenharia Mecanica");

        novaPessoa.falar();
        novoAluno.falar();
        novoProfessor.falar();
    }
}
