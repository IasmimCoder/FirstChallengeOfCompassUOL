package Question2Emoticons;

import java.util.Scanner;

public class Emoticons {

    public static String lerMensagem(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Escreva aqui a sua mensagem emocionante: ");
        String mensagem = leitor.nextLine();

        
        String emotion = Emoticons.definirSentimentoDaMensagem(mensagem);
        leitor.close();
        return emotion;

    }

    private static String definirSentimentoDaMensagem(String mensagem){

       int qtdEmoticonsFeliz = contarEmoticons(mensagem, ":-)");
       int qtdEmoticonsIrritado = contarEmoticons(mensagem, ":-(");

       if(qtdEmoticonsFeliz > qtdEmoticonsIrritado){
        return "fun";
       }

       if(qtdEmoticonsFeliz < qtdEmoticonsIrritado){
        return "upset";
       }

        return "Neutral";
    }

    private static int contarEmoticons(String mensagem, String emoticon){
        
        /*
         * retona em qual indíce se encontra a primeira passagem 
         * da sequência procurada, caso a mensagem não possua
         * a sequência, retorna -1.
         */
        int indice = mensagem.indexOf(emoticon);

        int contador = 0;

        /*
         * Procura se há ocorrências do emotincon a partir do próximo
         * índice e contabiliza, varrendo toda a String.
         */
        while (indice >= 0) {
            contador++;
            indice = mensagem.indexOf(emoticon, indice + 1);
        }

        return contador;
    }
}
