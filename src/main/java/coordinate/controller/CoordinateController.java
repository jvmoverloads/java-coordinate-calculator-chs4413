package coordinate.controller;

import coordinate.domain.CoordinateLines;
import coordinate.domain.Result;
import coordinate.domain.Shape;
import coordinate.factory.ResultFactory;
import coordinate.view.InputView;
import coordinate.view.OutputView;

public class CoordinateController {

//    (2,4)-(5,10)-(4,16)
//    (2,4)-(2,8)-(6,4)-(6,8)

    public void start() {
        Shape shape = InputView.inputCoordinatePoints();
        CoordinateLines coordinateLines = CoordinateLines.makeCoordinateLines(shape.getPoints());
        OutputView.printCoordinateLines(coordinateLines);

        Result result = ResultFactory.createResult(shape);
        OutputView.printResult(result);
    }

}
