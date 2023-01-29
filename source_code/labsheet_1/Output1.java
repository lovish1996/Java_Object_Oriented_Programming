package source_code.labsheet_1;

/**
 * The range of values that can be stored in a byte variable is -128 to 127.
 * In Java, when you add or subtract a value from a byte variable,
 * Java automatically converts the byte to an int, performs the arithmetic operation,
 * and then converts the result back to a byte. This process is called "widening primitive conversion"
 * and it applies to all the other primitive types as well.
 */
public class Output1 {
    public static void main(String[] args) {
        byte x = 640;       // Required type: byte  Provided: int, cast expression to byte: byte x = (byte) 640;
        byte b = 10;        // works fine
        b = b + 1;          //  Required type:byte  Provided:int , cast expression to byte: b = (byte) (b + 1);
        short s = 10;
        s = s + 1;          // Required type:short  Provided:int , cast expression to short: s = (short) (s + 1);
        char y = 1;
        y = y + 1;          // Required type:char  Provided:int , cast expression to char: y = (char) (y + 1);
        float f = 10.56;    // Required type:float  Provided:double , convert literal to float: float f = 10.56F;
    }
}
