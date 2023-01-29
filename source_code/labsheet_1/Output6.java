package source_code.labsheet_1;

/**
 * Associativity specifies the order in which operators are executed/
 * Addition is left to right associative.
 * int and String addition is performed as String addition.
 * () overrides the precedence of operator evaluation.
 */
public class Output6 {
    public static void main(String[] args) {
        System.out.println(10 + 20 + "10" + "20");      // 301020
        System.out.println(10 + (20 + "10") + "20");    // 10201020
        System.out.println("10" + "20" + 10 + 20);      // 10201020
        System.out.println("10" + "20" + (10 + 20));    // 102030
    }
}
