import java.util.Scanner;

public class Forms{
    private Scanner leitor;
   
    public Forms(){
        leitor = new Scanner(System.in);
    }


    public void executarView(){
        exibirMenu();
        int opcao = lerOpcao();

        switch (opcao) {
            case 1:
                cadastrarFuncionarios();
                break;
            case 2:
                //exibir funcionarios aqui
                break;
            default:
                System.out.println("Lançamento de Exception aqui");
                break;
        }
    }

    private void cadastrarFuncionarios(){
        
        System.out.print("Quantos usuários você deseja cadastrar? ");
        int qtdFuncionarios = Integer.parseInt(leitor.nextLine());

        while(qtdFuncionarios > 0){

            System.out.print("Digite o nome completo: ");
        
            System.out.print("Digite o salário atual: ");
            double salarioAtual = Double.parseDouble(leitor.nextLine());

            //chamar controller aqui
            
                qtdFuncionarios--;
        }
    }

    private void exibirMenu() {
        System.out.println("1 - Cadastrar funcionário");
        System.out.println("2 - Exibir funcionários");
        System.out.println("3 - Sair");
    }

    private int lerOpcao() {
        System.out.print("Digite a opção desejada: ");
        return Integer.parseInt(leitor.nextLine());
    }
}