import shapes.Point;
import shapes.Circle;
import colors.Color;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        Circle circle = new Circle(point, 1);
        circle.move(2, 4);
        circle.setColor(Color.PURPLE);
        circle.draw();
    }
}