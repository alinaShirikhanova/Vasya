public class Lesson_12_1 {
    public static void main(String[] args) {
//        print(3);
//        System.out.println(getFactorial(4));
        String line = "Hello";
        System.out.println(sum(4));
    }

//    Вычислить сумму чисел от 1 до n
    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }


    static int getFactorial(int n) {
        if (n <= 1){
            return 1;
        }
        return n * getFactorial(n - 1);

    }


    static void print(int n) {
        if (n > 0) {
            print(n - 1);
            System.out.println(n);
        }
    }
}
