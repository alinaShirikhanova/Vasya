package lesson15;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(0.1, "black", 4);
        shapes[1] = new Square(0.1, "black", 4);
        shapes[2] = new Square(0.1, "black", 4);
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }

//        Shape shape = new Shape();


    }
}
