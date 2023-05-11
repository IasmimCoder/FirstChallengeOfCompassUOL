package Question3Quiz.model;

import java.util.ArrayList;

public class Quiz{
    
    private Question[] questoes;
    private int score;

    public Quiz(int qtdQuestoes){
        gerarQuiz(qtdQuestoes);
    }

    public void gerarQuiz(int qtdQuestoes){
        Sorteador sorteador = new Sorteador(qtdQuestoes);
        ArrayList<Question> questoesSorteadas = sorteador.getQuestoesSorteadas();
        questoes = questoesSorteadas.toArray(new Question[0]);
    }

    public void adicionarQuestao(Question question, int posicao){
        questoes[posicao] = question;
    }

    public Question[] getQuestoes() {
        return this.questoes;
    }

    public void setQuestoes(Question[] questoes) {
        this.questoes = questoes;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}