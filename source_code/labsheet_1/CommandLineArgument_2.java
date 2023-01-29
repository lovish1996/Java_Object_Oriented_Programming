package source_code.labsheet_1;

/**
 * This program takes 10 integer arguments as an input from command line,
 * parse the command line arguments to integers, finds the sum of these
 * 10 numbers and print the sum.
 * <p>
 * In IntelliJ IDEA:
 * Run -> Edit Configurations -> Program Arguments -> OK
 */
public class CommandLineArgument_2 {
    public static void main(String[] args) {
        int sum = 0;

        for (String number : args) {
            sum += Integer.parseInt(number);
        }

        System.out.println("Sum of 10 integers is: " + sum);
    }
}
