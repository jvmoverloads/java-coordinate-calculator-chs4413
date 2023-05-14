package coordinate.domain;

import java.util.Objects;

public class Coordinate {
    private static final int MIN_BOUNDARY = 0;
    private static final int MAX_BOUNDARY = 24;

    private final int coordinate;

    public Coordinate(int coordinate) {
        if (coordinate < MIN_BOUNDARY || coordinate > MAX_BOUNDARY)
            throw new IllegalArgumentException("좌표 입력 범위는 0 ~ 24 사이의 자연수 입니다.");
        this.coordinate = coordinate;
    }

    public int getCoordinate() {
        return coordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Coordinate that = (Coordinate) o;

        return coordinate == that.coordinate;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coordinate);
    }

}
