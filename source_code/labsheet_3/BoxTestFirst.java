package source_code.labsheet_3;

/**
 * Pass by value
 * Output:
 * Box{length = 10.0, width = 40.0, height = 60.0}
 * Box{length = 20.0, width = 30.0, height = 80.0}
 * Box{length = 10.0, width = 40.0, height = 60.0}
 * Box{length = 20.0, width = 30.0, height = 80.0}
 */
public class BoxTestFirst {
    public static void main(String[] args) {
        Box box1 = new Box(10, 40, 60);
        Box box2 = new Box(20, 30, 80);

        System.out.println(box1);
        System.out.println(box2);

        Box.swapBoxes(box1, box2);

        System.out.println(box1);
        System.out.println(box2);
    }
}
