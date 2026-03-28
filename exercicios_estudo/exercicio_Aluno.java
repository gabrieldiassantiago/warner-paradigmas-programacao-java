import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);

        int escolha; //coleta a escolha do divo

        while (true) {
            System.out.println("\n=== Sistema de Cadastro de Alunos ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Remover aluno");
            System.out.println("3 - Listar alunos");
            System.out.println("4 - Sair");
            System.out.print("Informe a opção desejada: ");
            escolha = s.nextInt();
            s.nextLine();

            switch (escolha) {
                case 1:
                    Aluno novoAluno = new Aluno();

                    System.out.print("Digite o nome do aluno: ");
                    novoAluno.setNome(s.nextLine());

                    System.out.print("Digite o curso do aluno: ");
                    novoAluno.setCurso(s.nextLine());

                    System.out.print("Digite a série do aluno: ");
                    novoAluno.setSerie(s.next());

                    System.out.print("Digite a turma do aluno: ");
                    novoAluno.setTurma(s.next());
                    s.nextLine();

                    System.out.println("\nConfirme os dados:");
                    System.out.printf("Nome: %s\nCurso: %s\nSérie: %s\nTurma: %s\n",
                            novoAluno.getNome(),
                            novoAluno.getCurso(),
                            novoAluno.getSerie(),
                            novoAluno.getTurma());

                    System.out.print("Digite 1 para salvar ou 2 para cancelar: ");
                    int confirmar = s.nextInt();
                    s.nextLine();

                    if (confirmar == 1) {
                        novoAluno.gravarCadastro();
                        System.out.println("Aluno cadastrado com sucesso.");
                    } else {
                        System.out.println("Cadastro cancelado.");
                    }
                    break;

                case 2:
                    System.out.print("Informe o nome do aluno a ser removido: ");
                    String excluirAluno = s.nextLine();

                   ArrayList<String> alunosRestantes = new ArrayList<>();

                   FileReader arq = new FileReader("vaca.txt");
                   BufferedReader lerArq = new BufferedReader(arq);

                   boolean encontrou = false;
                   String nome;

                   while ((nome = lerArq.readLine()) != null) {
                       /*
                        aqui para entender, vamos supor que:
                        começamos o loop 1, definindo a variavel nome = "primeiro nome do arquivo" - 1 linha,
                        exemplo:
                        val
                        engenharia
                        2
                        1
                        => vamos definir que nome  = val (val é um valor, portanto, é diferente de null, entao ele entra no loop)
                        para baixo, vamos coletar urso, serie, turma... e verificamos se o nome que definimos nesse fluxo é igual aquele
                        do qual queremos deletar, se sim, ele pula o else, o else é para colocar os alunos dos quais não serão deletados, e adicionar
                        no arquivo, sobrescrevendo vaca.txt, apenas alunos dos quais eu quero continuar
                        */
                       String curso = lerArq.readLine();
                       String serie = lerArq.readLine();
                       String turma = lerArq.readLine();

                       if (nome.equals(excluirAluno)) {
                           encontrou = true;
                       } else {
                           alunosRestantes.add(nome);
                           alunosRestantes.add(curso);
                           alunosRestantes.add(serie);
                           alunosRestantes.add(turma);
                       }
                   }

                   if (encontrou) {
                       FileWriter fw = new FileWriter("vaca.txt");

                       BufferedWriter bw  = new BufferedWriter(fw);

                       for (String aluno : alunosRestantes) {
                           bw.write(aluno);
                           bw.newLine();
                       }
                       bw.close();
                   }

                case 3:
                    BufferedReader leitor = new BufferedReader(new FileReader("vaca.txt"));
                    String nomeAluno;
                    boolean arquivoVazio = true;

                    while ((nomeAluno = leitor.readLine()) != null) {
                        String curso = leitor.readLine();
                        String serie = leitor.readLine();
                        String turma = leitor.readLine();

                        System.out.println("\n-------------------------");
                        System.out.println("Nome: " + nomeAluno);
                        System.out.println("Curso: " + curso);
                        System.out.println("Série: " + serie);
                        System.out.println("Turma: " + turma);
                        System.out.println("-------------------------");

                        arquivoVazio = false;
                    }

                    leitor.close();

                    if (arquivoVazio) {
                        System.out.println("Nenhum aluno cadastrado.");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o sistema...");
                    s.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
