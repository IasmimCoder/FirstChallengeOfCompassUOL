/**
 * Classe controladora do modelo MVC
 */
public class Controller{
    CentralDeContas centralDeContas = CentralDeContas.getInstancia();

    public void adicionarFuncionario(String first_name, String last_name, double salary){
        centralDeContas.adicionarFuncionario(first_name, last_name, salary);
    };
}