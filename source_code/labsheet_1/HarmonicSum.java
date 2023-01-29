package source_code.labsheet_1;

public class HarmonicSum {
    public static void main(String[] args) {
        int maxDenominator = 50000;
        double sumLTR = 0.0;
        double sumRTL = 0.0;

        for (int i = 1; i <= maxDenominator; i++) {
            sumLTR += 1.0 / i;
        }

        for (int i = maxDenominator; i >= 1; i--) {
            sumRTL += 1.0 / i;
        }

        System.out.println("sumLTR: " + sumLTR);
        System.out.println("sumRTL: " + sumRTL);

        double difference = sumRTL - sumLTR;

        System.out.println("Difference between sumRTL and sumLTR is: " + difference);
    }
}
