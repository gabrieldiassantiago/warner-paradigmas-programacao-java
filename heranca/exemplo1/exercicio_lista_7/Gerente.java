public class Gerente extends Funcionario {
    private String departamento;



    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    @Override
    public double calcular_salario(){
        return super.getSalarioB() + (super.getSalarioB() * 0.10); // Gerente recebe 10% a mais
    }

}
