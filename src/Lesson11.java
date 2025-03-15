public class Lesson11 {
    public static void main(String[] args) {
//        Overloading
//        Перегрузка



        printVisitCard("Вася", "911");
        printVisitCard(90, "911");
        printVisitCard("Вася", "911", "Разработчик");
    }

    static void printVisitCard(String name, String phone){
        System.out.println("-------------");
        System.out.println("Имя: " + name);
        System.out.println("Номер телефона: " + phone);
        System.out.println("-------------");
    }

    static void printVisitCard(int age, String profession){
        System.out.println("-------------");
        System.out.println("Возраст: " + age);
        System.out.println("Профессия: " + profession);
        System.out.println("-------------");
    }

    static void printVisitCard(String profession, int age){
        System.out.println("-------------");
        System.out.println("Возраст: " + age);
        System.out.println("Профессия: " + profession);
        System.out.println("-------------");
    }


    static void printVisitCard(String name, String phone, String profession){
        System.out.println("+++++++++++++++++++++");
        System.out.println("Имя: " + name);
        System.out.println("Номер телефона: " + phone);
        System.out.println("+++++++++++++++++++++++");
    }
}
