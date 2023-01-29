package source_code.labsheet_1;

public class Fibonacci {
    public void fibonacci(int n) {
        int[] cache = new int[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                cache[i] = 1;
                sum += cache[i];
                continue;
            }
            int element = cache[i - 1] + cache[i - 2];
            cache[i] = element;
            sum += cache[i];
        }

        for (Integer x : cache) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("Average: " + sum / n);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacci(n);

    }
}
