package oop;

public class Rectangle {
    double width;
    double length;
    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    double getArea() {
        return width * length;
    }

}
