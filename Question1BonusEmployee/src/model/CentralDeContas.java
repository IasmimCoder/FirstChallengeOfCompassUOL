/**
 * Classe que agrupa os funcionários cadastrados. 
 * Foi utilizado o Design Pattern Sigleton para garantir uma instância única do 
 * objeto CentralDeContas.
 */

public class CentralDeContas{
    private static CentralDeContas instanciaUnica;
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>;

    private CentralDeContas(){};
    
    /**
     * Retorna a instância única de Central de Contas.
     */
    public static CentralDeContas getInstancia() {
        if (instanciaUnica == null) {
            instaciaUnica = new CentralDeContas();
        }
        return instanciaUnica;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public void adicionarFuncionario(String nomeCompleto, double salarioBruto){
        Funcionario novoFuncionario = new Funcionario(nomeCompleto, salarioBruto);
        funcionarios.add(novoFuncionario);
    }



}