package Lesson14_1.inheritance;

public class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void drive(){
        System.out.println("Поехали на машине");
    }
    void stop(){
        System.out.print("stop ");
    }
}

