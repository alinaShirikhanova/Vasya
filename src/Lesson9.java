import java.util.ArrayList;

public class Lesson9 {
    public static void main(String[] args) {
//        System.out.println(Integer.MIN_VALUE);

//        Byte b = 8;
//        Short s = 9;
        Integer i = 10;
        int i2 = 10;
        String string = "hello";
        System.out.println("hello");


//
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//
//        Integer i1 = Integer.valueOf("10");
//        int i2 = Integer.parseInt("10");
        int compare = Integer.compare(10, 9);

        System.out.println(compare);


        Integer x = 0;
        Integer t = 1;
        System.out.println();
        System.out.println(x.compareTo(t));

        System.out.println(Integer.valueOf("9"));
        System.out.println(Integer.parseInt("9"));

//        Long l = 90L;
//        System.out.println(l.compareTo(98L));

//        Double d = 90.0;
//        System.out.println(Double.valueOf("90.0"));

//        Boolean b = true;
//        System.out.println(Boolean.valueOf("true"));
//        System.out.println(b.compareTo(false));

//        System.out.println(Character.isAlphabetic('u'));
//        System.out.println(Character.isDigit('u'));
//        System.out.println(Character.isWhitespace(' '));
        Lesson9_1.printHello();



    }
}
