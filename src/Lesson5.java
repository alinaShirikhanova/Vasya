import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        //        Пользователь вводит числа до тех пор,
        //        пока не будет введен 0. Посчитать кол-во введенных чисел
//        int number = sc.nextInt();
//        int counter = 0;
//
//        while (number != 0) {
//            counter++;
//            number = sc.nextInt();
//        }
//        System.out.println(++counter);

//        int a = 10;
//        int b = 12;
//        int c = 14;
//
//        int max = Integer.MIN_VALUE;
//
//        if (a > max){
//            max = a;
//        }
//        if (b > max){
//           max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println(max);
        Scanner sc = new Scanner(System.in);
//        int rost = sc.nextInt();
//        int max = 0;
//        int min = 400;
//        while (rost != 0) {
//            if (rost > max) {
//                max = rost;
//            }
//            if (rost < min) {
//                min = rost;
//            }
//            rost = sc.nextInt();
//        }
//        System.out.println(max + " " + min);

//        1 способ

        String pass1 = sc.nextLine();
        String pass2 = sc.nextLine();

        while (pass1.length() < 8 || !pass1.equals(pass2)){
//            System.out.println(говорим, что не так);
//            pass1 = sc.nextLine();
//            pass2 = sc.nextLine();
        }
    }

    public static int rangeSum(int[] arr, int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
