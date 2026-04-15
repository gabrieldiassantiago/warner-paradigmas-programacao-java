public class Aluno {
    private String nome;
    private String curso;
    private String serie;
    private String turma;

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void gravarCadastro() throws IOException {
        FileWriter fw = new FileWriter("vaca.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(nome);
        bw.newLine();
        bw.write(curso);
        bw.newLine();
        bw.write(serie);
        bw.newLine();
        bw.write(turma);
        bw.newLine();

        bw.close();
    }
}