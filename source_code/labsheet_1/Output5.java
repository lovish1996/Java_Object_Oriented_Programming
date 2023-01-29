package source_code.labsheet_1;

/**
 * java: incompatible types: int cannot be converted to boolean
 * Compile Time Error
 */
public class Output5 {
    public static void main(String[] args) {
        if (10) {       // Required type: boolean   Provided: int
            System.out.println("Hello");
        } else {
            System.out.println("Hi");
        }
    }
}
