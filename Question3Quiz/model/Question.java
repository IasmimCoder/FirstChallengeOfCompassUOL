package Question3Quiz.model;

public class Question {
    private String pergunta;
    private String[] opcoesResposta;
    private int indexRespostaCorreta;

    public Question() {
    }

    public Question(String pergunta, String[] respostas, int indexRespostaCorreta){
        this.pergunta = pergunta;
        this.opcoesResposta = respostas;
        this.indexRespostaCorreta = indexRespostaCorreta;
    }

    public String getPergunta() {
        return this.pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String[] getOpcoesResposta() {
        return this.opcoesResposta;
    }

    public void setOpcoesResposta(String[] opcoesResposta) {
        this.opcoesResposta = opcoesResposta;
    }

    public int getIndexRespostaCorreta() {
        return this.indexRespostaCorreta;
    }

    public void setIndexRespostaCorreta(int indexRespostaCorreta) {
        this.indexRespostaCorreta = indexRespostaCorreta;
    }

}
