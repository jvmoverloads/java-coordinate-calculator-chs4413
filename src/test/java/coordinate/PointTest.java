package coordinate;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coordinate.domain.Point;

public class PointTest {

    @Test
    @DisplayName("포인트 생성 테스트 - 성공")
    void test() {
        int x = 0;
        int y = 0;

        assertDoesNotThrow(() -> new Point(x, y), "올바른 생성");
    }

    @Test
    @DisplayName("포인트 생성 테스트 - 실패")
    void test2() {
        int x = -1;
        int y = 25;

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Point(x, y))
                .withMessage("좌표 입력 범위는 0 ~ 24 사이의 자연수 입니다.");
    }
}
