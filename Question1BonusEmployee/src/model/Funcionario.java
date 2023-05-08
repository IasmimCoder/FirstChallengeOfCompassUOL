public class Funcionario {
    private String first_name;
    private String last_name;
    private double salary;

    public Funcionario() {
    }

    public Funcionario(String first_name, String last_name, double salary) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
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