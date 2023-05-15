package coordinate.domain;

public class Result {

    private final String shapeName;
    private final String resultType;
    private final double result;

    public Result(final String shapeName, final String resultType, final double result) {
        this.shapeName = shapeName;
        this.resultType = resultType;
        this.result = result;
    }

    public String getShapeName() {
        return shapeName;
    }

    public String getResultType() {
        return resultType;
    }

    public double getResult() {
        return result;
    }
}
