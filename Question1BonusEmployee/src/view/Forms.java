import java.util.Scanner;

public class Forms{
    Controller controlador = new Controller();
    private Scanner leitor;
   
    public Forms(){
        leitor = new Scanner(System.in);
    }

    public void executarView(){
        exibirMenu();
        escolherOpcao(0);
    }

    private void escolherOpcao(int opcao){
        if (opcao == 2){
            System.out.println("Bom trabalho!! =)");
        }
        else{
            opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    cadastrarFuncionarios();
                    break;
                default:
                    break;
            }

           escolherOpcao(opcao);
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
        System.out.println("1 - Cadastrar funcionários");
        System.out.println("2 - Sair");
    }

    private int lerOpcao() {
        System.out.print("Digite a opção desejada: ");
        return Integer.parseInt(leitor.nextLine());
    }


}
