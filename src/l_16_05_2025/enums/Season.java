package l_16_05_2025.enums;

import java.util.Enumeration;

public class Season {
    private String name;
    public static final Season WINTER = new Season("WINTER");
    public static final Season SPRING = new Season("SPRING");
    public static final Season SUMMER = new Season("SUMMER");
    public static final Season AUTUMN = new Season("AUTUMN");

    private Season(String name) {
        this.name = name;
    }
}
