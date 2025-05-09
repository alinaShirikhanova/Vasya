import l_02_05_2025.Ex;

import java.sql.DriverManager;
import java.sql.SQLException;


import java.sql.DriverManager;
import java.sql.SQLException;
enum Coffee{
    BIG
}
public class Test {
    public static void main(String[] args) {

        try {
            DriverManager.getConnection("", "", "");
        } catch (SQLException e) {
            e.printStackTrace();

        }
        System.out.println("Hello");

    }
}
