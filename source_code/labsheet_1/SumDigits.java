package source_code.labsheet_1;

public class SumDigits {
    public void sumDigits(String number) {
        int n = number.length();
        int[] digits = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int digit = number.charAt(i) - '0';
            digits[i] = digit;
            sum += digit;
        }

        System.out.print("The sum of digits = ");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(digits[i]);
                continue;
            }
            System.out.print(digits[i] + " + ");
        }
        System.out.println(" = " + sum);
    }

    public static void main(String[] args) {
        String number = args[0];

        SumDigits sumDigits = new SumDigits();
        sumDigits.sumDigits(number);

    }
}
