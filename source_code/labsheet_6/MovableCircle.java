package source_code.labsheet_6;

/**
 * MovableCircle composes a MovablePoint class
 */
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;    // can access center.x, center.y, ... directly because of package-private access

    public MovableCircle(int radius, MovablePoint center) {
        super();
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center.toString() +
                '}';
    }

    @Override
    public void moveUp() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }
}
