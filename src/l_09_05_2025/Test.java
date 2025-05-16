package l_09_05_2025;

import l_02_05_2025.FailSavingToDbException;
import l_02_05_2025.IncorrectDataException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
//        User user = new User("", "", 12);
//        System.out.println();
//        String correct = "0123456789";
//        String password = "jfjf";
//        for (String  sym : password.split("")) {
//           if (!correct.contains(sym)) {
//
//           }
//        }
        test();
        System.out.println("Hello");

//        try {
//            Connection connection = DriverManager.getConnection("", "", "");
//        } catch (SQLException e) {
//            FailSavingToDbException failSavingToDbException = new FailSavingToDbException(e);
//            System.out.println(failSavingToDbException.getCause());
//        }
    }
    public static void test(){
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ae){
//            ae.printStackTrace();
//            StackTraceElement[] stackTrace = ae.getStackTrace();
//            System.out.println(ae.getMessage());
        }
    }
}
