package coordinate.factory;

import coordinate.domain.Result;
import coordinate.domain.Shape;

import java.util.Arrays;
import java.util.function.Function;

public enum ResultFactory {

    CAL_LENGTH("ONE_LINE", (Shape shape) -> new Result(shape.getName(), "길이", shape.calculateDistance())),
    CAL_AREA("MORE_THAN_TWO_LINES", (Shape shape) -> new Result(shape.getName(), "넓이", shape.calculateArea()));

    private final String shapeType;
    private final Function<Shape, Result> figureResultFunction;

    private static final String ONE_LINE = "ONE_LINE";
    private static final String MORE_THAN_TWO_LINES = "MORE_THAN_TWO_LINES";

    ResultFactory(String shapeType, Function<Shape, Result> figureResultFunction) {
        this.shapeType = shapeType;
        this.figureResultFunction = figureResultFunction;
    }

    public static Result createResult(Shape shape) {
        int size = shape.getPoints().getSize();

        ResultFactory resultFactory = Arrays.stream(values())
                .filter(result -> result.shapeType.equals(getResultTypeByPointNumbers(size)))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);

        return resultFactory.figureResultFunction.apply(shape);
    }

    private static String getResultTypeByPointNumbers(int shapePointNumbers) {
        if (shapePointNumbers == 2)
            return ONE_LINE;

        return MORE_THAN_TWO_LINES;
    }
}