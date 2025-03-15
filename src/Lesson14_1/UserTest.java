package Lesson14_1;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("1", "1");
//        user.login = "1";
//        user.password = "1";

//        System.out.println(user.login);
//        System.out.println(user.password);
        System.out.println(user.getLogin());
        user.setLogin("1");
    }
}
