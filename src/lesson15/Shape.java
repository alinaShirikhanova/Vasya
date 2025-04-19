package lesson15;

public abstract class Shape {
    private double lineThickness;
    private String lineColor;

    public Shape(double lineThickness, String lineColor) {
        this.lineThickness = lineThickness;
        this.lineColor = lineColor;
    }

    public abstract double getArea();
}
