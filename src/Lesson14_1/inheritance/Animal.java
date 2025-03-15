package Lesson14_1.inheritance;

public class Animal {
    String species;
    int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    void breathe(){
        System.out.println("Животное дышит");
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String species, int age, String breed) {
        super(species, age);
        this.breed = breed;
    }

//    public Dog(String breed, String species, int age) {
//        this.breed = breed;
//        this.age = age;
//        this.species = species;
//    }
}

