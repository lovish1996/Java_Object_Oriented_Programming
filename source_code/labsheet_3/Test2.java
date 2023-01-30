package source_code.labsheet_3;

/**
 * Output:
 * 10
 * 10
 * 20
 * 20
 * 60
 */
public class Test2 {
    public static void main(String[] args) {
        Integer integer1 = 10;  // auto boxing
        Integer integer2 = 20;  // auto boxing

        System.out.println(integer1.intValue());
        System.out.println(integer1);

        System.out.println(integer2.intValue());
        System.out.println(integer2);

        Integer integer3 = new Integer(integer1.intValue() + integer2.intValue());
        Integer integer4 = integer1 + integer2 + integer3;
        System.out.println(integer4);
    }
}
