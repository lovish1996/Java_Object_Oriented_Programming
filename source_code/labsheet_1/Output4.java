package source_code.labsheet_1;

/**
 * In Java, the range of a byte data type is -128 to 127.
 * In Java, the range of a short data type is -32768 to 32767.
 */
public class Output4 {
    public static void main(String[] args) {
        byte b = (byte) 670;        // 670 % 256 = 158 --> 158-127 = 31 ---> 1 = -128 and 31 = -98
        System.out.println(b);
        short s = (short) 40000;    // 40000-32767 = 7233 --> 1 = -32768, 7233 = -32768+7232 = -25536
        System.out.println(s);
    }
}
