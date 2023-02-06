package source_code.labsheet_5;

public class HourlyWorker extends Worker {
    private int hoursWorked;

    public HourlyWorker(String name, double salaryRate, int hoursWorked) {
        super(name, salaryRate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double computePay() {
        return Math.min(hoursWorked, 60) * getSalaryRate();
    }
}
