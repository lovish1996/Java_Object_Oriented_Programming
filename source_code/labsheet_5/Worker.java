package source_code.labsheet_5;

abstract public class Worker {
    private String name;
    private double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public String getName() {
        return name;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salaryRate=" + salaryRate +
                '}';
    }

    abstract public double computePay();
}
