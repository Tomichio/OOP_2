package shapes;
import colors.Color;
public class Circle extends Shape{
    private Point point;
    private double radius;
    private void validate(double radius) throws Exception {
        if (radius <= 0) throw new java.lang.Exception("Радиус должен быть больше 0");
    }
    public Circle(){
        radius = 1;
        point = new Point();
    }
    public Circle(Point centre, double radius, Color color) throws Exception {
        this.validate(radius);
        this.point = centre;
        this.radius = radius;
        setColor(color);
    }
    public Circle(Point point, double radius) throws Exception {
        this.validate(radius);
        this.point = point;
        this.radius = radius;
    }

    public void setRadius(double radius) throws Exception {
        this.validate(radius);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public void move(double x, double y) {
        point.setX(point.getX() + x);
        point.setY(point.getY() + y);
    }

    @Override
    public double getSquare() {
        return Math.PI * this.radius * this.radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    @Override
    public void draw() {
        System.out.println("Фигура: Круг");
        System.out.println("Центр круга: (" + this.point.getX() + ", " + this.point.getY() + ")");
        System.out.println("Радиус круга: " + this.radius);
        System.out.println("Площадь круга: " + this.getSquare());
        System.out.println("Периметр круга: " + this.getPerimeter());
        System.out.println("Цвет круга: " + getColor());
    }
}
