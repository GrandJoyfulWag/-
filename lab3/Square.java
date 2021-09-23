package lab3;

public class Square  extends  Rectangle{
    public Square() {
        this.color = "Black";
        this.filled = true;
        this.width = 3;
    }

    public Square(double side) {
        this.color = "White";
        this.filled = true;
        this.width = side;
    }

    public Square(String color, boolean filled, double side) {
        this.color = color;
        this.filled = filled;
        this.width = side;
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width*length);
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + this.width + ", color: " + this.color;
    }
}


