package l_16_05_2025.enums2;

public class EnumDemo {
    public static void main(String[] args) {
        Season winter1 = Season.WINTER;
        Season winter2 = Season.WINTER;
        Season spring = Season.SPRING;
        System.out.println(spring.getWeather());


//        System.out.println(winter1 == winter2);
//
//        System.out.println(spring.name());
//        System.out.println(spring.ordinal());
        System.out.println(spring.compareTo(winter1));
//        Season[] values = Season.values();
//        for (Season value : values) {
//            System.out.println(value);
//        }
//        Season season = Season.valueOf("WINTER");



    }

    private static String getMessage(Season season) {
//        if (season == Season.WINTER){
//            return "Холодно";
//        }
        switch (season) {
            case WINTER -> {
                return "Холодно";
            }
            case SPRING -> {
                return "Тепло";
            }
            case SUMMER -> {
                return "Жарко";
            }
            case AUTUMN -> {
                return "Мокро";
            }
            default -> {
                return "Некорретно";
            }
        }
    }
}

class User {
    String name;
    Role role;
}
enum Role{
    USER, ADMIN
}