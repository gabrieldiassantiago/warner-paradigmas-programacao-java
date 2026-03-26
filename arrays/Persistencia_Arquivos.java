/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo10;
import java.util.HashSet;
import java.util.HashMap;

//bibliotecas para persistir arquivos

import java.io.FileWriter;
import java.io.PrintWriter; //escrever dentro do arquivo
import java.io.IOException; //

/**
 *
 * 
 */
public class Exemplo10 {

    public static void main(String[] args) throws IOException{
        
      HashSet<String> nomes = new HashSet<>(); //nao deixa duplicar dados, não redudancia de dados
      
      nomes.add("Warner");
      nomes.add("Ana Clara");
      nomes.add("Ligia");
      nomes.add("Warner"); 
      
        System.out.println(nomes);
        
        for (String pessoa : nomes) {
            System.out.println(pessoa);
        }
        
        HashMap<String, String> unisal = new HashMap<>();
        
        unisal.put("WBR", "Warner");
        
        unisal.put("JBL", "LUANA COUTTO");

        System.out.println(unisal.get("JBL")); //busca pela chave "JBL", é como se JBL apontasse para Luana Coutto
        
        FileWriter arq = new FileWriter("C:\\arquivos\\dados.txt");
        
        PrintWriter grava = new PrintWriter(arq); //printwriter 
        
        grava.printf(unisal.get("JBL"));
         grava.printf("\n" + unisal.get("WBR"));
         
         
         for (String pessoa: nomes) {
             grava.print("\n" + pessoa); //pega de pessoas
         }
         
         arq.close();
        
        
    }
}
