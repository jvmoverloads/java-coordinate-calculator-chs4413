package coordinate.domain;

public class Triangle extends Shape {

    private static final String SHAPE_NAME = "삼각형";
    private static final int POINT_NUMBER = 3;

    public Triangle(Points points) {
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
        throw new IllegalArgumentException("삼각형은 최소 3개의 점이 필요합니다.");
    }

}
