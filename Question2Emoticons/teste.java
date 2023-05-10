package Question2Emoticons;

public class teste {
    public static void main(String[] args) {
        String texto = "abacabadabacaba";
        String sequencia = "ab";
    
        int contagem = 0;
        int indice = texto.indexOf(sequencia);
    
        while (indice >= 0) {
            contagem++;
            indice = texto.indexOf(sequencia, indice + 1);
        }
    
        System.out.println("A sequência '" + sequencia + "' aparece " + contagem + " vezes na string."); 
    }
}
