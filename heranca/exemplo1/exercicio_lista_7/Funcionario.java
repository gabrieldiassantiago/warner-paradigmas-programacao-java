public class Funcionario {
    private String nome;
    private int idade;
    private double salarioBase;

    public Funcionario() {

    }

    public void setNome(String entraNome){
        this.nome= entraNome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int entraIdade){
        this.idade = entraIdade;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setSalarioB(double entraSalario){
        this.salarioBase = entraSalario;
    }

    public double getSalarioB(){
        return this.salarioBase;
    }

    public double calcular_salario(){
        return this.salarioBase;
    }
}
