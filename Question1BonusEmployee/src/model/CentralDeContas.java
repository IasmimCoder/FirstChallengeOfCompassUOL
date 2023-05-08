/**
 * Classe que agrupa os funcionários cadastrados. 
 * Foi utilizado o Design Pattern Sigleton para garantir uma instância única do 
 * objeto CentralDeContas.
 */

public class CentralDeContas{
    private static CentralDeContas instanciaUnica;
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>;

    private CentralDeContas(){};
    
    public static CentralDeContas getInstancia() {
        if (instanciaUnica == null) {
            instaciaUnica = new CentralDeContas();
        }
        return instanciaUnica;
    }

    public void adicionarFuncionario(String first_name, String last_name, double salary){
        Funcionario novoFuncionario = new Funcionario(first_name, last_name, salary);
        funcionarios.add(novoFuncionario);
    }
}