public class Bonus {
    private double salario;
    private double bonus;

    public Bonus(double salario) {
        this.salario = salario;
    }

    public double getsalario() {
        return salario;
    }

    public void setsalario(double salario) {
        this.salario = salario;
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calcularBonus() {
        if (salario <= 1000) {
            return salario * 0.2;
        } else if (salario <= 2000) {
            return salario * 0.1;
        } else {
            return -salario * 0.1;
        }
    }

    public double calcularSalarioLiquido() {
        return salario + calcularBonus();
    }

}
