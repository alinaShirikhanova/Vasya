package lesson15;

public class Square extends Shape {
    private double length;

    public Square(double lineThickness, String lineColor, double length) {
        super(lineThickness, lineColor);
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
