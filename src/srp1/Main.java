package srp1;

import srp1.figure.*;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        CalculateArea area = shape -> {
            Square square1 = (Square) shape;
            return square1.getSide() * square1.getSide();
        };
        System.out.printf("Square area: %s \n", area.getArea(square));
        Paintable<Square> paintable = new SquarePainter();
        paintable.draw(square);
    }
}
