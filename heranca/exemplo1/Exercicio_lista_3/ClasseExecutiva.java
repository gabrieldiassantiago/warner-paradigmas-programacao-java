public class ClasseExecutiva extends PassagemAerea {
    private String posicaoPoltrona;

    public ClasseExecutiva(double valor, String posicaoPoltrona) {
        super(valor);
        this.posicaoPoltrona = posicaoPoltrona;
    }

    public String getValorComPoltrona() {
        return String.format("Valor: R$ %.2f | Poltrona: %s", valor, posicaoPoltrona);
    }

    public String getPosicaoPoltrona() {
        return posicaoPoltrona;
    }
}
