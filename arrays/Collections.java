/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo5;
import java.util.ArrayList;
import java.util.Collections; //precisa importar 

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
        
        System.out.println(nomes.contains("Warner")); //contem esse valor?
        
        System.out.println("Tamanho do meu array:" + nomes.size()); //quantidade de valores no array
        
        System.out.println("Nome (0): " + nomes.get(0)); //busca no indice 0 o valor
        
        nomes.add("Ygona Moura");
        
        Collections.sort(nomes); //ele ordena de forma alfabatica
        
        for (String nome : nomes) {
            System.out.println(nome); //exibe de forma alfabatica
        }
        
        System.out.println("Forma descrecente");
        
        Collections.reverse(nomes); //ordem descrescente
        
         for (String nome : nomes) {
            System.out.println(nome);
        }
        
        
    }
}
