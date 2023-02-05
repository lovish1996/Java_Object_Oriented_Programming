package source_code.labsheet_5;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println("Cylinder: [ radius = " + cylinder.getRadius() + ", height = " + cylinder.getHeight() + ", color = " + cylinder.getColor() +
                ", area = " + cylinder.getArea() + ", volume = " + cylinder.getVolume() + "]");

        Cylinder cylinder2 = new Cylinder(5.0, 2.0);
        System.out.println("Cylinder: [ radius = " + cylinder2.getRadius() + ", height = " + cylinder2.getHeight() + ", color = " + cylinder2.getColor() +
                ", area = " + cylinder2.getArea() + ", volume = " + cylinder2.getVolume() + "]");
    }
}
