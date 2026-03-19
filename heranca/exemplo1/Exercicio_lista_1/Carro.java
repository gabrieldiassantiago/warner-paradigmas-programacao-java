public class Carro extends Transporte {
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    public void abrirPortaMalas() {
        System.out.println("Porta-malas aberto!");
    }

    public void ligarRadio() {
        System.out.println("Radio aberto!");
    }
}
