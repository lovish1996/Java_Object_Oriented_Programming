package source_code.labsheet_1;

/**
 * The output of the code will be "Hi".
 * This is because when comparing a float and a double,
 * the float is first implicitly cast to a double,
 * and then the comparison is made. Due to the imprecision of floating-point numbers,
 * the values of x1 and y1 are not exactly equal, so the "else" block is executed and "Hi" is printed
 * for the second if-else block.
 */
public class Output2 {
    public static void main(String[] args) {
        float x = 10.5f;
        double y = 10.5;

        if (x == y) {
            System.out.println("Hello");
        } else {
            System.out.println("Hi");
        }

        float x1 = 10.57f;
        double y1 = 10.57;

        if (x1 == y1) {                     // loss of precision, inherent differences in precision between floats and doubles
            System.out.println("Hello");
        } else {
            System.out.println("Hi");
        }
    }
}
