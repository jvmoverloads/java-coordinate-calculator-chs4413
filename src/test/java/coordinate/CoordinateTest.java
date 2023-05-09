package coordinate;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coordinate.domain.Coordinate;

public class CoordinateTest {

    @Test
    @DisplayName("좌표 생성 테스트 - 성공")
    void test() {
        assertDoesNotThrow(() -> new Coordinate(1), "올바른 생성");
    }

    @Test
    @DisplayName("좌표 생성 테스트 - 실패")
    void test2() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Coordinate(25))
                .withMessage("좌표 입력 범위는 0 이상, 25 미만 입니다.");
    }
}
