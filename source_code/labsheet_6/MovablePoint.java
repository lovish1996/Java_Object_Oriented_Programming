package source_code.labsheet_6;

import java.util.Comparator;

public class MovablePoint implements Movable, Comparable<MovablePoint>, Comparator<MovablePoint> {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public int compareTo(MovablePoint movablePoint) {
        if (this.x - movablePoint.x != 0)
            return this.x - movablePoint.x;
        return this.y - movablePoint.y;
    }

    @Override
    public int compare(MovablePoint movablePointFirst, MovablePoint movablePointSecond) {
        if (movablePointFirst.x - movablePointSecond.x != 0)
            return movablePointFirst.x - movablePointSecond.x;
        return movablePointFirst.y - movablePointSecond.y;
    }
}
