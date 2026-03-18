package exercicio12;

public class Gerente extends Funcionario{
    
    private String usuario;
    private String senha;

    public void setUsuario(String entraUsuario) {
        this.usuario = entraUsuario;
    }
    
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setSenha(String entraSenha) {
        this.senha = entraSenha;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public double calculaBeneficio() {
        return this.getSalario() * 0.2;
    }
 
}
