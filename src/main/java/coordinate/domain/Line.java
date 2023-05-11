package coordinate.domain;

import java.util.List;

public class Line extends Shape {

    private static final String SHAPE_NAME = "선";
    private static final int POINT_NUMBER = 2;

    public Line(Points points) {
        super(points, POINT_NUMBER);
    }

    @Override
    public double calculateDistance() {
        List<Point> vertexes = points.getPoints();
        Point point1 = vertexes.get(0);
        Point point2 = vertexes.get(1);

        return point1.getDistance(point2);
    }

    @Override
    public String getName() {
        return SHAPE_NAME;
    }

    @Override
    void errorMessage() {
        throw new IllegalArgumentException("선은 최소 2개의 점이 필요함.");
    }

}
