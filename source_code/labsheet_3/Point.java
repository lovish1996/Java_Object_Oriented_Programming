package source_code.labsheet_3;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }

    public static void changeState(Point other) {
        other.x = -20;   // also works because we are inside Point class, we can access private variables also.
        other.setY(-20);    // changes reflected in caller method, call by reference
    }

    public static void changeReference(Point other) {
        other = new Point(-20, -20);    // not reflected in caller method, call by value
    }
}
