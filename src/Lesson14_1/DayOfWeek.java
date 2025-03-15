package Lesson14_1;

public class DayOfWeek {
    String name;
    static final DayOfWeek MONDAY = new DayOfWeek("Monday");
    static final DayOfWeek TUESDAY = new DayOfWeek("Tuesday");
//    static final DayOfWeek monday = new DayOfWeek("Monday");
//    static final DayOfWeek monday = new DayOfWeek("Monday");
//    static final DayOfWeek monday = new DayOfWeek("Monday");
//    static final DayOfWeek monday = new DayOfWeek("Monday");

    private DayOfWeek(String name) {
        this.name = name;
    }
}
