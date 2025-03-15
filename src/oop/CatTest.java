package oop;

public class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 10);
        System.out.println(cat.age);
        System.out.println(cat.name);
        cat.age = 10;
        cat.name = "Мурзик";
        cat.printInfo();
//        print();

        Cat cat2 = new Cat("Мурзик2", 12);
        cat2.printInfo();
//        oop.Cat cat2 = new oop.Cat();
//        System.out.println(cat.age);
//        System.out.println(cat.name);
//        cat2.age = 12;
//        cat2.name = "Пушистик";
//        int a;
//        System.out.println(a);
//        final Cat cat1 = new Cat("Пушистик", 23);
//        cat1.name = "Мурзик";
//        cat1 = new Cat("", 5);
    }
//    static void print(){
//
//    }
}
