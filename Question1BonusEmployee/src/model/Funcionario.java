public class Funcionario {
    private String nomeCompleto;
    private double salarioBruto;

    public Funcionario() {
    }

    public Funcionario(String nomeCompleto, double salarioBruto) {
        this.nomeCompleto = nomeCompleto;
        this.salarioBruto = salarioBruto;
    }


    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public double getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double calcularBonus(){
        if (salarioBruto >= 1000){
            return (salarioBruto*0.2);
        }
        if(salarioBruto > 1000 && salarioBruto <= 2000){
            return (salarioBruto*0.1);
        }
        return 0;
    }

    public double calcularDesconto(){
        if(salarioBruto > 2000){
            return (salarioBruto * 0.1);
        }
        return 0;
    }

    public double calcularSalarioLiquido(){
        return salarioBruto + calcularBonus() - calcularDesconto();
    }

}