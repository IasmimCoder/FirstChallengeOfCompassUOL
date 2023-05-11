package Question3Quiz.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.Random;

public class LeitorDeQuestoes {
    private ArrayList<Question> questoesCadastradas = new ArrayList<Question>();

    // public LeitorDeQuestoes(){
    //     questoesCadastradas = lerQuestoes("perguntas.txt");
    // }


    // public ArrayList<Question> getQuestoesCadastradas() {
    //     return this.questoesCadastradas;
    // }

    // public int getQuantidadeDeQuestoes(){
    //     return questoesCadastradas.size();
    // }
   
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

    /*
    Gera um número aleatório entre 0 e o número de alternativas para 
    decidir a resposta correta.
    */ 
    private static int sortearRespostaCorreta(int numeroAlternativas){
        Random random = new Random();
        int numeroSorteado = random.nextInt(numeroAlternativas + 1); 
        return numeroSorteado;
    }
}

