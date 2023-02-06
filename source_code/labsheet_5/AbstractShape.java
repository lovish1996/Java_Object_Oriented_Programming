package source_code.labsheet_5;

abstract public class AbstractShape {
    private String color;

    public AbstractShape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "AbstractShape{" +
                "color='" + color + '\'' +
                '}';
    }

    abstract public double getArea();
}
