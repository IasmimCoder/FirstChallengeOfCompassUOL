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


}