package Question3Quiz;

import java.util.ArrayList;

import Question3Quiz.model.LeitorDeQuestoes;
import Question3Quiz.model.Question;
import Question3Quiz.model.Quiz;
import Question3Quiz.model.Sorteador;
import Question3Quiz.view.Apresentacao;

public class Main {
    public static void main(String[] args) {

        Quiz quiz = new Quiz(5);
        int qtd = quiz.getQuestoes().length;
        System.out.println(qtd);
        // Apresentacao apresentacao = new Apresentacao();
        // apresentacao.titulo();

        // Sorteador sorteador = new Sorteador(5);
        // ArrayList<Question> questoesLidas = sorteador.getQuestoesSorteadas();
        // System.out.println(questoesLidas.size());

        // for(Question q: questoesLidas){
        //     System.out.println("\n\n\nQuestaoooooooo\n");
        //     System.out.println(q.getPergunta());
            
        //     String [] respostas = q.getOpcoesResposta();
        //     for (String resposta : respostas) {
        //         System.out.println(resposta);
        //     }

        // }

        // LeitorDeQuestoes leitorDeQuestoes = new LeitorDeQuestoes();

        // int qtdQuestoes = leitorDeQuestoes.getQuantidadeDeQuestoes();

        // System.out.println(qtdQuestoes);
    }
}
