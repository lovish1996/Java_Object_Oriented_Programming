package source_code.labsheet_3;

/**
 * Static variable is shared between all the instances of a class
 */
public class StaticDemo {
    public static void main(String[] args) {
        MyStatic myStatic1 = new MyStatic();
        myStatic1.showData();
        MyStatic myStatic2 = new MyStatic();
        myStatic2.showData();
        MyStatic.b++;       // able to access static variables without an instance
        myStatic1.showData();
    }
}
