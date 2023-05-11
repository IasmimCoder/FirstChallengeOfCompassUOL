package Question3Quiz.controller;

import Question3Quiz.model.Jogador;
import Question3Quiz.model.Question;
import Question3Quiz.model.Quiz;

public class Controladora {
    private Question[] questoesGeradas;
    private Quiz quiz;
    private Jogador jogador;

    public Controladora(){
        
    }

    public void setNomeJogador(String nome){
        jogador.setNome(nome);
    }

    public String getNomeJogador(){
        return jogador.getNome();
    }

    public void gerarQuiz(int qtdQuestoes){
        this.quiz = new Quiz(qtdQuestoes);
        questoesGeradas = quiz.getQuestoes();
        jogador = quiz.getJogador();
    }

    public String getPergunta(int indexPergunta){
        return questoesGeradas[indexPergunta].getPergunta();
    }

    public String[] getOpcoes(int indexPergunta){
        return questoesGeradas[indexPergunta].getOpcoesResposta();
    }

    public int getIndexRespostaCorreta(int indexPergunta){
        return questoesGeradas[indexPergunta].getIndexRespostaCorreta();
    }

    public int getScore(){
        return quiz.getScore();
    }

    public boolean verificarResposta(int respostaUsuario, int indexPergunta){
        int respostaCorreta = getIndexRespostaCorreta(indexPergunta);

        if(respostaCorreta == respostaUsuario){
            quiz.incrementarScore();
            return true;
        }
        return false;
    }
}


