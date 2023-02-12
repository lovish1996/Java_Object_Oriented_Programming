package source_code.labsheet_6;

import java.util.Comparator;

public class SortByRadius implements Comparator<MovableCircle> {
    @Override
    public int compare(MovableCircle movableCircleFirst, MovableCircle movableCircleSecond) {
        return movableCircleFirst.getRadius() - movableCircleSecond.getRadius();
    }
}
