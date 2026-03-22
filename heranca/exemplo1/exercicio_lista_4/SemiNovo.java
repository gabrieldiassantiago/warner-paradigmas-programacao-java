public class SemiNovo extends Carro {
    private double desconto;


    public SemiNovo(double kilometragem, double preco ) {
        super(kilometragem, preco);
    }

    public void setDesconto(double entraDesconto){
        this.desconto= entraDesconto;
    }

    public double getDesconto(){
        return this.desconto;
    }

    public void impressao() {
        System.out.printf("\nO carro SemiNovo custará o seguinte valor (desconto devido ipva): %.2f", super.getPreco()- desconto);
    }
}
