package oop;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("pebble", "black");
        System.out.println(dog1.name);
        dog1.pet();
    }
}
