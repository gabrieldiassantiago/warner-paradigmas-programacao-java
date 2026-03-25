public class Main {
    public static void main(String[] args) {
        Retangulo ret1 = new Retangulo(5, 3);
        Retangulo ret2 = new Retangulo(10, 4);

        Circulo c1 = new Circulo(2);
        Circulo c2 = new Circulo(7);

        System.out.println("=== RETÂNGULOS ===");
        System.out.printf("Retângulo 1 - Base: %.2f | Altura: %.2f%n", ret1.getBase(), ret1.getAltura());
        System.out.printf("Área: %.2f%n", ret1.calcularArea());
        System.out.printf("Perímetro: %.2f%n%n", ret1.calcularPerimetro());

        System.out.printf("Retângulo 2 - Base: %.2f | Altura: %.2f%n", ret2.getBase(), ret2.getAltura());
        System.out.printf("Área: %.2f%n", ret2.calcularArea());
        System.out.printf("Perímetro: %.2f%n%n", ret2.calcularPerimetro());

        System.out.println("=== CÍRCULOS ===");
        System.out.printf("Círculo 1 - Raio: %.2f%n", c1.getRaio());
        System.out.printf("Área: %.2f%n", c1.calcularArea());
        System.out.printf("Perímetro: %.2f%n%n", c1.calcularPerimetro());

        System.out.printf("Círculo 2 - Raio: %.2f%n", c2.getRaio());
        System.out.printf("Área: %.2f%n", c2.calcularArea());
        System.out.printf("Perímetro: %.2f%n", c2.calcularPerimetro());
    }
}
