package source_code.labsheet_3;

/**
 * Output:
 * Point{x = 10.0, y = 20.0}
 * Point{x = -20.0, y = -20.0}
 * Point{x = 100.0, y = 200.0}
 * Point{x = 100.0, y = 200.0}
 */
public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(10, 20);
        System.out.println(point1);

        // Pass by reference
        Point.changeState(point1);
        System.out.println(point1);

        Point point2 = new Point(100, 200);
        System.out.println(point2);

        // Pass by value
        Point.changeReference(point2);
        System.out.println(point2);
    }
}
