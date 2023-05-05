package domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Points {
    private final List<Point> points;

    public Points(List<Point> points) {
        checkPoints(points);
        this.points = points;
    }

    private void checkPoints(List<Point> points) {
        Set<Point> pointSet = new HashSet<>(points);
        if (pointSet.size() != points.size())
            throw new IllegalArgumentException("좌표 중복");
    }

    public List<Point> getPoints() {
        return points;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((points == null) ? 0 : points.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Points other = (Points) obj;
        if (points == null) {
            if (other.points != null)
                return false;
        } else if (!points.equals(other.points))
            return false;
        return true;
    }
}
