import exerciciolista_1.Salario;

void main() {

  Scanner scanner = new Scanner(System.in);

  System.out.printf("Digite um valor base:");
  double valorEntrada = scanner.nextDouble();

  Salario sal = new Salario(valorEntrada);

  sal.calculaAtualizacao(10.0);

  System.out.println("O salario atualizado eh R$: " + sal.getValorAtualizado());

}
