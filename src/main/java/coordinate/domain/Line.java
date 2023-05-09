package coordinate.domain;

public class Line extends Shape {

    private static final String SHAPE_NAME = "선";
    private static final int POINT_NUMBER = 2;

    public Line(Points points) {
        super(points, POINT_NUMBER);
    }

    @Override
    public double calculateDistance() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
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
