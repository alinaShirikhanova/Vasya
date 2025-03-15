import java.util.Collections;
import java.util.Scanner;

public class Lesson13_1 {
    public static void main(String[] args) {
        String line = "Hello world";
        System.out.println(line.length());
        System.out.println(line.charAt(0));

//        Пользователь вводит строку. Распечатать строку наоборот
        String lineReversed = "";
        for (int i = 0; i < line.length(); i++) {
            lineReversed += line.charAt(line.length() - 1 - i);
        }

        String str = "Hello world!";
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 6));


//        Пользователь вводит строку. Распечатать строку без первого и последнего символов
        Scanner sc = new Scanner(System.in);
//        String line1 = sc.nextLine();
//        System.out.println(line1.substring(1, line1.length() - 1));

//        String str2 = "Hello";
//        System.out.println(str2.indexOf("l", 3));
//        System.out.println(str2.lastIndexOf('l'));
//        System.out.println(str2.contains("ell"));


//        Вывести 0 раз, если символ встречается 0 раз
//        Вывести 1 раз, если символ встречается 1 раз
//        Вывести 2 или более раз, если символ встречается 2 раза и более
//        String str2 = sc.nextLine();
//        if (str2.indexOf('a') == -1) {
//            System.out.println(0);
//        } else if (str2.indexOf('a') != str2.lastIndexOf('a')) {
//            System.out.println("2 раза или более");
//
//        } else {
//            System.out.println("1 раз");
//        }

        String line1 = "hello1";
        String line2 = "Hello1";
        System.out.println(line1.toUpperCase());
        System.out.println(line1.toLowerCase());


//        Вывести Yes, если все символы строки в верхнем и No в противном случае
        if (line1.equals(line1.toUpperCase())) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

//        System.out.println(line1.equals(line2));
//        System.out.println(line1.equalsIgnoreCase(line2));

//        System.out.println(line1.compareTo(line2));


//        System.out.println(line.toUpperCase());
//        System.out.println(line);
        String str3 = "abcaaaaa";
        System.out.println(str3.replace('a', 'b'));
        System.out.println(str3.replace("abc", "ttt"));

        String line5 = "Hellomydearfriends";
        String date = "2022-02-10";
        String[] split = line5.split("-");
        


    }
}
