package lab3;

public class Rectangle extends Shape
{
    protected  double width;
    protected double length;
    public Rectangle(){
        this.filled = false;
        this.color = "blue";
        width = 2;
        length = 4;
    }
    public Rectangle(double width, double length ){
        this.length = length;
        this.width = width;
        this.filled = false;
        this.color = "blue";

    }
    public Rectangle (double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return(width + length)*2;
    }

    @Override
    public String toString() {
        return "Shape: rectangle: " + "width=" + width + ", length=" + length ;
    }
}
