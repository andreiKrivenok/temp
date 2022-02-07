package day9.Task2;

public class Rectangle extends Figure {

    private double width;
    private double length;

    public Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double area() {
        return (width * length);
    }

    public double perimeter() {
        return ((width + length) * 2);
    }
}
