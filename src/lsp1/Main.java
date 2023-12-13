package lsp1;

import lsp1.shape.Quadrilateral;
import lsp1.shape.Rectangle;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.setSideA(10);
        Square square = new Square(5);
        System.out.printf("In a rectangle side A = %d, side B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        System.out.printf("In a rectangle side A = %d\n", square.getSide());
        System.out.printf("In a rectangle side getArea = %d\n", square.getArea());
        ShapeView view = new ShapeView(rectangle);
        view.showArea();
    }
}
