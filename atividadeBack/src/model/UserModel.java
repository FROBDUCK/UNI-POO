package model;

public class UserModel {
    private String username;
    private String password;
    private short age;
    private long id;

    public UserModel(long id, String username, String password, short age){
        this.id = id;
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

    public short getAge() {
        return age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return id + " - " + username;
    }
}
