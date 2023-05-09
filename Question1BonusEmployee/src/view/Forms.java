import java.util.Scanner;

public class Forms{
    Controller controlador = new Controller();
    private Scanner leitor;
   
    public Forms(){
        leitor = new Scanner(System.in);
    }


    public void executarView(int opcao){
        if (opcao == 3){
            System.out.println("Bom trabalho!! =)");
        }
        else{
            exibirMenu();
            opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    cadastrarFuncionarios();
                    break;
                case 2:
                    //exibir funcionarios aqui
                    break;
                case 3:
                    break;
                default:
                    opcao = lerOpcao();
                    break;
            }

            executarView(opcao);
        }
    }

    private void cadastrarFuncionarios(){
        
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

        System.out.println("Usuários cadastrados com sucesso!");
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