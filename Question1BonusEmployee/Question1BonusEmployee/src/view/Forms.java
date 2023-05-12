package Question1BonusEmployee.src.view;

import java.util.Scanner;

import Question1BonusEmployee.src.controller.*;

public class Forms{
    private Controladora controlador;
    private Scanner leitor;


    public Forms(){
        leitor = new Scanner(System.in);
        controlador = new Controladora();
    }

    public void executar(){
        escolherOpcao();
    }

    /*Metódo implementado recursivamente com o objetivo de forçar o usuário
     * a escolher uma das opções ou sair(caso base da recursividade).
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
        
        int qtdFuncionarios = controlador.getQtdFuncionarios();
        System.out.println("\n\nFUNCIONARIOS CADASTRADOS\n");
        System.out.printf("%-20s%-10s%-20s%-10s%-20s\n", "Nome", "Salário", "Bônus", "Desconto", "Salário Líquido");
        
        for (int i = 0; i < qtdFuncionarios; i++ ) {
            String bonus = String.format("%.2f", controlador.calcularBonusFuncionario(i));
            String desconto = String.format("%.2f", controlador.calcularDescontoFuncionario(i));
            String salarioLiquido = String.format("%.2f", controlador.calcularSalarioLiquidoFuncionario(i));

            System.out.printf("%-20s%-10.2f%-20s%-10s%-20s\n", controlador.getNomeCompletoFuncionario(i), controlador.getSalarioBrutoFuncionario(i), bonus, desconto, salarioLiquido);
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

