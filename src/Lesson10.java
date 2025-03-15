import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
//        if (true){
//            int a = 9;
//            {
//                System.out.println(a);
//            }
//        }
//            System.out.println(a);
        Scanner sc = new Scanner(System.in);
//        printCard(sc.nextLine(), sc.nextInt());
//        printCard(sc.nextInt(), sc.nextLine()); Ошибка
//        printCard();
//        Параметр - переменная, которая принимает переданные значения(аргументы)
//        Аргумент - передаваемое в метод значение
//        int x = sc.nextInt();
//        printNumberSquareCube(x);

//        int a = sc.nextInt();
//        int b = sc.nextInt();

//        int sumA = printSumOfDigits(a);
//        int sumB = printSumOfDigits(b);

//        if (sumA > sumB){
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }
//        if (printSumOfDigits(a) > printSumOfDigits(b)) {
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }

//        Принимает возраст и возращает true если человек взрослый


//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int cntA = countAmountOfDigits(a);
//        int cntB = countAmountOfDigits(b);
//        if (cntA > cntB) {
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }
//        if (countAmountOfDigits(a) > countAmountOfDigits(b)) {
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }


        int number = sc.nextInt();

//        int[] array = {1, 2, 3, 4, 5};
//        printPrimeNumbers(array);
//        printPrimeNumbers(new int[]{1, 2, 3, 4, 5});




    }

    // РЕализовать метод, принимающий массив целых чисел и печатающий простые числа из этого массива
    static void printPrimeNumbers(int[] array) {
        for (int i : array) {
            if (isPrime(i)) {
                System.out.println(i);
            }

        }
    }

    static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isAdult1(int age) {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isAdult2(int age) {
        if (age > 18) {
            return true;
        }
        return false;
    }

    static boolean isAdult3(int age) {
        return age > 18;
    }

    static int countAmountOfDigitsCorrect(int number) {
        int counter = 0;
        while (number > 0) {
            counter++;
            number /= 10;
            return counter; // разделится 1 раз и выполнение метода ОШИБКА
        }
        return 0;
    }
//    Ошибочный вариант
//    static int countAmountOfDigitsError(int number) {
//        int counter = 0;
//        while (number > 0) {
//            counter++;
//            number /= 10;
//            return counter; // разделится 1 раз и выполнение метода ОШИБКА
//        }
//        return 0;
//    }

    static int ex() {
        return 0;
//        int a = 8;
    }


    static int printSumOfDigits(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    static void printCard(String name, int age) {
        System.out.println("С днем рождения, " + name + "!" + "Тебе уже " + age + "лет!");
    }

    static void printNumberSquareCube(int x) {
        System.out.println("Квадрат числа: " + x * x);
        System.out.println("Куб числа: " + x * x * x);
    }
}
