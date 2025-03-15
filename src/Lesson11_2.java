import java.util.Arrays;
import java.util.Scanner;

public class Lesson11_2 {
    public static void main(String[] args) {
//        Значение
//        Ссылочное значение
//        int n = 7;
//        test(n);
//        int[] arr = {1, 2, 3, 4, 5};
//        test(arr);
//        System.out.println(arr[0]);
//
//        multiplyArray(arr);
//        printArray(arr);


//        printArray(1,2,3,4,5);

//        printElements(1, 2, 34, 5, 10, 10);
//        printElements(1);
        Scanner sc = new Scanner(System.in);
        printNames("Hello", "HEllo");
        String[] lines = {"Hello", "HEllo"};
        printNames(lines);



//Реализуйте метод, который увеличивает все значения массива в 2 раза
// Реализуйте метод, который печатает значения этого массива
    }

    static void printNames(String ... names) {
        for (String element : names) {
            System.out.println(element);
        }
    }

















    static void printElements(int... elements) {
        for (int elem : elements){
            System.out.println(elem);
        }
    }


    static void multiplyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }

    }

    static void test(int number) {
        number = 8;
    }

    static void test(int[] array) {
        array[0] = 10000;
    }

//    static void test(String line){
//        line[9] =
//    }
}
