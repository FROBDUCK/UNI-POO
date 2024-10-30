package model;

public class UserModel {
    private String username;
    private String password;
    short age;

    public UserModel(String username, String password, short age){
        this.username=username;
        this.password=password;
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
