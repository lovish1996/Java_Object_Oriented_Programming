package source_code.labsheet_5;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", superclass=" + super.toString() +
                '}';
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
