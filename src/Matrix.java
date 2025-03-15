import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {





//        int[][] array = {
//                {1, 2, 3, 1},
//                {4, 5, 6, 1},
//                {7, 8, 9, 4, 6}
//        };
//        System.out.println(array[0][0]);
//        System.out.println(array[1][1] + "; " + array[2][0]);

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

//        int[][] array2 = new int[3][4];
//        array2[1] = new int[10];

//        Пользователь 2 числа (количество строк и количество столбцов)
//        Запонить массив числа от 1 до строки * столбцы
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//
//        int[][] arrayy = new int[x][y];
//        int number = 1;

//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                arrayy[i][j] = number++;
//            }
//        }

//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                System.out.print(arrayy[i][j] + " ");
//            }
//            System.out.println();
//        }

//        for (int[] arr : arrayy) {
//            for (int elem : arr){
//                System.out.print(elem + " ");
//            }
//            System.out.println();
//        }


//        for (int[] arr : arrayy) {
//            for (int elem : arr) {
//                System.out.print(elem + " ");
//            }
//            System.out.println();
//        }

//        Пользователь вводит кол-во строк и столбцов, а дальше значения массива
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);


        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.println(arr[j][i]);
            }
        }
    }
}
