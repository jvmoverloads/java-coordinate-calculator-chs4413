package coordinate.domain;

public abstract class Shape implements Calculatable {
    protected final Points points;

    public Shape(Points points, int pointNumber) {
        if (points.getSize() != pointNumber)
            errorMessage();

        this.points = points;
    }

    abstract void errorMessage();

    @Override
    public double calculateArea() {
        if (points.getSize() >= 3)
            return calculateArea();

        return 0;
    }

    @Override
    public double calculateDistance() {
        if (points.getSize() <= 2)
            return calculateDistance();

        return 0;
    }

    public Points getPoints() {
        return points;
    }
}
