package coordinate.view;

import coordinate.domain.Point;
import coordinate.domain.Points;
import coordinate.domain.Shape;
import coordinate.factory.ShapeFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String NATURAL_NUMBER = "[0-9][0-9]*";
    private static final String POINT = "\\((" + NATURAL_NUMBER + "," + NATURAL_NUMBER + ")\\)";
    private static final Pattern POINTS_PATTERN = Pattern.compile(POINT + "(?:-" + POINT + "){1,3}");

    public static Shape inputCoordinatePoints() {
        System.out.println("좌표를 입력해주세요.");
        try {
            String input = SCANNER.nextLine();
            Matcher matcher = POINTS_PATTERN.matcher(input);
            if (!matcher.find()) {
                throw new IllegalArgumentException("좌표 입력 형식이 맞지 않습니다");
            }

            return parseInput(input);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    private static Shape parseInput(String input) {
        List<Point> points = new ArrayList<>();
        String[] point = input.split("-");
        parseToPoints(points, point);

        return ShapeFactory.generateShapeByPoints(new Points(points));
    }

    private static void parseToPoints(List<Point> points, String[] point) {
        for (int i = 0; i < point.length; i++) {
            point[i] = point[i].replace("(", "");
            point[i] = point[i].replace(")", "");

            String[] numbers = point[i].split(",");
            points.add(new Point(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1])));
        }
    }
}
