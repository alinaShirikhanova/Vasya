package lesson15;

import java.util.List;

public interface Animal {
    void sayHello();
    List
}

class Cat {
    public void sayHello() {
        System.out.println("Мяу");
    }
}


class Dog implements Animal {
    @Override
    public void sayHello() {
        System.out.println("Гав");
    }
}

class Main{
    public static void main(String[] args) {
        Animal animal = new Cat();
    }
}
