/**
 * Classe controladora do modelo MVC, visando que o model não se acople com 
 * a view
 */
public class Controller{
    CentralDeContas centralDeContas = CentralDeContas.getInstancia();

    public void adicionarFuncionario(String nomeCompleto, double salario){
        centralDeContas.adicionarFuncionario(nomeCompleto, salario);
    };
}