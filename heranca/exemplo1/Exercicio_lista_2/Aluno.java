public class Aluno extends Pessoa{
    private String curso;
    private int periodo;

    public Aluno(String nome, int idade, String curso, int periodo) {
    super(nome, idade);
    this.curso = curso;
    this.periodo = periodo;
    }

    public void matricular() {
        System.out.println(nome + "matriculado no curso de " + curso);
    }

    public void pagarBoleto() {
        System.out.println("Boleto pago!");
    }

}
