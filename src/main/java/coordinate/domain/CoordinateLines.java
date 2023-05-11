package coordinate.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoordinateLines {

    private final List<CoordinateLine> coordinateLines;

    public CoordinateLines(List<CoordinateLine> coordinateLines) {
        this.coordinateLines = coordinateLines;
    }

    public boolean isMarked(int x, int y) {
        return coordinateLines.get(y).isMarked(x);
    }

    public List<CoordinateLine> getCoordinateLines() {
        return coordinateLines;
    }

    public static CoordinateLines makeCoordinateLines(Points points) {
        List<CoordinateLine> coordinateLines = new ArrayList<>();

        for (int yAxis = 0; yAxis < 25; yAxis++) {
            coordinateLines.add(createLine(points, yAxis));
        }

        return new CoordinateLines(coordinateLines);
    }

    private static CoordinateLine createLine(Points points, int yAxis) {
        Boolean[] line = initLine();

        for (int i = 0; i < points.getSize(); i++) {
            Point point = points.getPoints().get(i);
            int x = point.getX();
            int y = point.getY();
            checkMark(yAxis, line, x, y);
        }

        return new CoordinateLine(Arrays.asList(line));
    }

    private static Boolean[] initLine() {
        Boolean[] line = new Boolean[25];
        Arrays.fill(line, false);
        return line;
    }

    private static void checkMark(int yAxis, Boolean[] line, int x, int y) {
        if (yAxis == y) {
            line[x] = true;
        }
    }
}
