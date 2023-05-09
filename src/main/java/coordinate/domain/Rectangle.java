package coordinate.domain;

public class Rectangle extends Shape {

    private static final String SHAPE_NAME = "사각형";
    private static final int POINT_NUMBER = 4;

    public Rectangle(Points points) {
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
        throw new IllegalArgumentException("사각형은 최소 4개의 점이 필요합니다.");
    }

}
