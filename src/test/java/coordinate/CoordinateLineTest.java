package coordinate;

import coordinate.domain.CoordinateLine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CoordinateLineTest {

    @Test
    @DisplayName("x축 좌표 마크 생성")
    void test() {
        Boolean[] line = new Boolean[25];
        line[20] = true;

        CoordinateLine coordinateLine = new CoordinateLine(Arrays.asList(line));

        assertThat(coordinateLine.isMarked(20)).isTrue();
    }
}
