package coordinate.domain;

public class Point {
    private final int x;
    private final int y;

    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 24;

    public Point(int x, int y) {
        checkRange(x, y);
        this.x = x;
        this.y = y;
    }

    private void checkRange(int x, int y) {
        if (x < MIN_VALUE || x > MAX_VALUE)
            throw new IllegalArgumentException("잘못된 좌표 값");
        if (y < MIN_VALUE || y > MAX_VALUE)
            throw new IllegalArgumentException("잘못된 좌표 값");
    }

    // 피타고라스 정리 a^2 + b^2 = c^2(빗변)
    // ex. (2, 4), (5, 8)
    // -> x축 차이(길이): 3(5-2)
    // -> y축 차이(길이): 4(8-4)
    // -> 3^2 + 4^2 = x^2 -> 9 + 16 = 25(5^2)
    // answer: 5
    public double getInstance(Point point) {
        int x = point.getX();
        int y = point.getY();

        return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }
}
