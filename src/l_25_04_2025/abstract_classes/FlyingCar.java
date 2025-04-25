package l_25_04_2025.abstract_classes;

class Car {
}

public class FlyingCar extends Car implements Flyable, Movable {
    public void breakUp() {
        System.out.println("Это метод работает одинаково у всех, но с маленьким");
    }

    @Override
    public void fly() {
        // реализация
    }

    @Override
    public void move() {
        // реализация
    }
}

interface Flyable {
    default void breakUp() {
        System.out.println("Это метод работает одинаково у всех");
    }

    static void someMethod() {
        System.out.println("Какая-то реализация");
    }

    void fly();
}

interface Movable {
    void move();
}


interface Calculator {
    default int sum(int a, int b){
        return a + b;
    }

    default int sum(int a, int b, int c){
        return a + b + c;
    }

    private int sumAll(int ... values){
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }
}