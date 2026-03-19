class Transporte {
    private String marca;
    private String modelo;

    public Transporte(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    public void movimento(int codInsutrucao) {
        System.out.println("Movimento: " + codInsutrucao);
    }

    public void ligarMotor() {
        System.out.println("Motor ligado! [" + marca + " " + modelo + "]");
    }

}
