package source_code.labsheet_5;

public class TestAbstractShape {
    public static void main(String[] args) {
        AbstractShape abstractShapeFirst = new AbstractRectangle("Red", 4, 5);
        System.out.println(abstractShapeFirst);
        System.out.println("Area: " + abstractShapeFirst.getArea());

        AbstractShape abstractShapeSecond = new AbstractTriangle("Blue", 4, 5);
        System.out.println(abstractShapeSecond);
        System.out.println("Area: " + abstractShapeSecond.getArea());

//         'AbstractShape' is abstract; cannot be instantiated
//        AbstractShape abstractShape = new AbstractShape("Green");
    }
}
