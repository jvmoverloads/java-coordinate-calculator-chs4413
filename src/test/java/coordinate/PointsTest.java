package coordinate;

import coordinate.domain.Point;
import coordinate.domain.Points;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PointsTest {

    @Test
    @DisplayName("포인트 초기화")
    void test() {
        Points points = new Points(List.of(new Point(2, 4), new Point(6, 8)));

        assertThat(points.getPoints()).isEqualTo(List.of(new Point(2, 4), new Point(6, 8)));
    }

    @Test
    @DisplayName("좌표는 중복될 수 없다.")
    void test2() {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> new Points(
                List.of(
                        new Point(3, 3),
                        new Point(3, 3),
                        new Point(5, 5)
                )
        )).withMessage("좌표 중복");
    }
}
