package l_23_05_2025;

import oop.Cat;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        User anton1 = new User(1, "anton123", "123");
        User anton2 = new User(1, "anton123", "123");
        System.out.println(anton1 == anton2);
        System.out.println(anton1.equals(anton2));

    }
}

class User {
    private int id;
    private String login;
    private String password;

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password);
    }
}
