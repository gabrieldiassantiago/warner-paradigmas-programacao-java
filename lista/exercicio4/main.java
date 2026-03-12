//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

void main() {
  Scanner sc = new Scanner(System.in);

  System.out.print("Digite a base do triângulo: ");
  double base = sc.nextDouble();
  System.out.print("Digite a altura do triângulo: ");
  double altura = sc.nextDouble();

  Calcular calc = new Calcular(base, altura);

  double area = calc.calcularArea();
  System.out.println("Área do triângulo: " + area);

}
