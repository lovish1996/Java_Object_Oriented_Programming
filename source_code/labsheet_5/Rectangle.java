package source_code.labsheet_5;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", superclass=" + super.toString() +
                '}';
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
