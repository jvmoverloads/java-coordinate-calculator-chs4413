package coordinate.factory;

import coordinate.domain.*;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public enum ShapeFactory {
    LINE(2, Line::new),
    TRIANGLE(3, Triangle::new),
    RECTANGLE(4, Rectangle::new);
    private final int pointCount;
    private final Function<Points, Shape> function;

    ShapeFactory(int pointCount, Function<Points, Shape> function) {
        this.pointCount = pointCount;
        this.function = function;
    }

    public static void main(String[] args) {
        generateShapeByPoints(new Points(List.of(new Point(1, 2), new Point(2, 4))));

    }

    public static Shape generateShapeByPoints(Points points) {
        int pointCount = points.getSize();

        ShapeFactory shapeFactory = Arrays.stream(values())
                .filter(shape -> shape.pointCount == pointCount)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);

        return shapeFactory.function.apply(points);
    }
}
