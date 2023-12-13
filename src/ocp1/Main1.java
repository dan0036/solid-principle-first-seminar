package ocp1;

import logger.Log;
import ocp1.shape.Shape;
import ocp1.shape.impl.Rectangle;
import ocp1.shape.impl.RightTriangle;
import ocp1.shape.impl.Square;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main1 {
    private static final Logger log = Log.log(Main1.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Конфигурирование логера");
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        shapes.add(new Rectangle(4, 6));
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea += shape.getArea();
        }

        System.out.printf("Sum of areas equals %f \n", sumArea);
    }
}
