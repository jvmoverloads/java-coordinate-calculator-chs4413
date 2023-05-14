package domain;

import java.util.Objects;

public class Point {
    private final Coordinate x;
    private final Coordinate y;

    public Point(int x, int y) {
        this.x = new Coordinate(x);
        this.y = new Coordinate(y);
    }

    public double getDistance(Point point) {
        int x = point.getX();
        int y = point.getY();

        return Math.sqrt(Math.pow((x - this.x.getCoordinate()), 2) + Math.pow((y - this.y.getCoordinate()), 2));
    }

    public int getX() {
        return x.getCoordinate();
    }

    public int getY() {
        return y.getCoordinate();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(x, point.x) && Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
