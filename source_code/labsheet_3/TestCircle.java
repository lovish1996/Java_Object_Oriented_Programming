package source_code.labsheet_3;

/**
 * 1. Make the area function as static and observe the output
 * Non-static field 'radius' cannot be referenced from a static context
 * 2. Remove the formal argument from getCircumference() method and observe the output
 * Non-static field 'radius' cannot be referenced from a static context
 * 3. Rename static to final and observe the error(s) and correct them
 * Variable 'PI' might not have been initialized, Cannot assign a value to final variable 'PI'
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.3);
        System.out.println("Area of circle with radius = 2.3 is: " + circle1.area());

        Circle.getCircumference(2.3);   // static method

        Circle circle2 = new Circle(3.45);
        System.out.println("Area of circle with radius = 3.45 is: " + circle2.area());
        Circle.getCircumference(3.45);

    }
}


