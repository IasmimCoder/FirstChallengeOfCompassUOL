package Question3Quiz.view;
import java.util.Random;
import java.util.Scanner;

import Question3Quiz.controller.Controladora;

public class Apresentacao {
    private Controladora controladora = new Controladora();
    private Scanner leitor = new Scanner(System.in);
    private int qtdQuestoes;

    public Apresentacao(){

    };

    public void executar(){
        this.qtdQuestoes = 10;


        titulo();
        controladora.gerarQuiz(qtdQuestoes);
        mostrarQuestoes();
    }

    public void mostrarQuestoes(){
        for(int i = 0; i < qtdQuestoes; i++){
            String pergunta = 
            printRandomColorfulText(controladora.getPergunta(i));

            System.out.format("\n%dº - %s", i+1,pergunta);
            String[] respostas = controladora.getOpcoes(i);

            for (int j = 1; j <= 3; j++) {
                System.out.format("\n%d - %s", j, respostas[j-1]);
            }
        }
    
    }


    private void titulo(){
        String titulo = printRandomColorfulText("\n\n\n-----------------------QUIZ-----------------------\n\n\n");
        System.out.println(titulo);
        
    }


    private static String printRandomColorfulText(String Text) {
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
}
