package source_code.labsheet_5;

public class AbstractRectangle extends AbstractShape {
    private double length;
    private double width;

    public AbstractRectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "AbstractRectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
