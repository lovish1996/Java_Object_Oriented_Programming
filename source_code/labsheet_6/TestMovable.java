package source_code.labsheet_6;

import java.util.ArrayList;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint movablePointFirst = new MovablePoint(5, 5, 2, 3);
        MovablePoint movablePointSecond = new MovablePoint(2, 3, 1, 1);
        MovablePoint movablePointThird = new MovablePoint(2, -1, 3, 7);
        MovablePoint movablePointFourth = new MovablePoint(-3, 5, 11, 9);

        System.out.println(movablePointFirst.compareTo(movablePointSecond));
        System.out.println();

        System.out.println(movablePointFirst);

        movablePointFirst.moveUp();
        System.out.println(movablePointFirst);

        movablePointFirst.moveRight();
        System.out.println(movablePointFirst);

        movablePointFirst.moveDown();
        System.out.println(movablePointFirst);

        movablePointFirst.moveLeft();
        System.out.println(movablePointFirst);
        System.out.println();

        Movable movableCircle = new MovableCircle(3, movablePointFirst);
        System.out.println(movableCircle);

        movableCircle.moveUp();
        System.out.println(movableCircle);

        movableCircle.moveRight();
        System.out.println(movableCircle);

        movableCircle.moveDown();
        System.out.println(movableCircle);

        movableCircle.moveLeft();
        System.out.println(movableCircle);
        System.out.println();

        ArrayList<MovableCircle> movableCircles = new ArrayList<>();
        MovableCircle movableCircleFirst = new MovableCircle(36, movablePointFirst);
        movableCircles.add(movableCircleFirst);
        MovableCircle movableCircleSecond = new MovableCircle(71, movablePointSecond);
        movableCircles.add(movableCircleSecond);
        MovableCircle movableCircleThird = new MovableCircle(2, movablePointThird);
        movableCircles.add(movableCircleThird);
        MovableCircle movableCircleFourth = new MovableCircle(2, movablePointFourth);
        movableCircles.add(movableCircleFourth);

        // SortByRadius
        movableCircles.sort(new SortByRadius());

        for (MovableCircle circle : movableCircles) {
            System.out.println(circle);
        }
        System.out.println();

        // SortByCenter
        movableCircles.sort(new SortByCenter());

        for (MovableCircle circle : movableCircles) {
            System.out.println(circle);
        }
        System.out.println();

        // SortByRadiusAndCenter
        movableCircles.sort(new SortByRadiusAndCenter());

        for (MovableCircle circle : movableCircles) {
            System.out.println(circle);
        }
    }
}
