package source_code.labsheet_1;

/**
 * In Java, the range of a byte data type is -128 to 127.
 */
public class Output3 {
    public static void main(String[] args) {
        byte b = -128;      // 127
        System.out.println(--b);
        byte b1 = 127;      // -128
        System.out.println(++b);

        for (b = 0; b < 200; b++) {     // b < 200 is always true
            System.out.println(b);
        }
    }
}
