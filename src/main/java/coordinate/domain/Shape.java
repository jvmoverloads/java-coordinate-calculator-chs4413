package coordinate.domain;

public abstract class Shape implements Calculatable {
    protected final Points points;

    public Shape(Points points, int pointNumber) {
        if (points.getPoints().size() != pointNumber)
            errorMessage();

        this.points = points;
    }

    abstract void errorMessage();

    public Points getPoints() {
        return points;
    }
}
