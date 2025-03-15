package oop;

public class Dog {
    String name;
    String colour;
    public Dog(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    void pet(){
        System.out.println("bark!");
    }
}
