package source_code.labsheet_5;

public class FullTimeWorker extends Worker {
    private int hoursWorked;

    public FullTimeWorker(String name, double salaryRate, int hoursWorked) {
        super(name, salaryRate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double computePay() {
        return Math.min(240, hoursWorked) * getSalaryRate();
    }
}
