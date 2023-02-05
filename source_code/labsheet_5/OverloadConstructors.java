package source_code.labsheet_5;

public class OverloadConstructors {
    public static void main(String[] args) {
        Room roomFirst = new Room(20, 30, 40);
        Room roomSecond = new Room();
        Room roomThird = new Room(10);
        double volume;

        volume = roomFirst.volume();
        System.out.println("Volume roomFirst: " + volume);

        volume = roomSecond.volume();
        System.out.println("volume roomSecond: " + volume);

        volume = roomThird.volume();
        System.out.println("Volume roomThird: " + volume);
    }
}
