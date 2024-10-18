package shapes;

import colors.Color;

public abstract class Shape {
    private Color color = Color.TRANSPARENT;

    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public abstract void move(double x, double y);
    public abstract double getSquare();
    public abstract double getPerimeter();
    public abstract void draw();
}
