package view;

import coordinate.domain.CoordinateLine;
import coordinate.domain.CoordinateLines;
import coordinate.domain.Result;

import java.util.List;

public class OutputView {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 24;

    public static void printResult(Result result) {
        System.out.println(result.getShapeName() + result.getResultType() + "는 " + result.getResult());
    }

    public static void printCoordinateLines(CoordinateLines coordinateLines) {
        List<CoordinateLine> lines = coordinateLines.getCoordinateLines();

        for (int i = MAX_VALUE; i >= MIN_VALUE; i--) {
            printCoordinateLine(lines, i);
        }

        printXAxis();
        printXAxisNumber();
        System.out.println();
    }

    private static void printCoordinateLine(List<CoordinateLine> lines, int i) {
        if (checkYAxisMarkingLine(lines, i)) {
            return;
        }

        System.out.println("  " + "|" + lines.get(i).printLine());
    }

    private static boolean checkYAxisMarkingLine(List<CoordinateLine> lines, int i) {
        if (i % 2 == 0) {
            System.out.println(String.format("%2d|", i) + lines.get(i).printLine());
            return true;
        }
        return false;
    }

    private static void printXAxis() {
        System.out.print("  +");
        printDash();
        System.out.println();
    }

    private static void printDash() {
        for (int j = 0; j < MAX_VALUE; j++) {
            System.out.print("--");
        }
    }

    private static void printXAxisNumber() {
        System.out.print("   0");
        for (int i = 1; i <= MAX_VALUE; i++) {
            checkEvenXAxis(i);
        }
    }

    private static void checkEvenXAxis(int i) {
        if (i % 2 == 0) {
            System.out.printf("%4d", i);
        }
    }
}
