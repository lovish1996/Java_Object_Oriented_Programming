package source_code.labsheet_2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        int num1;
        double double1;
        String firstName, lastName;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        num1 = scanner.nextInt();
        System.out.println("You entered an integer: " + num1);

        System.out.println("Enter a double: ");
        double1 = scanner.nextDouble();
        System.out.println("You entered a double: " + double1);

        System.out.println("Enter your First Name: ");
        firstName = scanner.next();
        System.out.println("Your First Name is: " + firstName);

        scanner.nextLine();

        System.out.println("Enter your Last Name:");
        lastName = scanner.nextLine();
        System.out.println("Your Last Name is: " + lastName);

        scanner.close();
    }
}
