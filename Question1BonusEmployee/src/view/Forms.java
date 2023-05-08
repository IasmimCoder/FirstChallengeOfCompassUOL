public class Forms{
    private Scanner leitorString;
    private Scanner leitorNumeros;
   

    public Forms(){
        leitorString = new Scanner(System.in);
        leitorNumeros = new Scanner(System.in);
    }

    public void cadastrarFuncionarios(){
        
        System.out.print("Quantos usuários você deseja cadastrar? ");
        int qtdFuncionarios = leitorNumeros.nextInt();

        while(qtdFuncionarios){

        System.out.print("Digite o primeiro nome: ");
        String first_name = leitorString.nextLine();

        System.out.print("Digite o último nome: ");
        String last_name = leitorString.nextLine();

        System.out.print("Digite o salário atual: ");
        double salarioAtual = leitorNumeros.nextLine();

      
        }
    }

    public void exibirMenu() {
        System.out.println("1 - Cadastrar funcionário");
        System.out.println("2 - Exibir funcionários");
        System.out.println("3 - Sair");
    }

    public int lerOpcao() {
        System.out.print("Digite a opção desejada: ");
        return scanner.nextInt();
    }

}