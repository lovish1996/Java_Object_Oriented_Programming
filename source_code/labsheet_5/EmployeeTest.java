package source_code.labsheet_5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeFirst = new Employee("First Employee", 130000);
        Employee employeeSecond = new Employee("Second Employee", 160000);

        Employee managerFirst = new Manager("First Manager", 230000, "IT");
        Employee managerSecond = new Manager("Second Manager", 260000, "Product");

        System.out.println(employeeFirst);
        System.out.println(employeeSecond);

        System.out.println(managerFirst);
        System.out.println(managerSecond);
    }
}
