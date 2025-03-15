public class Lesson11_3 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("hello");
        print(1);
        print(2);
//        base case - базовый случай - условие выхода
    }

    static void print(int n) {
        if (n < 4) {
            System.out.println("Hello");
            print(n + 1);
        }
    }
}
