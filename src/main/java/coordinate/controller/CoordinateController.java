package coordinate.controller;

import coordinate.domain.CoordinateLines;
import coordinate.domain.Result;
import coordinate.domain.Shape;
import coordinate.factory.ResultFactory;
import coordinate.view.InputView;
import coordinate.view.OutputView;

public class CoordinateController {

    public void start() {
        Shape shape = InputView.inputCoordinatePoints();
        CoordinateLines coordinateLines = CoordinateLines.makeCoordinateLines(shape.getPoints());
        OutputView.printCoordinateLines(coordinateLines);

        Result result = ResultFactory.createResult(shape);
        OutputView.printResult(result);
    }
}
