package source_code.labsheet_1;

public class PrimeNumber {
    public boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        if (x == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void nThPrimeNumber(int n) {
        int count = 0;
        int i = 2;

        while (count < n) {
            if (isPrime(i)) {
                count++;
            }
            i++;
        }

        System.out.println("nth Prime number for n = " + n + ": " + (i - 1));
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.nThPrimeNumber(n);
    }
}
