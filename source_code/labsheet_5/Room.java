package source_code.labsheet_5;

public class Room {
    private double height, breadth, length;

    public Room() {
        this.height = -1;
        this.breadth = -1;
        this.length = -1;
    }

    public Room(double height, double breadth, double length) {     // Overloaded constructors
        this.height = height;
        this.breadth = breadth;
        this.length = length;
    }

    public Room(double length) {
        this.length = this.breadth = this.height = length;
    }

    double volume() {
        return length * breadth * height;
    }
}
