package source_code.labsheet_2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": Enter a new integer.");
            sum += scanner.nextInt();
        }

        System.out.println("Sum: " + sum);
    }
}
