package source_code.labsheet_6;

import java.util.Comparator;

public class SortByRadiusAndCenter implements Comparator<MovableCircle> {
    @Override
    public int compare(MovableCircle movableCircleFirst, MovableCircle movableCircleSecond) {
        if (movableCircleFirst.getRadius() - movableCircleSecond.getRadius() != 0) {
            return movableCircleFirst.getRadius() - movableCircleSecond.getRadius();
        }
        return movableCircleFirst.getCenter().compareTo(movableCircleSecond.getCenter());
    }
}
