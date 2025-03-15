import java.util.Scanner;

public class Lesson8 {
    static void hello(){
        hello();
    }
    public static void main(String[] args) {
        hello();
        System.out.println(1 / 0);
//        1 способ
//        int[] array = {1, 2, 3, 4, 5, 6, 7};
//        String[] lines = {"Hello", "Hello"};
//        double[] doubles = new double[5];
//        boolean[] booleans = new boolean[5];
//        char[] chars = new char[5];
//        String[] strings = new String[5];
//        Scanner[] scanners = new Scanner[5];
//
        int[] ints;
        ints = new int[]{1, 2, 3, 4, 5, 6, 7};


//        int[] array = {1, 2, 3, 4, 5};
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
//        System.out.println(array[5]);
//        System.out.println(array[6]);

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        for each
        int[] array = {1, 2, 3, 4, 5};
        array[0] = 100;
        array[1] = 30;

        int[] numbers = new int[7];
        // Заполнить массив числами от 0 до 6
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        for (int elem : array) {
            System.out.println(elem);
        }

        String[] names = {"Вася", "Антон", "Петя"};

        for (String elem :names) {
            System.out.println(elem);
        }

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    }
}
