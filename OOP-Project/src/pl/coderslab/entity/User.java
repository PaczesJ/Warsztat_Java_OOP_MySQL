package pl.coderslab.entity;

public class User {
    private int id;
    private String email;
    private String userName;
    private String password;

    public User() {
    }
    public User(String username, String email,  String password) {
        this.userName = username;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}