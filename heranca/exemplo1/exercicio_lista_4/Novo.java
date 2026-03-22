public class Novo extends Carro{
    private double adicional;

    public Novo(double kilometragem, double preco, double adicional) {
        super(kilometragem, preco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return this.adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public void imprimirAdicional() {
        System.out.println("Seguro (adicional): R$ " + adicional);
        System.out.println("Preço total do carro novo: R$ " + (getPreco() + adicional));
    }

}
