import java.util.ArrayList;
import java.util.Scanner;

public class Forms{
    private Controller controlador = new Controller();
    private Scanner leitor;


    public Forms(){
        leitor = new Scanner(System.in);
    }

    public void executarView(){
        escolherOpcao();
    }

    /*Metódo implementado recursivamente com o objetivo de forçar o usuário
     * a escolher uma das opções ou sair.
     */
    private void escolherOpcao(){
        exibirMenu();
        int opcao = lerOpcao();

        switch (opcao) {
            case 1:
                formularioCadastrarFuncionarios();
                escolherOpcao();
                break;
            case 2:
                imprimirTabelaFuncionarios();
                break;
            default:
                escolherOpcao();
                break;
        }
    
    }

 public void imprimirTabelaFuncionarios() {
    ArrayList<Funcionario> funcionarios = controlador.getFuncionarios();
    System.out.println("\n\nFUNCIONARIOS CADASTRADOS\n");
    System.out.printf("%-20s%-10s%-20s%-10s%-20s\n", "Nome", "Salário", "Bônus", "Desconto", "Salário Líquido");
  
    
    for (Funcionario f : funcionarios) {
        String bonus = String.format("%.2f", f.calcularBonus());
        String desconto = String.format("%.2f", f.calcularDesconto());
        String salarioLiquido = String.format("%.2f", f.calcularSalarioLiquido());

        System.out.printf("%-20s%-10.2f%-20s%-10s%-20s\n", f.getNomeCompleto(), f.getSalarioBruto(), bonus, desconto, salarioLiquido);
    }

    System.out.println("\n\nBom trabalho!! =)");
}



    private void formularioCadastrarFuncionarios(){
        
        System.out.print("Quantos usuários você deseja cadastrar? ");
        int qtdFuncionarios = Integer.parseInt(leitor.nextLine());

        while(qtdFuncionarios > 0){

            System.out.print("Digite o nome completo: ");
            String nomeCompleto = leitor.nextLine();
        
            System.out.print("Digite o salário atual: ");
            double salarioAtual = Double.parseDouble(leitor.nextLine());

            controlador.adicionarFuncionario(nomeCompleto, salarioAtual);
            qtdFuncionarios--;
        }

        System.out.println("\nUsuários cadastrados com sucesso!\n");
    }

    private void exibirMenu() {
        System.out.println("\n\n---MENU---\n\n");
        System.out.println("1 - Cadastrar funcionários");
        System.out.println("2 - Finalizar e ver funcionários");
    }

    private int lerOpcao() {
        System.out.print("\nDigite a opção desejada: ");
        return Integer.parseInt(leitor.nextLine());
    }
}

