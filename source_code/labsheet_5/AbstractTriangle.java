package source_code.labsheet_5;

public class AbstractTriangle extends AbstractShape {
    private double base;
    private double height;

    public AbstractTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "AbstractTriangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

}
