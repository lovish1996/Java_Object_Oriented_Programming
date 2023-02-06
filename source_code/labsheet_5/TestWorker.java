package source_code.labsheet_5;

public class TestWorker {
    public static void main(String[] args) {
        Worker fullTimeWorker = new FullTimeWorker("First Worker", 100, 250);
        System.out.println("Full time worked, monthly Salary: " + fullTimeWorker.computePay());

        Worker hourlyWorker = new HourlyWorker("Second Worker", 50, 70);
        System.out.println("Hourly worked, monthly Salary: " + hourlyWorker.computePay());
    }
}
