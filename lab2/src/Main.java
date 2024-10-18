import shapes.Point;
import shapes.Circle;
import colors.Color;

import service.impl.ShapesServiceImpl;
import shapes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Point point = new Point(2, 3);
        Circle circle = new Circle(point, 1);
        circle.move(2, 4);
        circle.setColor(Color.PURPLE);
        circle.draw();

        List<Shape> list = new ArrayList<>();
        list.add(new Triangle(new Point(0, 0), new Point(0, 4), new Point(4, 0), Color.RED));
        list.add(new Circle(new Point(3, 3), 2, Color.WHITE));
        list.add(new Circle(new Point(2, 5), 4, Color.YELLOW));
        list.add(new Rectangle(new Point(1, 1), new Point(5, 2)));
        list.add(new Point(100, 100));
        list.add(new Triangle(new Point(-2, 3), new Point(4, 3), new Point(2, 5), Color.BLUE));

        ShapesServiceImpl impl = new ShapesServiceImpl();

        System.out.println("Суммарная площадь всех фигур: " + impl.getSquares(list));
        System.out.println("Максимальный периметр всех фигур: " + impl.getMaxPerimeters(list));
        System.out.println("Все цвета фигур: " + impl.getColors(list));
    }
}