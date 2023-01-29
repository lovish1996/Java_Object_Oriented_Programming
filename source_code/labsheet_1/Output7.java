package source_code.labsheet_1;

/**
 * byte: The byte data type is an 8-bit signed two's complement integer.
 * It has a minimum value of -128 and a maximum value of 127 (inclusive).
 * b <= 200 is always true
 */
public class Output7 {
    public static void main(String[] args) {
        for (byte b = 0; b <= 200; b++) {   // always true b <= 200
            System.out.println("Hello!");
        }
    }
}
