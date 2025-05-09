package l_09_05_2025;

public class User {
    private String login;
    private String password;
    private int age;

    public User(String login, String password, int age) {
        if (login.length() < 8) {
            throw new IllegalArgumentException("Длина логина должна быть больше 7");
        }
        if (password.length() >= 8)
            throw new IllegalArgumentException("Длина пароля должна быть больше 7");
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
