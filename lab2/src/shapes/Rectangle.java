package shapes;
import colors.Color;
public class Rectangle extends Shape{
    private Point pointA = new Point();
    private Point pointB = new Point();

    private void validate() throws Exception{
        if (pointA.getX() == pointB.getX() || pointA.getY() == pointB.getY()) throw new java.lang.Exception("Неверные координаты точки");
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointA(){
        return pointA;
    }
    public void setPointB(Point pointA) {
        this.pointA = pointA;
    }
    public Point getPointB(){
        return pointB;
    }

    public Rectangle(){}

    public Rectangle(Point point1, Point point2, Color color) /*throws Exception*/ {
        pointA = point1;
        pointB = point2;
        //validate();
        setColor(color);
    }

    public Rectangle(Point point1, Point point2) /*throws Exception*/ {
        pointA = point1;
        pointB = point2;
        //validate();
    }

    @Override
    public void move(double x, double y){
        pointA.move(x, y);
        pointB.move(x, y);
    }

    @Override
    public double getSquare(){
        return Math.abs((pointA.getX() - pointB.getX()) * (pointA.getY() - pointB.getY()));
    }

    @Override
    public double getPerimeter(){
        return 2 * (Math.abs(pointA.getX() - pointB.getX()) + Math.abs(pointA.getY() - pointB.getY()));
    }

    @Override
    public void draw(){
        System.out.println("Фигура: Прямоугольник");
        System.out.print("Противоположные вершины прямоугольника: (" + pointA.getX() + ", " + pointA.getY() + "); ");
        System.out.println("(" + pointB.getX() + ", " + pointB.getY() + ")");
        System.out.println("Площадь прямоугольника: " + this.getSquare());
        System.out.println("Периметр прямоугольника: " + this.getPerimeter());
        System.out.println("Цвет прямоугольника: " + getColor());
    }
}
