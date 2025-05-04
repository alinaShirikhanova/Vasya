package l_02_05_2025;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) throws FileNotFoundException {
        divide(10, null);
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();

        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println();
            fileName = in.nextLine();
            readFile(fileName);
        }


//        try {
//            // соединение с БД
//            // работаю
//            // закрываю соединение
//        } catch (Exception ex) {
//
//        } finally {
//            System.out.println("Закрываем соединение");
//        }
//        test(null);

//        test1();
//        System.out.println("Hello");
    }

    private static void readFile(String filename) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filename);
    }

//    public static int ex(){
//        try {
//            return 7;
//        } catch (Exception e ){
//            return 9;
//        } finally {
//            return 10;
//        }
//    }

    private static void test(Integer n) {
        n.compareTo(10);
    }

    private static void divide(Integer a, Integer b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException ex) {
            System.out.println();
        } catch (NullPointerException ex) {
        } catch (Exception e) {

        }
//        try {
//            System.out.println(a / b);
//        } catch (ArithmeticException | NullPointerException ex) {
//            if (ex instanceof ArithmeticException) {
//                System.out.println("На 0 делить нельзя");
//            } else if (ex instanceof NullPointerException) {
//                System.out.println();
//            }
//            System.out.println("Некорректное значение");
//        }
//        catch (NullPointerException npe){
//            System.out.println("null - некорректное значение");
    }
//        System.out.println("Hello");


    public static void test1() {
        test2();
    }

    private static void test2() {
        System.out.println(1 / 0);
    }
}


