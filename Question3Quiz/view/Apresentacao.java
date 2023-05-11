package Question3Quiz.view;
import java.util.Random;
import java.util.Scanner;

import Question3Quiz.controller.Controladora;

public class Apresentacao {
    private Controladora controladora = new Controladora();
    private Scanner leitor = new Scanner(System.in);
    private int qtdQuestoes;
    private int score;
    private String nomeJogador;

    
    public void executar(){
        this.qtdQuestoes = 10;
        controladora.gerarQuiz(qtdQuestoes);

        apresentacaoQuiz();
        exibirQuiz();
        finalizarJogo();
    }
    
    public void apresentacaoQuiz(){
        clear();
        titulo();

        System.out.print("\nEu sou um quiz e estou aqui para testar o quanto vocês me conhecem. Eu sou rápido como um raio, esperto como um gato e afiado como uma faca. Então, se preparem para responder rapidamente e com precisão!\nMas não se preocupem, se vocês errarem, eu não vou te dar um choque elétrico, ou pior, fazer vocês comerem brócolis!\n\nComo devo lhe chamar? ");

        nomeJogador = leitor.nextLine();
        controladora.setNomeJogador(nomeJogador);

        

        System.err.println("\n\nVamos começar a testar sua paciência " + nomeJogador + "!\n\nPressione enter para iniciar...");

        leitor.nextLine();
    };


    public void exibirQuiz(){
        for(int i = 0; i < qtdQuestoes; i++){
            
            clear();
            titulo();
            exibirScore();

            String pergunta = 
            randomColorfulText(controladora.getPergunta(i)) + "\n";

            System.out.format("\n%dº - %s", i+1,pergunta);
            String[] respostas = controladora.getOpcoes(i);

            for (int j = 1; j <= 3; j++) {
                System.out.format("\n%d - %s", j, respostas[j-1]);
            }
            
            verificarResposta(i);
            
            System.out.print("\nPressione enter para continuar...");

            leitor.nextLine();

        }
    
    }

    private void finalizarJogo(){
        clear();
        System.out.println("Foi ótimo jogar com você " + nomeJogador + "!\n\n SCORE FINAL");

        exibirScore();

        if(score < (qtdQuestoes/2)){
            System.out.println("\nTente melhor na próxima. <3");
        }
        else{
            System.out.println("\nGênio?");
        }
    }

    private void exibirScore(){
        score = controladora.getScore();
        String scoreString = "Score [" + score + "/" + qtdQuestoes + "]\n";

        System.out.println(randomColorfulText(scoreString));
    }

    private void verificarResposta(int indexQuestao){
        int respostaUsuario = receberIndexResposta();
        boolean acertou = controladora.verificarResposta(respostaUsuario, indexQuestao);

        if(acertou){
            System.out.println("\nCorreto! =) \n");
        }else{
            System.out.println("\nErrado... >:( \n");
            System.out.println("Resposta correta: " + (controladora.getIndexRespostaCorreta(indexQuestao) + 1));
        }

    }


    private int receberIndexResposta(){
        System.out.print("\n\nQual a resposta? ");
        int resposta = Integer.parseInt(leitor.nextLine());

        return resposta -1;
    }


    private void titulo(){
        String titulo = randomColorfulText("-----------------------QUIZ-----------------------\n\n");
        System.out.println(titulo);
    }


    private static String randomColorfulText(String Text) {
        String ANSI_RESET = "\u001B[0m";
        String[] ANSI_COLORS = {
            "\u001B[31m", // Red
            "\u001B[32m", // Green
            "\u001B[33m", // Yellow
            "\u001B[34m", // Blue
            "\u001B[35m", // Purple
            "\u001B[36m", // Cyan
        };
        String ANSI_BOLD = "\u001B[1m";
        
        Random rand = new Random();
        String randomColor = ANSI_COLORS[rand.nextInt(ANSI_COLORS.length)];
        
        String coloredText = ANSI_BOLD + randomColor + Text + ANSI_RESET;

        return coloredText;
    }

    private static void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Erro ao limpar o terminal: " + e);
        }
    }

    public static void delay(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Erro ao aguardar o atraso: " + e);
            Thread.currentThread().interrupt();
        }
    }
}


