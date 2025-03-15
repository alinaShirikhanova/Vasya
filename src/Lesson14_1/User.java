package Lesson14_1;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        if (login.length() >= 8)
            this.login = login;
        if (password.length() >= 8)
            this.password = password;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public void setLogin(String login){
        if (login.length() >= 8)
            this.login = login;
    }
    
    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        }
    }
}
