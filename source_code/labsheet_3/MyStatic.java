package source_code.labsheet_3;

public class MyStatic {
    int a;      // initialized to 0
    static int b;   // initialized when class is loaded

    public MyStatic() {
        b++;
    }

    public void showData() {
        System.out.println("value of a = " + a);
        System.out.println("value of b = " + b);
    }

//    public static void increment(){
//        a++;    // Non-static field 'a' cannot be referenced from a static context
//    }
}
