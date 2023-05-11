import java.util.ArrayList;

/**
 * Classe controladora do modelo MVC, visando que o model não se acople com 
 * a view
 */
public class Controladora{
    private CentralDeContas centralDeContas = CentralDeContas.getInstancia();
    private ArrayList<Funcionario> funcionarios = centralDeContas.getFuncionarios();


    public double calcularBonusFuncionario(int indexFuncionario){
        return funcionarios.get(indexFuncionario).calcularBonus();
    }

    public double calcularDescontoFuncionario(int indexFuncionario){
        return funcionarios.get(indexFuncionario).calcularDesconto();
    }

    public double calcularSalarioLiquidoFuncionario(int indexFuncionario){
        return funcionarios.get(indexFuncionario).calcularSalarioLiquido();
    }

    public void adicionarFuncionario(String nomeCompleto, double salario){
        centralDeContas.adicionarFuncionario(nomeCompleto, salario);
    };

    public int getQtdFuncionarios(){
        return funcionarios.size();
    }

    public String getNomeCompletoFuncionario(int indexFuncionario){
        return funcionarios.get(indexFuncionario).getNomeCompleto();
    }

    public double getSalarioBrutoFuncionario(int indexFuncionario){
        return funcionarios.get(indexFuncionario).getSalarioBruto();
    }
}
