public class Aluno extends Pessoa{
    private String curso;


    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return this.curso;
    }

    public void falar() {
        System.out.printf("\nOla, meu nome e %s, sou do curso de %s e tenho  %d anos", getNome(), getCurso() , getIdade());
    }

}
