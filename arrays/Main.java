/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

public class Arrays {

    public static void main(String[] args) {
        
        double valor[] = new double[10]; //vetor valor, que ocupa 10 posições
        
        
        for (int i = 0; i < valor.length; i++) {
            
        System.out.println("Valor: " + i + ") " + valor[i]); 
        
        }
        
        System.out.println("Tamanho: " + valor.length);
        
        for (double vlr: valor) {
            
            System.out.println("Valor: " + vlr); //forma diferente de percorrer
            
        }
        
        Pessoa pessoa[] = new Pessoa[2];
        Pessoa p1 = new Pessoa("Gabriel", 20);
        Pessoa p2 = new Pessoa("Ana", 10);
        
        pessoa[0] = p1;
        pessoa[1] = p2;
        
        for (int y = 0 ; y < pessoa.length; y++) {
            
            System.out.println("Pessoa " + y  + " : " + pessoa[y].getNome() + " idade: "  + pessoa[y].getIdade());
        }
        
    }
}
