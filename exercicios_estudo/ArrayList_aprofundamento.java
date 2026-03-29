import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       String[] nomes = {"Gab", "Maria"}; //pode ser assim
       String[] nomesBB = new String[5]; //define que vai ter 5 posições


        nomesBB[0] = "Gab";
        nomesBB[1] = "Maria";
        nomesBB[2] = "Gab";
        nomesBB[3] = "Maria";
        nomesBB[4] = "Gab";

        for (String nome : nomesBB) {
            System.out.println(nome);
        }

        /* Array List
        É dinamico, é mais fácil de usar
        ArrayList<Tipo> nome = new ArrayList<Tipo>();
         */

        ArrayList<String> arrayDinamico =  new ArrayList<String>();

        arrayDinamico.add("Informação 1 do array dinamico"); // [0] será o indice 0
        arrayDinamico.add("Informação 2 do array dinamico"); // [1]

        for (int indice = 0; indice < arrayDinamico.size(); indice++) {
            System.out.println(arrayDinamico.get(indice));
        }

        //remover informação 1 e 2
        arrayDinamico.remove(0);
        //arrayDinamico.clear(); iria limpar todo nosso arraylist

        for (int indice = 0; indice < arrayDinamico.size(); indice++) {
            System.out.println(arrayDinamico.get(indice));
        }
        //for-each

        for (String valores : arrayDinamico) {
            System.out.println(valores);
        }







    }
}
