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
    public Circle(Point point, double radius) throws Exception {
        this.validate(radius);
        this.point = point;
        this.radius = radius;
    }

    public void setRadius(double radius) throws Exception {
        this.validate(radius);
        this.radius = radius;
    }
    @Override
    public void move(double x, double y) {
        point.setX(point.getX() + x);
        point.setY(point.getY() + y);
    }

    @Override
    public double getArea() {
        return 0;
    }
    @Override
    public double getPerimeter() {
        return 0;
    }
    @Override
    public void draw() {

    }
}
