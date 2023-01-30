package source_code.labsheet_3;

public class Box {
    private double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length = " + length +
                ", width = " + width +
                ", height = " + height +
                '}';
    }

    public double area() {
        return 2 * (length * width + width * height + height * length);
    }

    public double volume() {
        return length * width * height;
    }

    public static void swapBoxes(Box box1, Box box2) {
        Box temp = box1;
        box1 = box2;
        box2 = temp;
    }
}
