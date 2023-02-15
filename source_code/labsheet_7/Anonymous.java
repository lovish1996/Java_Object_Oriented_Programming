package source_code.labsheet_7;

public class Anonymous {
    public Circle getCircle(int radius) {
        return new Circle(radius);
    }

    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        Circle circle = anonymous.getCircle(10);
        System.out.println(circle.getArea());
    }
}

class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
