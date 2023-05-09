package coordinate;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coordinate.domain.Point;
import coordinate.domain.Points;
import coordinate.domain.Triangle;

public class TriangleTest {

    @Test
    @DisplayName("삼각형 유효성 검사 실패 테스트")
    void test() {
        Point point = new Point(10, 3);
        Points points = new Points(Arrays.asList(point));

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Triangle(points))
                .withMessage("삼각형은 최소 3개의 점이 필요합니다.");
    }
}
