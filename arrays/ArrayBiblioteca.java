package com.mycompany.exemplo5;
import java.util.ArrayList;

/**
 *
 * @author aluno9
 */
public class Exemplo5 {

    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();
        
        nomes.add("Warner");
        nomes.add("Ana Clara");
        nomes.add("João da Silva");
        
        
        nomes.remove("Gabriel");
        
        
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        System.out.println(nomes.contains("Warner"));
        
        
        
    }
}
