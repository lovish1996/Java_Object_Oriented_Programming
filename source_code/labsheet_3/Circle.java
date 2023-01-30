package source_code.labsheet_3;

public class Circle {
    static double PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        Circle.PI = Math.PI;
    }

    // accessor method
    public double getRadius() {
        return radius;
    }

    // mutator method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    // radius is formal argument/ local variable
    public static void getCircumference(double radius) {
        System.out.println("Circumference: " + (2 * PI * radius));
    }
}
