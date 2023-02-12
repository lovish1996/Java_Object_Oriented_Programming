package source_code.labsheet_6;

import java.util.Comparator;

public class SortByCenter implements Comparator<MovableCircle> {
    @Override
    public int compare(MovableCircle movableCircleFirst, MovableCircle movableCircleSecond) {
        return movableCircleFirst.getCenter().compareTo(movableCircleSecond.getCenter());
    }
}
