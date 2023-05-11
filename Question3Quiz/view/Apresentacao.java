package Question3Quiz.view;
import java.util.Random;

public class Apresentacao {

    public Apresentacao(){};

    public void executar(){
        titulo();

    }

    public void mostrarQuestoes(){

    }

    private void titulo(){
        printRandomColorfulText("\n\n\n-----------------------QUIZ-----------------------\n\n\n");
    }


    private static void printRandomColorfulText(String Text) {
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

        System.out.println(coloredText);
    }
}
