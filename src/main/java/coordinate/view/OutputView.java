package coordinate.view;

public class OutputView {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 24;

    public static void printXY() {
        printY();
        printX();
        printXNumber();
    }

    private static void printY() {
        for (int i = MAX_VALUE; i >= MIN_VALUE; i--)
            printYEvenNumber(i);
    }

    private static void printX() {
        System.out.print("  +");
        for (int i = 0; i < MAX_VALUE; i++) {
            System.out.print("--");
        }
        System.out.println();
    }

    private static void printXNumber() {
        System.out.print("   0");
        for (int i = 1; i <= MAX_VALUE; i++) {
            printXEvenNumber(i);
        }
    }

    private static void printYEvenNumber(int i) {
        if (isEven(i)) {
            System.out.println(String.format("%2d|", i));
            return;
        }

        System.out.println("  |");
    }

    private static void printXEvenNumber(int i) {
        if (isEven(i))
            System.out.print(String.format("%4d", i));
    }

    private static boolean isEven(int i) {
        return (i % 2 == 0);
    }
}
