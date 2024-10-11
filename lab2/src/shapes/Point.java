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

    @Override
    public void move(double x, double y) {
        this.X += x;
        this.Y += y;
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
       System.out.println("Point shape");
       System.out.println("Point centre: " + "(" + getX() + ";" + getY() + ")");
       System.out.println("Point color: " + getColor());
    }
}
