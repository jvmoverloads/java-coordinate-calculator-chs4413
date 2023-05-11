package coordinate.domain;

import java.util.*;

public class Rectangle extends Shape {

    private static final String SHAPE_NAME = "사각형";
    private static final int POINT_NUMBER = 4;

    public Rectangle(Points points) {
        super(points, POINT_NUMBER);
        validRectangle(points);
    }

    private void validRectangle(Points points) {
        // 직사각형 체크
        // 꼭지점 4 Point의 각 x, y 좌표들은 동일한 좌표값을 두개만 가질 수 있다.
        // ex. (2,4)-(2,6)-(4,4)-(4,6) -> xSet [2, 4] / ySet [4, 6]

        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();

        points.getPoints().stream().map(Point::getX).forEach(xSet::add);
        points.getPoints().stream().map(Point::getY).forEach(ySet::add);

        if (xSet.size() != 2 || ySet.size() != 2)
            throw new IllegalArgumentException("직사각형이 아닙니다.");
    }

    @Override
    public double calculateArea() {
        List<Double> distances = getDistances();

        return distances.get(0) * distances.get(1);
    }

    private List<Double> getDistances() {
        List<Point> vertexes = points.getPoints();

        Point point1 = vertexes.get(0);
        Point point2 = vertexes.get(1);
        Point point3 = vertexes.get(2);
        Point point4 = vertexes.get(3);

        // 각 꼭지점 간 거리 (빗변)
        double distance1 = point1.getDistance(point2);
        double distance2 = point1.getDistance(point3);
        double distance3 = point1.getDistance(point4);

        List<Double> list = Arrays.asList(distance1, distance2, distance3);
        Collections.sort(list);

        return list;
    }

    @Override
    public String getName() {
        return SHAPE_NAME;
    }

    @Override
    void errorMessage() {
        throw new IllegalArgumentException("사각형은 최소 4개의 점이 필요합니다.");
    }

}
