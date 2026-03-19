public class Professor extends Pessoa {
    public Professor(String nome, int idade) {
        super(nome, idade);
    }

    public void lancarNota() {
        System.out.println(nome + " lançou uma nota!");
    }
}
