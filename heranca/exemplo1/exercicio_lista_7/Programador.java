public class Programador extends Funcionario{
    private String linguagem;

    public void setLinguagem(String linguagem){
        this.linguagem = linguagem;
    }

    public String getLinguagem(){
        return this.linguagem;
    }

    @Override
    public double calcular_salario(){
        return super.getSalarioB() + (super.getSalarioB() * 0.2); // Programador recebe 5% a mais
    }
}
