void main() {

    Carro carro1 = new Carro("Toyta", "Corolla");
    carro1.abrirPortaMalas();
    carro1.ligarRadio();

    //moto
    Moto moto1 = new Moto("Honda", "CG");
    moto1.abaixarDescanso();

    moto1.ligarMotor();
    moto1.movimento(1);

    carro1.ligarMotor();
    carro1.movimento(1);

}
