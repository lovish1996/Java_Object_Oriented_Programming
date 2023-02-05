package source_code.labsheet_5;

public class TestShape {
    public static void main(String[] args) {
        Shape shapeFirst = new Rectangle("Red", 4, 5);
        System.out.println(shapeFirst);
        System.out.println("Area: " + shapeFirst.getArea());

        Shape shapeSecond = new Triangle("Blue", 4, 5);
        System.out.println(shapeSecond);
        System.out.println("Area: " + shapeSecond.getArea());
        
    }
}
