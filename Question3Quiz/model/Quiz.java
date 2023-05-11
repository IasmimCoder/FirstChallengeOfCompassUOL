package Question3Quiz.model;

public class Quiz{
    
    private Question[] questoes;
    private int score;

    public Quiz(int qtdQuestoes){
        this.questoes = new Question[qtdQuestoes];
    }

    public void gerarQuiz(){
        
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