package coordinate.domain;

import java.util.Arrays;
import java.util.List;

public class Triangle extends Shape {

    private static final String SHAPE_NAME = "삼각형";
    private static final int POINT_NUMBER = 3;

    public Triangle(Points points) {
        super(points, POINT_NUMBER);
    }

    @Override
    public double calculateArea() {
        List<Double> distances = getDistances();

        // 헤론의 공식
        // s = a + b + c / 2
        // S(면적) = s(s-a)(s-b)(s-c)의 제곱근
        double a = distances.get(0);
        double b = distances.get(1);
        double c = distances.get(2);

        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    private List<Double> getDistances() {
        // 꼭지점
        List<Point> vertexes = points.getPoints();
        Point point1 = vertexes.get(0);
        Point point2 = vertexes.get(1);
        Point point3 = vertexes.get(2);

        // 각 꼭지점 간 거리 (빗변)
        double distance1 = point1.getDistance(point2);
        double distance2 = point1.getDistance(point3);
        double distance3 = point2.getDistance(point3);

        return Arrays.asList(distance1, distance2, distance3);
    }

    @Override
    public String getName() {
        return SHAPE_NAME;
    }

    @Override
    void errorMessage() {
        throw new IllegalArgumentException("삼각형은 최소 3개의 점이 필요합니다.");
    }

}
