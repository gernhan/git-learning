package oop.abstraction;

// DatabaseConnection.java
public interface DatabaseConnection {
    // Abstract methods
    void connect();
    void query(String sql);
    public static void main(String[] args) {
        // Abstraction usage
        DatabaseConnection connection = new MySqlConnection();
        connection.connect();
        connection.query("SELECT * FROM users");
    }
}
