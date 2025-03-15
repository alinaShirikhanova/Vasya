package oop;

public class Car {
    Engine engine;
    String brand;
    int year;
//    final Engine engine;
//    final String brand;
//    final int year;

    //    Car(String brand, int year) {
//        this.brand = brand;
//        this.year = year;
//    }
//
    public Car(Engine engine, String brand, final int year) {
        this.engine = engine;
        this.brand = brand;
        this.year = year;
    }

//    Car(){
//        this.engine = engine;
//        this.brand = brand;
//        this.year = year;
//    }

}
