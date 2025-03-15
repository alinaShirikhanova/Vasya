package oop;

public class Cat {
    String name;
    int age;
    static int counter = 0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }

//    public Cat() {
//    }

    void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //    oop.Cat(String name1, int age1){
//        name = name1;
//        age = age1;
//    }
}
