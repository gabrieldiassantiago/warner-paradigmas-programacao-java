public class Professor extends Pessoa{
    private String disciplina;

    public void setDisciplina(String entraDisciplina){
        this.disciplina= entraDisciplina;
    }
    public String getDisciplina(){
        return this.disciplina;
    }

    public void falar(){
        System.out.printf("\nOla, meu nome eh %s, tenho  %d anos e leciono %s", getNome(), getIdade(), getDisciplina());
    }
}
