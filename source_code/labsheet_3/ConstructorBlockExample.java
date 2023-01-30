package source_code.labsheet_3;

/**
 * Output:
 * This is first constructor block.
 * This is second constructor block.
 * This is no parameter constructor.
 * This is first constructor block.
 * This is second constructor block.
 * This is single parameter constructor.
 */
public class ConstructorBlockExample {
    {
        System.out.println("This is first constructor block.");
    }

    public ConstructorBlockExample() {
        System.out.println("This is no parameter constructor.");
    }

    public ConstructorBlockExample(String param1) {
        System.out.println("This is single parameter constructor.");
    }

    {
        System.out.println("This is second constructor block.");
    }

    public static void main(String[] args) {
        ConstructorBlockExample constructorBlockExample1 = new ConstructorBlockExample();
        ConstructorBlockExample constructorBlockExample2 = new ConstructorBlockExample("param1");
    }
}
