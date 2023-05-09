public class Forms{
    private Scanner leitor
   
    public Forms(){
        leitor = new Scanner(System.in);

    }


    public executarView(){
        exibirMenu();
        int opcao = lerOpcao();

        Switch case(opcao){
            case 1: 
                cadastrarFuncionarios();
            case 2:
                //exibir funcionarios aqui
            case 3:
                //sair
            default:
                System.out.println("Lançamento de Exception aqui")
        }

    }

    private void cadastrarFuncionarios(){
        
        System.out.print("Quantos usuários você deseja cadastrar? ");
        int qtdFuncionarios = Integer.parseInt(leitor.nextLine());

        while(qtdFuncionarios){

        System.out.print("Digite o primeiro nome: ");
        String first_name = leitor.nextLine();

        System.out.print("Digite o último nome: ");
        String last_name = leitorString.nextLine();

        System.out.print("Digite o salário atual: ");
        double salarioAtual = Double.parseDouble(leitor.nextLine());

        //chamar controller aqui

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