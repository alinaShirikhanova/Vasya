public class Lesson9_1 {
    public static void main(String[] args) {
        printHello();
        printNumbers();
        System.out.println("Вот и все");
    }

    static void printCard(){
        System.out.println("С днем рождения, Катя!");
    }

    static void printHello() {
        System.out.println("Hello");
    }
    
    static void printNumbers() {
//        Методы
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}



