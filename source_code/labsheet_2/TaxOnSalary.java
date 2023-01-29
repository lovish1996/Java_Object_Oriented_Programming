package source_code.labsheet_2;

import java.util.Scanner;

public class TaxOnSalary {
    private double salary;
    private final boolean isPANsubmitted;

    public TaxOnSalary(boolean isPANsubmitted) {
        this.salary = 1000.00;
        this.isPANsubmitted = isPANsubmitted;
    }

    public TaxOnSalary() {
        this.salary = 0.00;
        this.isPANsubmitted = false;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isPANsubmitted() {
        return isPANsubmitted;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateTax() {
        if (getSalary() <= 180000 && isPANsubmitted()) {
            return 0;
        } else if (getSalary() <= 180000 && !isPANsubmitted()) {
            return 0.05 * getSalary();
        } else if (getSalary() > 180000 && getSalary() <= 500000) {
            return 0.1 * getSalary();
        } else if (getSalary() > 500000 && getSalary() <= 1000000) {
            return 0.2 * getSalary();
        } else {
            return 0.3 * getSalary();
        }
    }

    public void inputSalary() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        setSalary(salary);
    }
}
