package shapes;
import colors.Color;
public class Point extends Shape{
    private double X;
    private double Y;
    public Point(){
        X = 0;
        Y = 0;
    }
    public Point(double X, double Y){
        this.X = X;
        this.Y = Y;
    }

    public double getX(){
        return X;
    }
    public double getY(){
        return Y;
    }
    public void setX(double X){
        this.X = X;
    }
    public void setY(double Y){
        this.Y = Y;
    }

    public static double distance(Point point1, Point point2){
        return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
    }
    @Override
    public void move(double X, double Y) {
        this.X += X;
        this.Y += Y;
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
        System.out.println("Фигура: Точка");
        System.out.println("Координаты точки: (" + X + ", " + Y + ")");
        System.out.println("Цвет точки: " + getColor());
    }
}
