package oop;

public class Example {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 4);
        System.out.println(rectangle.getArea());
        Rectangle rectangle2 = new Rectangle(6, 6);
        System.out.println(rectangle2.getArea());

        Engine engine = new Engine(12);
        Car car = new Car(engine, "BMW", 2000);
        Car car2 = new Car(new Engine(23), "BMW", 2000);
        System.out.println(car2.engine.power);
//        Car car3 = new Car();
//        System.out.println(car3.engine);
//        final double PI;
//        PI = 3.14;
//        int count =

//        int a;
//        System.out.println(a);


        Cat cat1 = new Cat("Пушистик", 10);
        Cat cat2 = new Cat("Пушистик", 10);
        Cat cat3 = new Cat("Пушистик", 10);
        Cat cat4 = new Cat("Пушистик", 10);
        System.out.println(Cat.counter);

        Square square01 = new Square(11);
        Square square02 = new Square(100);
        System.out.println(Square.counter);
//        System.out.println(Square.getCounter());
//        Math.random()
//        Square.getArea()


    }
}
//Создать класс Square. Хранить кол-во квадратов с площадью больше 10
