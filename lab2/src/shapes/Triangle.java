package shapes;
import colors.Color;

public class Triangle extends Shape{
    private Point pointA = new Point();
    private Point pointB = new Point();
    private Point pointC = new Point();

    private void validate() throws Exception{
        if (getArea() == 0) throw new java.lang.Exception("Точки не должны располагаться на одной прямой");
    }

    public Triangle(){}
    public Triangle(Point point1, Point point2, Point point3, Color color) /*throws Exception*/{
        pointA = point1;
        pointB = point2;
        pointC = point3;
        //validate();
        setColor(color);
    }

    public Triangle(Point point1, Point point2, Point point3) /*throws Exception*/{
        pointA = point1;
        pointB = point2;
        pointC = point3;
        //validate();
    }

    public void setPointA(Point point){
        pointA = point;
    }

    public Point getPointA(){
        return pointA;
    }

    public void setPointB(Point point){
        pointB = point;
    }

    public Point getPointB(){
        return pointB;
    }

    public void setPointC(Point point){
        pointC = point;
    }

    public Point getPointC(){
        return pointC;
    }
    public void move(double x, double y){
        pointA.move(x, y);
        pointB.move(x, y);
        pointC.move(x, y);
    }

    public double getArea(){
        double p = getPerimeter() / 2;
        double dist1 = Point.distance(pointA, pointB);
        double dist2 = Point.distance(pointA, pointC);
        double dist3 = Point.distance(pointB, pointC);

        return Math.sqrt(p * (p - dist1) * (p - dist2) * (p - dist3));
    }

    public double getPerimeter(){
        double dist1 = Point.distance(pointA, pointB);
        double dist2 = Point.distance(pointA, pointC);
        double dist3 = Point.distance(pointB, pointC);

        return dist1 + dist2 + dist3;
    }

    public void draw(){
        System.out.println("Фигура: Треугольник");
        System.out.print("Противоположные вершины Треугольника: (" + pointA.getX() + ", " + pointA.getY() + "); ");
        System.out.println("(" + pointB.getX() + ", " + pointB.getY() + "); ");
        System.out.println("(" + pointC.getX() + ", " + pointC.getY() + "); ");
        System.out.println("Площадь Треугольника: " + this.getArea());
        System.out.println("Периметр Треугольника: " + this.getPerimeter());
        System.out.println("Цвет Треугольника: " + getColor());
    }
}
