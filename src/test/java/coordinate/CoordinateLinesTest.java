package coordinate;

import coordinate.domain.CoordinateLine;
import coordinate.domain.CoordinateLines;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CoordinateLinesTest {

    @Test
    @DisplayName("좌표_평면_한_점_초기화(x,y)")
    void test() {
        Boolean[] line1 = new Boolean[25];
        Arrays.fill(line1, false);

        line1[20] = true;

        CoordinateLine coordinateLine = new CoordinateLine(Arrays.asList(line1));
        CoordinateLines coordinateLines
                = new CoordinateLines(List.of(coordinateLine));

        Assertions.assertThat(coordinateLines.isMarked(20,0)).isTrue();
        Assertions.assertThat(coordinateLines.isMarked(19,0)).isFalse();
    }

}
