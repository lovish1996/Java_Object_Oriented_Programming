package source_code.labsheet_3;

/**
 * Output:
 * This is first static block.
 * This is second static block and static variable.
 * This is static method.
 * This is third static block.
 * This is the constructor.
 * This is second static method.
 */
public class StaticExample {
    static {
        System.out.println("This is first static block.");
    }

    public StaticExample() {
        System.out.println("This is the constructor.");
    }

    public static String staticString = "static variable.";

    static {
        System.out.println("This is second static block and " + staticString);
    }

    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
        StaticExample.staticMethod2();
    }

    static {
        staticMethod();
        System.out.println("This is third static block.");
    }
    public static void staticMethod() {
        System.out.println("This is static method.");
    }

    public static void staticMethod2() {
        System.out.println("This is second static method.");
    }
}
