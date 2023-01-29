package source_code.labsheet_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(args[0]);

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": Enter a new integer.");
            sum += Integer.parseInt(bufferedReader.readLine());
        }

        System.out.println("Sum: " + sum);

    }
}
