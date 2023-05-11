package Question3Quiz.controller;

import Question3Quiz.model.Question;
import Question3Quiz.model.Quiz;

public class Controladora {
    Question[] questoesGeradas;

    public Controladora(){
        
    }

    public void gerarQuiz(int qtdQuestoes){
        questoesGeradas = (new Quiz(qtdQuestoes)).getQuestoes();
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
}


