//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Media media = new Media();

    media.ler_valores();
    double media_impar = media.calcular_media_impares();
    double media_par = media.calcular_media_pares();

    System.out.println(media_impar);
    System.out.println(media_par);
}
