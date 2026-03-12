/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciolista_2;
import java.util.Scanner;

/**
 *
 * @author aluno9
 */
public class Jogador {
        
    private Scanner s;
    private int idade;
    
    public Jogador() {
        s = new Scanner(System.in);
        idade = 0;
    }
    
    public void ler_idade_jogador() {
        idade = s.nextInt();
    }
    
    public String classificar() {
        if (idade > 4 && idade < 8) {
            return "Infantil A";
        } else if (idade > 7 && idade < 11) {
            return "Infantil B";
        } else if (idade  > 10 && idade < 14) {
            return "Juvenil A";
        } else if (idade > 14 && idade <18) {
            return "Juvenil B";
        } else {
            return "maiores de 18 anos ";
        }
    }
}
