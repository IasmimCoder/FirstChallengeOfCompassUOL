public class Funcionario {
    private String nomeCompleto;
    private double salarioBruto;

    public Funcionario() {
    }

    public Funcionario(String nomeCompleto, double salarioBruto) {
        this.nomeCompleto = nomeCompleto;
        this.salarioBruto = salarioBruto;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}