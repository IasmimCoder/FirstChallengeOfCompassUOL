package Question3Quiz.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class LeitorDeQuestoes {
   
    public static ArrayList<Question> lerQuestoes() {
        ArrayList<Question> questoes = new ArrayList<Question>();
        File arquivo = new File("perguntas.txt");
        
        try {
            Scanner scanner = new Scanner(arquivo);
            while (scanner.hasNextLine()) {
                String pergunta = scanner.nextLine();
                String[] respostas = new String[3];
                for (int i = 0; i < respostas.length; i++) {
                    respostas[i] = scanner.nextLine();
                }
                //int indexRespostaCorreta = Integer.parseInt(scanner.nextLine());
                int indexRespostaCorreta = Integer.parseInt(scanner.nextLine());
                Question novaQuestao = new Question(pergunta, respostas, indexRespostaCorreta);
                questoes.add(novaQuestao);
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return questoes;
    }
}

