import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
//        for (int n = 1; n <= 100; n++) {
//            System.out.println(n);
//        }
//        System.out.println("End");
//
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (a % 2 == 1){
//            a++;
//        }

//        for (int i = a; i <= b; i += 2) {
//            System.out.println(i);
//        }

        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        for (int i = a; i <= b; i++) {
//            if (i % 10 % 2 != 0 && i / 10 % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//        for(int i = 10; i < 100; i++) {
//            if (((i % 10)*(i % 10) + (i / 10)*(i / 10)) % 13 == 0) {
//                System.out.println(i);
//            }
//        }
//        System.out.println(100^3);
//        int n = sc.nextInt();
//        for(int i = 10; i < 100; i++) {
//            if (i / 10 == n || i % 10 == n) {
//                System.out.println(i);
//            }
//        }

//        for (int h = 0; h < 24; h++) {
//            for (int m = 0; m < 60; m++) {
//                for (int s = 0; s < 60; s++) {
//                    System.out.println(h + " часов " + m + " минут " + s + " секунд");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
