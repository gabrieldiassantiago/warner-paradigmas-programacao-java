/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciolista_2;

/**
 *
 * @author aluno9
 */
public class ExercicioLista_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogador jog = new Jogador();
        
        jog.ler_idade_jogador();
        String classificao = jog.classificar();
        System.out.println(classificao);
        
    }
    
}
