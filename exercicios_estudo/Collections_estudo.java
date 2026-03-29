void main() {
    ArrayList<Integer> valores = new ArrayList<Integer>();

    valores.add(1);
    valores.add(2);
    valores.add(3);
    valores.add(4);
    valores.add(5);
    valores.add(-2);



    //ordenar
    Collections.sort(valores); //do menor para o maior, crescente..

    for (Integer valor : valores) {
        System.out.println(valor);
    }

    Collections.reverse(valores); //maior para menor

    for (Integer valor : valores) {
        System.out.println(valor);
    }

  //vale lembrar que ele altera as posições do vetor, ou seja, ele NÃO imprime apenas, ele realmente altera

}
