package User;

public class User {

    int id;
    String username;
    int password;

    public User(int id, String username, int password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User() {
        // Default constructor
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
