package Question3Quiz.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
 * Armazena as questões lidas pela classe Leitor de Questões para decidir quais
 * questões estarão na jogada.
 */
public class Sorteador {
    private ArrayList<Question> questoesDaJogada = new ArrayList<Question>();
    private static ArrayList<Question> questoesCadastradas = LeitorDeQuestoes.lerQuestoes();

    public Sorteador(int quantidadeDeQuestoes){
        sortearQuestoesDaJogada(quantidadeDeQuestoes);
    }
    
    public ArrayList<Question> getQuestoesSorteadas(){
        return questoesDaJogada;
    }

    public static int qtdQuestoesCadastradas(){
        return questoesCadastradas.size();
    }

    private  void sortearQuestoesDaJogada(int quantidadeDeQuestoes){

        int qtdQuestoesCadastradas = questoesCadastradas.size();

        Set<Integer> randomNumbers = generateRandomNumbers(quantidadeDeQuestoes, 0, qtdQuestoesCadastradas);

        for (int number : randomNumbers) {
            questoesDaJogada.add(questoesCadastradas.get(number));
        }
    }

    /*
     * sorteia uma quantidade específica de números inteiros 
     * aleatórios sem repetição usando a classe Random e um HashSet. Cada número sorteado
     * representa o índice sorteado das questão cadastradas no LeitorDeQuestoes
     */
    private static Set<Integer> generateRandomNumbers(int quantity, int min, int max) {
        
        /*
         *  verifica se a quantidade de números a serem sorteados é menor 
         * ou igual ao número de elementos no intervalo. 
         * Se não for, ele lança uma exceção.
         */
        if (quantity > (max - min) + 1) {
            throw new IllegalArgumentException("Quantity cannot be greater than range");
        }
        
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        
        while (numbers.size() < quantity) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            numbers.add(randomNumber);
        }
        
        return numbers;
    }
}
