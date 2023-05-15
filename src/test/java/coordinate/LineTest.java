package coordinate;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coordinate.domain.Line;
import coordinate.domain.Point;
import coordinate.domain.Points;

public class LineTest {

    @Test
    @DisplayName("선 유효성 검사 실패 테스트")
    void test() {
        Point point = new Point(10, 3);
        Points points = new Points(Arrays.asList(point));

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Line(points))
                .withMessage("선은 최소 2개의 점이 필요함.");
    }
}
