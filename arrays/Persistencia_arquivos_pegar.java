package com.mycompany.exemplo11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author aluno9
 */
public class Exemplo11 {

    public static void main(String[] args) throws IOException {

        BufferedReader buffRead = new BufferedReader(new FileReader("C:\\\\arquivos\\\\dados.txt"));

        String linha = "";
        int i = 0;

        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else {
                break;
            }
        }
      linha = buffRead.readLine();

    }
}
